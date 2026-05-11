export interface ContratAssuranceDTO {
  id?: number;
  dateSouscription?: Date | string;
  dateValidation?: Date | string;
  statut: string;
  montantCotisation: number;
  dureeContrat: number;
  tauxCouverture: number;
  clientId?: number;
  typeContrat: string;
}
