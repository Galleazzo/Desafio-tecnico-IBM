import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Client } from 'src/app/model/Clients';
import { ClientService } from 'src/app/service/client.service';

@Component({
  selector: 'app-client-list',
  templateUrl: './client-list.component.html',
  styleUrls: ['./client-list.component.css']
})
export class ClientListComponent implements OnInit {
  clients: Client[] = [];

  constructor(private clientService: ClientService, private router: Router) {}

  ngOnInit(): void {
    this.getAllClients();
  }

  getAllClients() {
    this.clientService.getAllClients().subscribe((result: any) => {
      this.clients = result;
    });
  }

  editCliente(id: any) {

  }

  transactiones(id: any) {
    this.router.navigate(['/client/transactions', id]);
  }

  addCliente() {
    this.router.navigate(['/client/new']);
  }
}
