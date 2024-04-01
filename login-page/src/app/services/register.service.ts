import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { LoginResponse } from '../types/login-response.type';
import { tap } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class RegisterService {
  apiURL: string = 'http://localhost:8080/auth/register';

  constructor(private httpClient: HttpClient) {}

  register(name: string, email: string, password: string) {
    return this.httpClient
      .post<LoginResponse>(this.apiURL, { name, email, password })
      .pipe(
        tap((value) => {
          sessionStorage.setItem('auth-token', value.token);
          sessionStorage.setItem('username', value.name);
        })
      );
  }
}
