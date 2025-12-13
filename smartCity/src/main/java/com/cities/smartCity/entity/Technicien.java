package com.cities.smartCity.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import jakarta.persistence.*;
@Getter
@Setter
@Entity
@Table(name = "technicien")
public class Technicien {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTechnicien;

    private String nomTechnicien;
    private String prenomTechnicien;
    private String telephone;
    private String specialite;
    @OneToMany(mappedBy = "technicien", cascade = CascadeType.ALL)
    private List<InterventionTechnicien> interventions;

}

