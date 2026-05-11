package com.example.demo.entities;

import com.example.demo.enums.TypeLogement;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContratHabitation extends ContratAssurance{
   private TypeLogement typeLogement ;
   private String adresse;
   private String superficie;
}
