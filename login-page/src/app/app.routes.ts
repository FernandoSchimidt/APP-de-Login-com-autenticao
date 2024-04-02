import { Routes } from '@angular/router';
import { LoginComponent } from './pages-default/login/login.component';
import { SignupComponent } from './pages-default/signup/signup.component';
import { UserComponent } from './pages-default/user/user.component';
import { AuthGuardService } from './services/auth-guard.service';

export const routes: Routes = [
  { path: '', component: UserComponent, pathMatch: 'full' },
  { path: 'login', component: LoginComponent },
  { path: 'signup', component: SignupComponent },
  { path: 'user', component: UserComponent, canActivate: [AuthGuardService] },
];
