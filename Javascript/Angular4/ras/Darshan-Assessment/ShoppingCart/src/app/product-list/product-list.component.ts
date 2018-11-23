import { Component, OnInit } from '@angular/core';
import { Item } from '../model/Item';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {

  constructor() { }

  

  ShoppingItem :Item[]  = [
    {
      id :1,
      name : 'Nokia  5800',
      price : '15,000.00',            
      photoPath:'assets/images/Nokia5280.jpg'
       },
       {
        id :2,
        name : 'Razor 4',
        price : '18,000.00',              
        photoPath:'assets/images/Razor4.jpg'
        },
        {
          id :3,
          name : 'Samsung8',
          price : '20,000.00',                
          photoPath:'assets/images/Samsung8.jpg'
        },
        {
          id:4,
          name : 'Vivo7',
          price : '22,000.00',                
          photoPath:'assets/images/Vivo7.jpg'
        },
        
        {
          id:5,
          name : 'RedMi',
          price : '10,000.00',                
          photoPath:'assets/images/RedMi.jpg'
        },

        {
          id:5,
          name : 'Mi',
          price : '12,000.00',                
          photoPath:'assets/images/MI.jpg'
        }

        
  ];

  ngOnInit() {
  }

}
