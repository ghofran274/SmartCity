package com.cities.smartCity.entity;


import jakarta.persistence.*;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "trajet")
public class Trajet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTrajet;

    private String origine;

    private String destination;

    private LocalDateTime dateHeureDepart;

    private LocalDateTime dateHeureArrivee;

    private Integer duree;

    private Float economieCo2;

    // getters & setters
}

