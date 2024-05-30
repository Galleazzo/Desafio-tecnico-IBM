import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Client } from 'src/app/model/Clients';
import { ClientService } from 'src/app/service/client.service';

@Component({
  selector: 'app-client-form',
  templateUrl: './client-form.component.html',
  styleUrls: ['./client-form.component.css']
})
export class ClientFormComponent implements OnInit{

  client: Client = new Client();

  constructor(private clientService: ClientService, private route: ActivatedRoute, private router: Router) {}

  ngOnInit(): void {}


  saveClient(): void {
    this.clientService.save(this.client).subscribe(() => {
      this.router.navigate(['/client']);
    });
  }

  cancel() {
    this.router.navigate(['/client']);
  }
}
