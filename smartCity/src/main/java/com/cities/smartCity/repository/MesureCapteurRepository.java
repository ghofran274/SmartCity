package com.cities.smartCity.repository;

import com.cities.smartCity.entity.MesureCapteur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;
import java.util.List;

public interface MesureCapteurRepository extends JpaRepository<MesureCapteur, Integer> {

    @Query("""
           SELECT m.capteur.idCapteur, m.capteur.nomCapteur, SUM(m.valeur),m.capteur.zone
           FROM MesureCapteur m
           WHERE m.dateHeureMesure BETWEEN :from AND :to
           GROUP BY m.capteur.idCapteur, m.capteur.nomCapteur
           ORDER BY SUM(m.valeur) DESC
           """)
    List<Object[]> findCapteursPollutionOrdered(LocalDateTime from, LocalDateTime to);
}
