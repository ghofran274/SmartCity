package com.cities.smartCity.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "PARTICIPATION")
public class Participation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_citoyen")
    private Citoyen citoyen;

    @ManyToOne
    @JoinColumn(name = "id_consultation")
    private ConsultationCitoyenne consultation;

    @Temporal(TemporalType.DATE)
    private Date date_participation;

    private String role;

    // getters et setters
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public Citoyen getCitoyen() { return citoyen; }
    public void setCitoyen(Citoyen citoyen) { this.citoyen = citoyen; }

    public ConsultationCitoyenne getConsultation() { return consultation; }
    public void setConsultation(ConsultationCitoyenne consultation) { this.consultation = consultation; }

    public Date getDate_participation() { return date_participation; }
    public void setDate_participation(Date date_participation) { this.date_participation = date_participation; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }
}

