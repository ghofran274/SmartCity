package com.cities.smartCity.repository;

import com.cities.smartCity.entity.Intervention;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;
import java.util.List;

public interface InterventionRepository extends JpaRepository<Intervention, Integer> {

    @Query("""
           SELECT i
           FROM Intervention i
           WHERE i.nature = 'predictive'
             AND i.dateHeureDebut BETWEEN :from AND :to
           """)
    List<Intervention> findPredictiveThisMonth(LocalDateTime from, LocalDateTime to);
}
