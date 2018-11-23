import { Component, OnInit } from '@angular/core';
import { Item } from '../model/Item';
import { ShoppingItemsDataService } from '../services/shopping-items-data.service';
import { NgForm } from '@angular/Forms';

@Component({
  selector: 'app-shopping-item',
  templateUrl: './shopping-item.component.html',
  styleUrls: ['./shopping-item.component.css']
})
export class ShoppingItemComponent implements OnInit {
  
  items:Item[]=[];
  
  constructor() {

   }

  ngOnInit() {
  }


  addItems(frm:NgForm) {
    let item :Item = {
      name:frm.value.name,
      quantity:frm.value.quantity   
    }
    
    this.items.push(item);
  }


 
}
