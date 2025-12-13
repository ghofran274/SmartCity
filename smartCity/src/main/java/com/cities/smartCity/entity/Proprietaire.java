package com.cities.smartCity.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.List;
@Getter
@Setter
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

    @OneToMany(mappedBy = "proprietaire")
    private List<Capteur> capteurs;

}