package com.example.demo.web;

import com.example.demo.dtos.*;
import com.example.demo.services.AssuranceService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api")
@AllArgsConstructor
@CrossOrigin("*")
public class AssuranceController {

    private final AssuranceService assuranceService;
    @PostMapping("/clients")
    public ResponseEntity<ClientDTO> saveClient(@RequestBody ClientDTO clientDTO) {
        ClientDTO saved = assuranceService.saveClient(clientDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }
    @GetMapping("/clients/{id}")
    public ResponseEntity<ClientDTO> getClientById(@PathVariable Long id) {
        return ResponseEntity.ok(assuranceService.getClientById(id));
    }
    @GetMapping("/clients")
    public ResponseEntity<List<ClientDTO>> getAllClients() {
        return ResponseEntity.ok(assuranceService.getAllClients());
    }
    @PutMapping("/clients/{id}")
    public ResponseEntity<ClientDTO> updateClient(
            @PathVariable Long id,
            @RequestBody ClientDTO clientDTO) {
        return ResponseEntity.ok(assuranceService.updateClient(id, clientDTO));
    }

    @DeleteMapping("/clients/{id}")
    public ResponseEntity<Void> deleteClient(@PathVariable Long id) {
        assuranceService.deleteClient(id);
        return ResponseEntity.noContent().build();
    }

    // ================= PAIEMENT =================

    @PostMapping("/paiements")
    public ResponseEntity<PaiementDTO> savePaiement(@RequestBody PaiementDTO paiementDTO) {
        PaiementDTO saved = assuranceService.savePaiement(paiementDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @GetMapping("/paiements/{id}")
    public ResponseEntity<PaiementDTO> getPaiementById(@PathVariable Long id) {
        return ResponseEntity.ok(assuranceService.getPaiementById(id));
    }

    @GetMapping("/paiements")
    public ResponseEntity<List<PaiementDTO>> getAllPaiements() {
        return ResponseEntity.ok(assuranceService.getAllPaiements());
    }

    @PutMapping("/paiements/{id}")
    public ResponseEntity<PaiementDTO> updatePaiement(
            @PathVariable Long id,
            @RequestBody PaiementDTO paiementDTO) {
        return ResponseEntity.ok(assuranceService.updatePaiement(id, paiementDTO));
    }

    @DeleteMapping("/paiements/{id}")
    public ResponseEntity<Void> deletePaiement(@PathVariable Long id) {
        assuranceService.deletePaiement(id);
        return ResponseEntity.noContent().build();
    }

    // ================= CONTRAT AUTO =================

    @PostMapping("/contrats/auto")
    public ResponseEntity<ContratAssuranceDTO> saveAuto(@RequestBody ContratAutomobileDTO dto) {
        ContratAssuranceDTO saved = assuranceService.saveAuto(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @GetMapping("/contrats/auto")
    public ResponseEntity<List<ContratAssuranceDTO>> getAllAuto() {
        return ResponseEntity.ok(assuranceService.getAllAuto());
    }

    // ================= CONTRAT SANTE =================

    @PostMapping("/contrats/sante")
    public ResponseEntity<ContratSanteDTO> saveSante(@RequestBody ContratSanteDTO dto) {
        ContratSanteDTO saved = assuranceService.saveSante(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @GetMapping("/contrats/sante")
    public ResponseEntity<List<ContratSanteDTO>> getAllSante() {
        return ResponseEntity.ok(assuranceService.getAllSante());
    }
}