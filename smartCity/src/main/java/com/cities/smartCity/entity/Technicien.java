package com.cities.smartCity.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "technicien")
public class Technicien {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTechnicien;

    private String nomTechnicien;
    private String prenomTechnicien;
    private String telephone;
    private String specialite;

    public Integer getIdTechnicien() {
        return idTechnicien;
    }

    public void setIdTechnicien(Integer idTechnicien) {
        this.idTechnicien = idTechnicien;
    }

    public String getNomTechnicien() {
        return nomTechnicien;
    }

    public void setNomTechnicien(String nomTechnicien) {
        this.nomTechnicien = nomTechnicien;
    }

    public String getPrenomTechnicien() {
        return prenomTechnicien;
    }

    public void setPrenomTechnicien(String prenomTechnicien) {
        this.prenomTechnicien = prenomTechnicien;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }
}

