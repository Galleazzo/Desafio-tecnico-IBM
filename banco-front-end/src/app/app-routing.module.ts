import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ClientListComponent } from './pages/client/client-list/client-list.component';
import { ClientFormComponent } from './pages/client/client-form/client-form.component';
import { TransactionComponent } from './pages/client/transaction/transaction.component';


const routes: Routes = [
  { path: '', redirectTo: '/client', pathMatch: 'full' },
  { path: 'client', component: ClientListComponent },
  { path: 'client/new', component: ClientFormComponent },
  { path: 'client/edit/:id', component: ClientFormComponent },
  { path: 'client/transactions/:id', component: TransactionComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
