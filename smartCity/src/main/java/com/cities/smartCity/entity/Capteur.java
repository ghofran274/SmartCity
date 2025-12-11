package com.cities.smartCity.entity;


import jakarta.persistence.*;

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

    @ManyToOne
    @JoinColumn(name = "id_proprietaire")
    private Proprietaire proprietaire;

    @ManyToOne
    @JoinColumn(name = "id_zone")
    private Zone zone;

    // ----- getters & setters -----

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

    public Proprietaire getProprietaire() {
        return proprietaire;
    }

    public void setProprietaire(Proprietaire proprietaire) {
        this.proprietaire = proprietaire;
    }

    public Zone getZone() {
        return zone;
    }

    public void setZone(Zone zone) {
        this.zone = zone;
    }
}
