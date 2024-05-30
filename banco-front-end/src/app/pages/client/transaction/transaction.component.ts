import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Transaction, TransactionType } from 'src/app/model/Transaction';
import { TransactionService } from 'src/app/service/transaction.service';

@Component({
  selector: 'app-transaction',
  templateUrl: './transaction.component.html',
  styleUrls: ['./transaction.component.css']
})
export class TransactionComponent implements OnInit {
  clientId!: any;
  transactions: Transaction[] = [];
  newTransaction: Transaction = new Transaction();
  saldoTotal: number = 0;
  transactionTypes = TransactionType;

  constructor(
    private transactionService: TransactionService,
    private route: ActivatedRoute,
    private router: Router
  ) {
    this.newTransaction.type = TransactionType.CREDIT; 
  }

  ngOnInit(): void {
    this.clientId = this.route.snapshot.paramMap.get('id');
    var y: number = +this.clientId;
    this.newTransaction.clientId = y;
    this.loadTransactions();
  }

  loadTransactions(): void {
    this.transactionService.getTransactions(this.clientId).subscribe(data => {
      this.transactions = data;
      this.calculateSaldoTotal();
    });
  }

  calculateSaldoTotal(): void {
    this.saldoTotal = this.transactions.reduce((total, transaction) => {
      return transaction.type === TransactionType.CREDIT ? total + transaction.value : total - transaction.value;
    }, 0);
  }

  backToList(): void {
    this.router.navigate(['/client']);
  }

  createTransaction(): void {
    debugger
    this.transactionService.createTransaction(this.newTransaction).subscribe(() => {
      this.loadTransactions();
      this.newTransaction = new Transaction();
      this.newTransaction.type = TransactionType.CREDIT;
      this.newTransaction.clientId = this.clientId;
    });
  }
}
