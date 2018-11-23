import { TestBed } from '@angular/core/testing';

import { ShoppingItemsDataService } from './shopping-items-data.service';

describe('ShoppingItemsDataService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ShoppingItemsDataService = TestBed.get(ShoppingItemsDataService);
    expect(service).toBeTruthy();
  });
});
