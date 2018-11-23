import { TestBed } from '@angular/core/testing';

import { LoginDataServicesService } from './login-data-services.service';

describe('LoginDataServicesService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: LoginDataServicesService = TestBed.get(LoginDataServicesService);
    expect(service).toBeTruthy();
  });
});
