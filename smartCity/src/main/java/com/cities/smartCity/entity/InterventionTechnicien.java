
package com.cities.smartCity.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "intervention_technicien")
public class InterventionTechnicien {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idInterventionTechnicien;
    private String role;
    private LocalDateTime dateDebut;
    private LocalDateTime dateFin;
    @ManyToOne
    @JoinColumn(name = "id_intervention", nullable = false)
    @JsonIgnore
    private Intervention intervention;

    public Integer getIdInterventionTechnicien() {
        return idInterventionTechnicien;
    }

    public void setIdInterventionTechnicien(Integer idInterventionTechnicien) {
        this.idInterventionTechnicien = idInterventionTechnicien;
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

    // Relation ManyToOne vers Technicien
    @ManyToOne
    @JoinColumn(name = "id_technicien", nullable = false)
    @JsonIgnore
    private Technicien technicien;

}

