package com.cities.smartCity.entity.bd2E;
import jakarta.persistence.*;


import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name="consultation")

public class Consultation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_consultation;
    private String titre;
    private String description;

    private LocalDate date_consultation;
    private String theme;
    @ManyToMany(mappedBy = "consultations")
    private Set<Citoyen> citoyens;

    public Integer getId_consultation() {
        return id_consultation;
    }

    public void setId_consultation(Integer id_consultation) {
        this.id_consultation = id_consultation;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate_consultation() {
        return date_consultation;
    }

    public void setDate_consultation(LocalDate date_consultation) {
        this.date_consultation = date_consultation;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public Set<Citoyen> getCitoyens() {
        return citoyens;
    }

    public void setCitoyens(Set<Citoyen> citoyens) {
        this.citoyens = citoyens;
    }
}