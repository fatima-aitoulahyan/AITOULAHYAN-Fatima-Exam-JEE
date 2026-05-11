package com.example.demo.entities;

import com.example.demo.enums.NiveauCouverture;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@DiscriminatorValue("SANTE")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContratSante extends ContratAssurance {

    @Enumerated(EnumType.STRING)
    private NiveauCouverture niveauCouverture;

    private int nombrePersonnesCouvertes;
}
