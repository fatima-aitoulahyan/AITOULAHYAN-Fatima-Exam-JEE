import {ContratAssuranceDTO} from './ContratAssuranceDTO';

export interface ClientDTO {
  id?: number;
  name: string;
  email: string;
  contrats?: ContratAssuranceDTO[];
}
