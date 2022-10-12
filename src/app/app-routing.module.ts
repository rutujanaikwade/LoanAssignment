import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { LoanComponent } from './loan/loan.component';
import { PyamentComponent } from './pyament/pyament.component';

const routes: Routes = [
  {
    path:"",component:HomeComponent
  },
  {
    path:"loan",component:LoanComponent
  },
  {
    path:"Payment",component:PyamentComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
