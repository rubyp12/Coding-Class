import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {Routes, RouterModule} from '@angular/router';
import { AppComponent } from '../app.component';
import { HomeComponent } from '../home/home.component';
import { AboutComponent } from '../about/about.component';
import { ShopItemComponent } from '../shop-item/shop-item.component';
import { ProductListComponent } from '../product-list/product-list.component';
import { LoginComponent } from '../login/login.component';
import { RegisterComponent } from '../register/register.component';

const appRoutes: Routes = [
  {path: 'home', component: HomeComponent},
  {path: 'about', component: AboutComponent},
  {path: 'shopitem', component: ShopItemComponent},
  {path: 'productlist', component: ProductListComponent},
  {path: 'login', component: LoginComponent},
  {path: 'register:', component: RegisterComponent}
];

@NgModule({
  declarations: [],
  imports: [RouterModule.forRoot(appRoutes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
