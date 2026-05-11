import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { ClientDTO } from './model/ClientDTO';
import { PaiementDTO } from './model/PaiementDTO';
import { ContratAssuranceDTO } from './model/ContratAssuranceDTO';
import { ContratAutomobileDTO } from './model/ContratAutomobileDTO';
import { ContratSanteDTO } from './model/ContratSanteDTO';

@Injectable({ providedIn: 'root' })
export class AssuranceService {

  private baseUrl = 'http://localhost:8080/api';

  constructor(private http: HttpClient) {}

  // ===== CLIENTS =====
  saveClient(client: ClientDTO): Observable<ClientDTO> {
    return this.http.post<ClientDTO>(`${this.baseUrl}/clients`, client);
  }

  getClientById(id: number): Observable<ClientDTO> {
    return this.http.get<ClientDTO>(`${this.baseUrl}/clients/${id}`);
  }

  getAllClients(): Observable<ClientDTO[]> {
    return this.http.get<ClientDTO[]>(`${this.baseUrl}/clients`);
  }

  updateClient(id: number, client: ClientDTO): Observable<ClientDTO> {
    return this.http.put<ClientDTO>(`${this.baseUrl}/clients/${id}`, client);
  }

  deleteClient(id: number): Observable<void> {
    return this.http.delete<void>(`${this.baseUrl}/clients/${id}`);
  }

  // ===== PAIEMENTS =====
  savePaiement(paiement: PaiementDTO): Observable<PaiementDTO> {
    return this.http.post<PaiementDTO>(`${this.baseUrl}/paiements`, paiement);
  }

  getPaiementById(id: number): Observable<PaiementDTO> {
    return this.http.get<PaiementDTO>(`${this.baseUrl}/paiements/${id}`);
  }

  getAllPaiements(): Observable<PaiementDTO[]> {
    return this.http.get<PaiementDTO[]>(`${this.baseUrl}/paiements`);
  }

  updatePaiement(id: number, paiement: PaiementDTO): Observable<PaiementDTO> {
    return this.http.put<PaiementDTO>(`${this.baseUrl}/paiements/${id}`, paiement);
  }

  deletePaiement(id: number): Observable<void> {
    return this.http.delete<void>(`${this.baseUrl}/paiements/${id}`);
  }

  // ===== CONTRATS =====
  saveAuto(dto: ContratAutomobileDTO): Observable<ContratAssuranceDTO> {
    return this.http.post<ContratAssuranceDTO>(`${this.baseUrl}/contrats/auto`, dto);
  }

  getAllAuto(): Observable<ContratAssuranceDTO[]> {
    return this.http.get<ContratAssuranceDTO[]>(`${this.baseUrl}/contrats/auto`);
  }

  saveSante(dto: ContratAssuranceDTO): Observable<ContratAssuranceDTO> {
    return this.http.post<ContratAssuranceDTO>(`${this.baseUrl}/contrats/sante`, dto);
  }

  getAllSante(): Observable<ContratSanteDTO[]> {
    return this.http.get<ContratSanteDTO[]>(`${this.baseUrl}/contrats/sante`);
  }
}
