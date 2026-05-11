package com.example.demo.dtos;

import lombok.Data;

@Data
public class ContratAutomobileDTO extends ContratAssuranceDTO {

    private String numeroImmatriculation;
    private String marqueVehicule;
    private String modeleVehicule;
}
