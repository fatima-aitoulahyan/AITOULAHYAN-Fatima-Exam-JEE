import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { RouterLink, Router } from '@angular/router';
import { AssuranceService } from '../services.spec';
import { PaiementDTO } from '../model/PaiementDTO';

@Component({
  selector: 'app-save-paiement',
  standalone: true,
  imports: [CommonModule, FormsModule, RouterLink],
  templateUrl: './save-paiement.html',
  styleUrl: './save-paiement.css'
})
export class SavePaiementComponent {

  isLoading = false;
  successMessage = '';
  errorMessage = '';

  paiement: PaiementDTO = {
    id: undefined,
    datePaiement: undefined,
    montant: 0,
    typePaiement: 'VIREMENT',
    contratId: undefined
  };

  constructor(
    private assuranceService: AssuranceService,
    private router: Router
  ) {}

  savePaiement(): void {
    if (!this.paiement.contratId || !this.paiement.montant) {
      this.errorMessage = 'Veuillez remplir tous les champs obligatoires.';
      return;
    }
    this.isLoading = true;
    this.assuranceService.savePaiement(this.paiement).subscribe({
      next: () => {
        this.isLoading = false;
        this.successMessage = 'Paiement enregistré avec succès.';
        setTimeout(() => this.router.navigate(['/paiements']), 1500);
      },
      error: () => {
        this.isLoading = false;
        this.errorMessage = 'Une erreur est survenue.';
      }
    });
  }
}
