package com.cities.smartCity.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import jakarta.persistence.*;
import java.time.LocalDateTime;
@Getter
@Setter
@Entity
@Table(name = "intervention")
public class Intervention {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idIntervention;
    private LocalDateTime dateHeureDebut;
    private LocalDateTime dateHeureFin;
    private Float cout;
    private Float impactCo2;
    private String commentaire;
    @ManyToOne
    @JoinColumn(name = "id_capteur", nullable = false)
    private Capteur capteur;
    @OneToMany(mappedBy = "intervention")
    private List<InterventionTechnicien> techniciens;

}
