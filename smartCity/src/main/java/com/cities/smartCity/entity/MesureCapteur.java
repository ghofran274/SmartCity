package com.cities.smartCity.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import java.time.LocalDateTime;


@Entity
@Table(name = "mesure_capteur")
public class MesureCapteur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMesureCapteur;
    private LocalDateTime dateHeureMesure;
    private Float valeur;

    public Integer getIdMesureCapteur() {
        return idMesureCapteur;
    }

    public void setIdMesureCapteur(Integer idMesureCapteur) {
        this.idMesureCapteur = idMesureCapteur;
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

    public Capteur getCapteur() {
        return capteur;
    }

    public void setCapteur(Capteur capteur) {
        this.capteur = capteur;
    }

    private String unite;
    @ManyToOne
    @JoinColumn(name = "id_capteur", nullable = false)
    private Capteur capteur;
}
