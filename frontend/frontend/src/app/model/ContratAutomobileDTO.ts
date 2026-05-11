import {ContratAssuranceDTO} from './ContratAssuranceDTO';

export interface ContratAutomobileDTO extends ContratAssuranceDTO {
  numeroImmatriculation?: string;
  marqueVehicule?: string;
  modeleVehicule?: string;
}
