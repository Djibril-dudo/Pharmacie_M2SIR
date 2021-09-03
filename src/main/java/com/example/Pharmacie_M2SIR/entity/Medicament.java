package com.example.Pharmacie_M2SIR.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Medicament implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    private String nom_medica;
    private Double prixU;
    private  String quantiteStock;
   private String description;
}
