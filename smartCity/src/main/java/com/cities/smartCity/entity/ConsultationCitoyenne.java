package com.cities.smartCity.entity;

import jakarta.persistence.*;
import java.util.Date;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
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

    @ManyToMany(mappedBy = "consultations")
    private List<Citoyen> citoyens;

}
