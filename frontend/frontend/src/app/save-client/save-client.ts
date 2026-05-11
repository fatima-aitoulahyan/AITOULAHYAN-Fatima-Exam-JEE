import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { RouterLink, ActivatedRoute, Router } from '@angular/router';
import { ClientDTO } from '../model/ClientDTO';
import { AssuranceService } from '../services.spec'

@Component({
  selector: 'app-save-client',
  standalone: true,
  imports: [CommonModule, FormsModule, RouterLink],
  templateUrl: './save-client.html',
  styleUrl: './save-client.css'
})
export class SaveClientComponent implements OnInit {

  client: ClientDTO = { id: undefined, name: '', email: '', contrats: [] };
  isEditMode = false;
  isLoading = false;
  successMessage = '';
  errorMessage = '';

  constructor(
    private assuranceService: AssuranceService,
    private route: ActivatedRoute,
    private router: Router
  ) {}

  ngOnInit(): void {
    const id = this.route.snapshot.paramMap.get('id');
    if (id) {
      this.isEditMode = true;
      this.assuranceService.getClientById(+id).subscribe({
        next: (data) => this.client = data,
        error: () => this.errorMessage = 'Client introuvable.'
      });
    }
  }

  saveClient(): void {
    if (!this.client.name || !this.client.email) {
      this.errorMessage = 'Veuillez remplir tous les champs.';
      return;
    }
    this.isLoading = true;
    const request$ = this.isEditMode
      ? this.assuranceService.updateClient(this.client.id!, this.client)
      : this.assuranceService.saveClient(this.client);

    request$.subscribe({
      next: () => {
        this.isLoading = false;
        this.successMessage = this.isEditMode
          ? 'Client modifié avec succès.'
          : 'Client enregistré avec succès.';
        setTimeout(() => this.router.navigate(['/clients']), 1500);
      },
      error: () => {
        this.isLoading = false;
        this.errorMessage = 'Une erreur est survenue.';
      }
    });
  }
}
