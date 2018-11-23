import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { ShoppingItemComponent } from './shopping-item/shopping-item.component';
import { LogOutComponent } from './log-out/log-out.component';
import { AboutComponent } from './about/about.component';
import { HomeComponent } from './home/home.component';
import { ProductListComponent } from './product-list/product-list.component';
import { RegisterComponent } from './register/register.component';

const routes: Routes = [
  {path: 'LoginComponent',component:LoginComponent},    
  {path:'Home',component:HomeComponent},
  {path:'AboutComponent',component:AboutComponent},
  {path:'LogOutComponent',component:LogOutComponent},
  {path:'ProductListComponent',component:ProductListComponent},
  {path:'RegisterComponent',component:RegisterComponent},
  {path:'ShoppingItemComponent',component:ShoppingItemComponent}, 
  {path: '**',component:PageNotFoundComponent},
  {path: '',redirectTo:'/home',pathMatch: 'full'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
