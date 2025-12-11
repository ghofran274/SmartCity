package com.cities.smartCity.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "proprietaire")
public class Proprietaire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProprietaire;

    private String nomProprietaire;
    private String prenomProprietaire;
    private String telephone;
    private String adresse;
    private String typeProprietaire;
}

