package com.cities.smartCity.entity.bd1E;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="vehiculeautonome")
public class VehiculeAutonome {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String imm;
    private String type;
    private String energie;

    @OneToMany(mappedBy = "vehicule")
    private List<Trajet> trajet;


    public VehiculeAutonome() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImm() {
        return imm;
    }

    public void setImm(String imm) {
        this.imm = imm;
    }

    public String getEnergie() {
        return energie;
    }

    public void setEnergie(String energie) {
        this.energie = energie;
    }
}
