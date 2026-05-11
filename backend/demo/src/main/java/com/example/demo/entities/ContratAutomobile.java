package com.example.demo.entities;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContratAutomobile extends ContratAssurance{
    private String numeroImmatriculation;
    private String marqueVehicule;
    private String modeleVehicule;
}
