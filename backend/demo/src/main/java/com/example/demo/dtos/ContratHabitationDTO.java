package com.example.demo.dtos;

import lombok.Data;

@Data
public class ContratHabitationDTO extends ContratAssuranceDTO {

    private String typeLogement;
    private String adresse;
    private double superficie;
}
