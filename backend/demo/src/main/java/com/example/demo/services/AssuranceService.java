package com.example.demo.services;

import com.example.demo.dtos.*;

import java.util.List;

public interface AssuranceService {
    ClientDTO saveClient(ClientDTO clientDTO);
    ClientDTO getClientById(Long id);
    List<ClientDTO> getAllClients();
    ClientDTO updateClient(Long id, ClientDTO clientDTO);
    void deleteClient(Long id);
    PaiementDTO savePaiement(PaiementDTO paiementDTO);
    PaiementDTO getPaiementById(Long id);
    List<PaiementDTO> getAllPaiements();
    PaiementDTO updatePaiement(Long id, PaiementDTO paiementDTO);
    void deletePaiement(Long id);
    ContratAssuranceDTO saveAuto(ContratAutomobileDTO dto);
    List<ContratAssuranceDTO> getAllAuto();

    ContratSanteDTO saveSante(ContratSanteDTO dto);
    List<ContratSanteDTO> getAllSante();


}
