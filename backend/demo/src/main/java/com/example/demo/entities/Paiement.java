package com.example.demo.entities;

import com.example.demo.enums.TypePaiement;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Paiement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date datePaiement;
    private double montant;
    private TypePaiement typePaiement;
    @ManyToOne
    @JoinColumn(name = "contrat_id")
    private ContratAssurance contratAssurance;

}
