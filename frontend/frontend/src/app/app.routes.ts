import { Routes } from '@angular/router';
import { SaveClientComponent } from './save-client/save-client';
import { SaveAssuranceComponent } from './save-assurance/save-assurance';
import { SavePaiementComponent } from './save-paiement/save-paiement';

export const routes: Routes = [
  { path: '', redirectTo: '/clients', pathMatch: 'full' },
  { path: 'clients', component: SaveClientComponent },
  { path: 'clients/nouveau', component: SaveClientComponent },
  { path: 'clients/modifier/:id', component: SaveClientComponent },
  { path: 'contrats/auto', component: SaveAssuranceComponent },
  { path: 'contrats/sante', component: SaveAssuranceComponent },
  { path: 'paiements', component: SavePaiementComponent },
  { path: '**', redirectTo: '/clients' }
];
