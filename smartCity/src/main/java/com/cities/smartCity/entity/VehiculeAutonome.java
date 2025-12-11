package com.cities.smartCity.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "vehicule_autonome")
public class VehiculeAutonome {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idVehicule;

    private String plaqueImmatriculation;
    private String typeVehicule;
    private String energie;


}


