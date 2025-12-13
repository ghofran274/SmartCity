package com.cities.smartCity.entity;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;
import java.util.List;
@Setter
@Getter
@Entity
@Table(name = "capteur")
public class Capteur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCapteur;

    private String nomCapteur;

    private Float latitude;

    private Float longitude;

    private String statut;

    private String zone;

    @ManyToOne
    @JoinColumn(name = "id_proprietaire", nullable = false)
    private Proprietaire proprietaire;
    @OneToMany(mappedBy = "capteur")
    private List<MesureCapteur> mesures;
    @OneToMany(mappedBy = "capteur")
    private List<Intervention> interventions;

}
