package com.cities.smartCity.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
@Entity


@Getter
@Setter
@Data
@Table(name = "CITOYEN")
public class Citoyen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_citoyen;
    private String nom;
    private String prenom;
    private String adresse;
    private String telephone;
    private String email;
    private Integer score_engagement;
    private String preferences_mobilite;

    @ManyToMany
    @JoinTable(
            name = "participation",
            joinColumns = @JoinColumn(name = "id_citoyen"),
            inverseJoinColumns = @JoinColumn(name = "id_consultation")
    )
    private List<ConsultationCitoyenne> consultations;
}

