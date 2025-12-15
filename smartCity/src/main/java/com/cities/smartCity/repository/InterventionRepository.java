package com.cities.smartCity.repository;

import com.cities.smartCity.entity.Intervention;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.List;

public interface InterventionRepository extends JpaRepository<Intervention, Integer> {

    @Query("""
           SELECT COUNT(i),SUM(i.impactCo2)
           FROM Intervention i
           WHERE i.nature = 'predictive'
             AND i.dateHeureDebut BETWEEN :from AND :to
           """)
    List<Object[]> findPredictiveThisMonth(@Param("from") LocalDateTime from,
                                           @Param("to") LocalDateTime to);
}
