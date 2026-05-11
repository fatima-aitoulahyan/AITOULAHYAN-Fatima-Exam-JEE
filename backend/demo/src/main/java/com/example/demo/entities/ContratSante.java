package com.example.demo.entities;

import com.example.demo.enums.NiveauCouverture;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContratSante extends ContratAssurance{
    private NiveauCouverture niveauCouverture;
    private int nombrePersonnesCouvertes;
}
