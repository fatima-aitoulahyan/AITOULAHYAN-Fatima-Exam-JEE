package com.example.demo.dtos;

import lombok.Data;

@Data
public class ContratSanteDTO extends ContratAssuranceDTO {

    private String niveauCouverture;
    private int nombrePersonnesCouvertes;
}