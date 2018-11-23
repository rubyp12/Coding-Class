import { Injectable } from '@angular/core';
import { HttpClient } from 'selenium-webdriver/http';

@Injectable({
  providedIn: 'root'
})
export class ShoppingItemsDataService {
  items: any;
  constructor(private http:HttpClient) { }

  // getshoppingitems() 
  // {
  //   return this.http.get('http://localhost:3000/posts');
  // }

  // addShoppingItems(addItem) 
  // {
  //   return this.http.post('http://localhost:3000/posts',addItem);
  // }

  // updateShoppingItems(newitem) {
  //   return this.http.put('http://localhost:3000/posts/'+ newitem.id,newitem);
  // }

  // deleteShoppingItems(id) {
  //   return this.http.delete('http://localhost:3000/posts/'+ id)
  // }
}
