package com.cities.smartCity.entity;


import jakarta.persistence.*;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(name = "mesure_capteur")
public class MesureCapteur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMesureCapteur;
    private LocalDateTime dateHeureMesure;
    private Float valeur;
    private String unite;
    @ManyToOne
    @JoinColumn(name = "id_capteur", nullable = false)
    private Capteur capteur;
}

