package com.cities.smartCity.entity;

import jakarta.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "CONSULTATION_CITOYENNE")
public class ConsultationCitoyenne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_consultation;
    private String titre;
    private String description;
    @Temporal(TemporalType.DATE)
    private Date date_consultation;
    private String theme;

    @OneToMany(mappedBy = "consultation")
    private List<Participation> participations;

    // getters et setters
    public Integer getId_consultation() { return id_consultation; }
    public void setId_consultation(Integer id_consultation) { this.id_consultation = id_consultation; }
    public String getTitre() { return titre; }
    public void setTitre(String titre) { this.titre = titre; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public Date getDate_consultation() { return date_consultation; }
    public void setDate_consultation(Date date_consultation) { this.date_consultation = date_consultation; }
    public String getTheme() { return theme; }
    public void setTheme(String theme) { this.theme = theme; }
}
