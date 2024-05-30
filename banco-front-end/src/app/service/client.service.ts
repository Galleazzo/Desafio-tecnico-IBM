import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Client } from '../model/Clients';

@Injectable({
  providedIn: 'root'
})
export class ClientService {
  private url = 'http://localhost:8080';

  constructor(private http: HttpClient) {}

  getAllClients(): Observable<Client[]> {
    return this.http.get<Client[]>(this.url + "/client");
  }

  save(cliente: Client): Observable<Client> {
    return this.http.post<Client>(this.url + "/client", cliente);
  }

}
