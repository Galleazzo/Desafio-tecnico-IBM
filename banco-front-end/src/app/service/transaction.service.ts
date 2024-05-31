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

  getTransactions(clienteId: any): Observable<any[]> {
    return this.http.get<any[]>(`${this.url}/transaction/getByClientId?id=${clienteId}`);
  }

  createTransaction(transaction: any): Observable<any> {
    return this.http.post<any>(this.url + "/transaction", transaction);
  }
}
