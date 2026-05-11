export interface PaiementDTO {
  id?: number;
  datePaiement?: Date | string;
  montant: number;
  typePaiement: string;
  contratId?: number;
}
