package com.example.demo.entities;

import com.example.demo.enums.StatutContrat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type_contrat", discriminatorType = DiscriminatorType.STRING)
@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class ContratAssurance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date dateSouscription;

    private Date dateValidation;

    @Enumerated(EnumType.STRING)
    private StatutContrat statut;

    private double montantCotisation;

    private int dureeContrat;

    private double tauxCouverture;

    @ManyToOne
    private Client client;

    @OneToMany(mappedBy = "contratAssurance", cascade = CascadeType.ALL)
    private List<Paiement> paiements;
}
