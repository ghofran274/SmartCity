package com.cities.smartCity.repository;

// VehiculeAutonomeRepository.java


import com.cities.smartCity.entity.VehiculeAutonome;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehiculeAutonomeRepository
        extends JpaRepository<VehiculeAutonome, Integer> {
}

