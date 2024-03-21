import { Routes } from '@angular/router';
import { LoginComponent } from './pages-default/login/login.component';
import { SignupComponent } from './pages-default/signup/signup.component';

export const routes: Routes = [
  { path: 'login', component: LoginComponent },
  { path: 'signup', component: SignupComponent },
];
