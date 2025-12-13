package com.cities.smartCity.entity;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;
import java.time.LocalDateTime;
@Getter
@Setter
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
    private Intervention intervention;
    // Relation ManyToOne vers Technicien
    @ManyToOne
    @JoinColumn(name = "id_technicien", nullable = false)
    private Technicien technicien;

}

