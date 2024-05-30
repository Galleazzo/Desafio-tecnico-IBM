import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Transaction } from '../model/Transaction';

@Injectable({
  providedIn: 'root'
})
export class TransactionService {
  private url = 'http://localhost:8080';

  constructor(private http: HttpClient) {}

  getTransactions(clienteId: number): Observable<Transaction[]> {
    return this.http.get<Transaction[]>(`${this.url}/transaction/getByClientId/${clienteId}`);
  }

  createTransaction(transaction: Transaction): Observable<Transaction> {
    return this.http.post<Transaction>(this.url, transaction);
  }
}
