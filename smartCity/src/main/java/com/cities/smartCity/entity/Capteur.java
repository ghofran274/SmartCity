package com.cities.smartCity.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import java.util.List;

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
    @JsonIgnore
    private List<MesureCapteur> mesures;

    public Integer getIdCapteur() {
        return idCapteur;
    }

    public void setIdCapteur(Integer idCapteur) {
        this.idCapteur = idCapteur;
    }

    public String getNomCapteur() {
        return nomCapteur;
    }

    public void setNomCapteur(String nomCapteur) {
        this.nomCapteur = nomCapteur;
    }

    public Float getLatitude() {
        return latitude;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    public Float getLongitude() {
        return longitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public Proprietaire getProprietaire() {
        return proprietaire;
    }

    public void setProprietaire(Proprietaire proprietaire) {
        this.proprietaire = proprietaire;
    }

    public List<MesureCapteur> getMesures() {
        return mesures;
    }

    public void setMesures(List<MesureCapteur> mesures) {
        this.mesures = mesures;
    }

    public List<Intervention> getInterventions() {
        return interventions;
    }

    public void setInterventions(List<Intervention> interventions) {
        this.interventions = interventions;
    }

    @OneToMany(mappedBy = "capteur")
    @JsonIgnore
    private List<Intervention> interventions;

}