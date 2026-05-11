package com.example.demo.services;

import com.example.demo.dtos.*;
import com.example.demo.entities.Client;
import com.example.demo.mappers.AssuranceImpl;
import com.example.demo.repositories.ClientRepository;
import com.example.demo.repositories.ContratAssuranceRepository;
import com.example.demo.repositories.PaiementRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
@AllArgsConstructor
public class AssuranceServiceImpl implements AssuranceService {

    private AssuranceImpl dtoMapper;
    private ClientRepository clientRepository;
    private ContratAssuranceRepository contratAssuranceRepository;
    private PaiementRepository paiementRepository;

    // ================= CLIENT =================

    @Override
    public ClientDTO saveClient(ClientDTO clientDTO) {
        Client client = dtoMapper.fromClientDTO(clientDTO);
        Client savedClient = clientRepository.save(client);
        return dtoMapper.fromClient(savedClient);
    }

    @Override
    public ClientDTO getClientById(Long id) {
        Client client = clientRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Client not found"));
        return dtoMapper.fromClient(client);
    }

    @Override
    public List<ClientDTO> getAllClients() {
        return clientRepository.findAll()
                .stream()
                .map(dtoMapper::fromClient)
                .toList();
    }

    @Override
    public ClientDTO updateClient(Long id, ClientDTO clientDTO) {
        Client client = clientRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Client not found"));

        
        client.setEmail(clientDTO.getEmail());

        Client updated = clientRepository.save(client);
        return dtoMapper.fromClient(updated);
    }

    @Override
    public void deleteClient(Long id) {
        clientRepository.deleteById(id);
    }

    // ================= PAIEMENT =================

    @Override
    public PaiementDTO savePaiement(PaiementDTO paiementDTO) {
        var paiement = dtoMapper.fromPaiementDTO(paiementDTO);
        var saved = paiementRepository.save(paiement);
        return dtoMapper.fromPaiement(saved);
    }

    @Override
    public PaiementDTO getPaiementById(Long id) {
        var paiement = paiementRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Paiement not found"));
        return dtoMapper.fromPaiement(paiement);
    }

    @Override
    public List<PaiementDTO> getAllPaiements() {
        return paiementRepository.findAll()
                .stream()
                .map(dtoMapper::fromPaiement)
                .toList();
    }

    @Override
    public PaiementDTO updatePaiement(Long id, PaiementDTO dto) {
        var paiement = paiementRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Paiement not found"));

        paiement.setMontant(dto.getMontant());
        paiement.setDatePaiement(dto.getDatePaiement());

        var updated = paiementRepository.save(paiement);
        return dtoMapper.fromPaiement(updated);
    }

    @Override
    public void deletePaiement(Long id) {
        paiementRepository.deleteById(id);
    }

    // ================= CONTRAT AUTO =================

    @Override
    public ContratAssuranceDTO saveAuto(ContratAutomobileDTO dto) {
        var contrat = dtoMapper.fromContratAutomobileDTO(dto);
        var saved = contratAssuranceRepository.save(contrat);
        return dtoMapper.fromContratAutomobile(saved);
    }

    @Override
    public List<ContratAssuranceDTO> getAllAuto() {
        return null;
    }

    // ================= CONTRAT SANTE =================

    @Override
    public ContratSanteDTO saveSante(ContratSanteDTO dto) {
        var contrat = dtoMapper.fromContratSanteDTO(dto);
        var saved = contratAssuranceRepository.save(contrat);
        return dtoMapper.fromContratSante(saved);
    }

    @Override
    public List<ContratSanteDTO> getAllSante() {
        return null;
    }
}