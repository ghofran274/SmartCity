package com.cities.smartCity.repository;


import com.cities.smartCity.entity.Intervention;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InterventionRepository
        extends JpaRepository<Intervention, Integer> {
}

