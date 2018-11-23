import { Component, OnInit } from '@angular/core';
import { Product } from '../model/product';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {

  products: Product[] = [
    {
      file:'assets/images/1.png',
      name: 'Product 1',
      amount: '15,000.00',
      inStock: true
    },
    {
      file:'assets/images/2.png',
      name: 'Product 2',
      amount: '10,000.00',
      inStock: false
    },
    {
      file:'assets/images/3.png',
      name: 'Product 3',
      amount: '25,000.00',
      inStock: false
    },
    {
      file:'assets/images/1.png',
      name: 'Product 4',
      amount: '25,000.00',
      inStock: true
    },
    {
      file:'assets/images/1.png',
      name: 'Product 5',
      amount: '25,000.00',
      inStock: true
    },
    {
      file:'assets/images/1.png',
      name: 'Product 6',
      amount: '25,000.00',
      inStock: true
    }
  ];
    
  constructor() { }

  ngOnInit() {
  }

}
