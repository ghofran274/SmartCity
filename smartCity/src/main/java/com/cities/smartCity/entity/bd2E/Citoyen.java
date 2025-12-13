package com.cities.smartCity.entity.bd2E;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "CITOYEN")
public class Citoyen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_citoyen;

    private String nom;
    private String prenom;
    private String adresse;
    private String telephone;
    private String email;
    private Integer scoreEngagement;
    private String preferences_mobilite;

    @ManyToMany
    @JoinTable(
            name = "citoyen-consulatuion",
            joinColumns = @JoinColumn(name = "citoyen_id"),
            inverseJoinColumns = @JoinColumn(name = "Consultation_id")
    )
    private Set<Consultation> consultations;

    public Integer getId_citoyen() {
        return id_citoyen;
    }

    public void setId_citoyen(Integer id_citoyen) {
        this.id_citoyen = id_citoyen;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getScoreEngagement() {
        return scoreEngagement;
    }

    public void setScoreEngagement(Integer scoreEngagement) {
        this.scoreEngagement = scoreEngagement;
    }

    public String getPreferences_mobilite() {
        return preferences_mobilite;
    }

    public void setPreferences_mobilite(String preferences_mobilite) {
        this.preferences_mobilite = preferences_mobilite;
    }

    public Set<Consultation> getConsultations() {
        return consultations;
    }

    public void setConsultations(Set<Consultation> consultations) {
        this.consultations = consultations;
    }
}
