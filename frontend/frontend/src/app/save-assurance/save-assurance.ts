import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { RouterLink, Router } from '@angular/router';
import { AssuranceService } from '../services.spec';
import { ContratAssuranceDTO } from '../model/ContratAssuranceDTO';
import { ContratAutomobileDTO } from '../model/ContratAutomobileDTO';

@Component({
  selector: 'app-save-assurance',
  standalone: true,
  imports: [CommonModule, FormsModule, RouterLink],
  templateUrl: './save-assurance.html',
  styleUrl: './save-assurance.css'
})
export class SaveAssuranceComponent {

  typeContrat: 'AUTO' | 'SANTE' = 'AUTO';
  isLoading = false;
  successMessage = '';
  errorMessage = '';

  contrat: ContratAssuranceDTO = {
    id: undefined,
    dateSouscription: undefined,
    dateValidation: undefined,
    statut: 'ACTIF',
    montantCotisation: 0,
    dureeContrat: 12,
    tauxCouverture: 80,
    clientId: undefined,
    typeContrat: ''
  };

  autoFields = {
    numeroImmatriculation: '',
    marqueVehicule: '',
    modeleVehicule: ''
  };

  constructor(
    private assuranceService: AssuranceService,
    private router: Router
  ) {}

  saveContrat(): void {
    this.isLoading = true;
    this.contrat.typeContrat = this.typeContrat;

    if (this.typeContrat === 'AUTO') {
      const autoDTO: ContratAutomobileDTO = {
        ...this.contrat,
        ...this.autoFields
      };
      this.assuranceService.saveAuto(autoDTO).subscribe({
        next: () => this.handleSuccess(),
        error: () => this.handleError()
      });
    } else {
      this.assuranceService.saveSante(this.contrat).subscribe({
        next: () => this.handleSuccess(),
        error: () => this.handleError()
      });
    }
  }

  private handleSuccess(): void {
    this.isLoading = false;
    this.successMessage = 'Contrat enregistré avec succès.';
    setTimeout(() => this.router.navigate(['/']), 1500);
  }

  private handleError(): void {
    this.isLoading = false;
    this.errorMessage = 'Une erreur est survenue lors de l\'enregistrement.';
  }
}
