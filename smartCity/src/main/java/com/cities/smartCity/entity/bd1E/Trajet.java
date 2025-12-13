package com.cities.smartCity.entity.bd1E;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="trajet")
public class Trajet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String origine;
    private String destination;
    private LocalDate date_heure_depart;
    private LocalDate date_heure_arivee;
    private int duree;
    private float economieCo2;


    @ManyToOne
    @JoinColumn(name="vehicule_id")
    private VehiculeAutonome vehicule;

    public Trajet() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrigine() {
        return origine;
    }

    public void setOrigine(String origine) {
        this.origine = origine;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public LocalDate getDate_heure_depart() {
        return date_heure_depart;
    }

    public void setDate_heure_depart(LocalDate date_heure_depart) {
        this.date_heure_depart = date_heure_depart;
    }

    public LocalDate getDate_heure_arivee() {
        return date_heure_arivee;
    }

    public void setDate_heure_arivee(LocalDate date_heure_arivee) {
        this.date_heure_arivee = date_heure_arivee;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public float getEconomie_co2() {
        return economieCo2;
    }

    public void setEconomie_co2(float economie_co2) {
        this.economieCo2 = economie_co2;
    }

    public VehiculeAutonome getVehicule() {
        return vehicule;
    }

    public void setVehicule(VehiculeAutonome vehicule) {
        this.vehicule = vehicule;
    }
}
