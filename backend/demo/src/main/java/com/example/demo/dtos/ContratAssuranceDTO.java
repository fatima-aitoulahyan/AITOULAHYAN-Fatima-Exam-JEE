package com.example.demo.dtos;

import lombok.Data;
import java.util.Date;

@Data
public class ContratAssuranceDTO {

    private Long id;
    private Date dateSouscription;
    private Date dateValidation;

    private String statut;

    private double montantCotisation;
    private int dureeContrat;
    private double tauxCouverture;

    private Long clientId;

    private String typeContrat;
}