package com.example.demo.dtos;

import lombok.Data;
import java.util.Date;

@Data
public class PaiementDTO {

    private Long id;
    private Date datePaiement;
    private double montant;
    private String typePaiement;

    private Long contratId;
}