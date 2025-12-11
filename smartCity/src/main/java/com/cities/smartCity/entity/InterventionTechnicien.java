package com.cities.smartCity.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "intervention_technicien")
public class InterventionTechnicien {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idInterventionTechnicien;   // PK simple

    @ManyToOne
    @JoinColumn(name = "id_intervention", nullable = false)
    private Intervention intervention;

    @ManyToOne
    @JoinColumn(name = "id_technicien", nullable = false)
    private Technicien technicien;

    private String role;
    private LocalDateTime dateDebut;
    private LocalDateTime dateFin;

    public Integer getIdInterventionTechnicien() {
        return idInterventionTechnicien;
    }

    public void setIdInterventionTechnicien(Integer idInterventionTechnicien) {
        this.idInterventionTechnicien = idInterventionTechnicien;
    }

    public Intervention getIntervention() {
        return intervention;
    }

    public void setIntervention(Intervention intervention) {
        this.intervention = intervention;
    }

    public Technicien getTechnicien() {
        return technicien;
    }

    public void setTechnicien(Technicien technicien) {
        this.technicien = technicien;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public LocalDateTime getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(LocalDateTime dateDebut) {
        this.dateDebut = dateDebut;
    }

    public LocalDateTime getDateFin() {
        return dateFin;
    }

    public void setDateFin(LocalDateTime dateFin) {
        this.dateFin = dateFin;
    }
}

