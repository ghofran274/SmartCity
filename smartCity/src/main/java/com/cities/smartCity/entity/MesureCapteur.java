package com.cities.smartCity.entity;


import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "mesure_capteur")
public class MesureCapteur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMesureCapteur;

    @ManyToOne
    @JoinColumn(name = "id_capteur", nullable = false)
    private Capteur capteur;

    private LocalDateTime dateHeureMesure;

    private Float valeur;

    private String unite;

    // ----- getters & setters -----

    public Integer getIdMesureCapteur() {
        return idMesureCapteur;
    }

    public void setIdMesureCapteur(Integer idMesureCapteur) {
        this.idMesureCapteur = idMesureCapteur;
    }

    public Capteur getCapteur() {
        return capteur;
    }

    public void setCapteur(Capteur capteur) {
        this.capteur = capteur;
    }

    public LocalDateTime getDateHeureMesure() {
        return dateHeureMesure;
    }

    public void setDateHeureMesure(LocalDateTime dateHeureMesure) {
        this.dateHeureMesure = dateHeureMesure;
    }

    public Float getValeur() {
        return valeur;
    }

    public void setValeur(Float valeur) {
        this.valeur = valeur;
    }

    public String getUnite() {
        return unite;
    }

    public void setUnite(String unite) {
        this.unite = unite;
    }
}

