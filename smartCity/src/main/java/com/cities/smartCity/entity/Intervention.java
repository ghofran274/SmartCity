package com.cities.smartCity.entity;



import java.util.List;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "intervention")
public class Intervention {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idIntervention;

    private LocalDateTime dateHeureDebut;
    private LocalDateTime dateHeureFin;
    private Float cout;
    private Float impactCo2;
    private String commentaire;

    public Integer getIdIntervention() {
        return idIntervention;
    }

    public void setIdIntervention(Integer idIntervention) {
        this.idIntervention = idIntervention;
    }

    public LocalDateTime getDateHeureDebut() {
        return dateHeureDebut;
    }

    public void setDateHeureDebut(LocalDateTime dateHeureDebut) {
        this.dateHeureDebut = dateHeureDebut;
    }

    public LocalDateTime getDateHeureFin() {
        return dateHeureFin;
    }

    public void setDateHeureFin(LocalDateTime dateHeureFin) {
        this.dateHeureFin = dateHeureFin;
    }

    public Float getCout() {
        return cout;
    }

    public void setCout(Float cout) {
        this.cout = cout;
    }

    public Float getImpactCo2() {
        return impactCo2;
    }

    public void setImpactCo2(Float impactCo2) {
        this.impactCo2 = impactCo2;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature;
    }

    public Capteur getCapteur() {
        return capteur;
    }

    public void setCapteur(Capteur capteur) {
        this.capteur = capteur;
    }

    public List<InterventionTechnicien> getTechniciens() {
        return techniciens;
    }

    public void setTechniciens(List<InterventionTechnicien> techniciens) {
        this.techniciens = techniciens;
    }

    private String nature;
    @ManyToOne
    @JoinColumn(name = "id_capteur", nullable = false)
    private Capteur capteur;

    @OneToMany(mappedBy = "intervention")
    private List<InterventionTechnicien> techniciens;

}