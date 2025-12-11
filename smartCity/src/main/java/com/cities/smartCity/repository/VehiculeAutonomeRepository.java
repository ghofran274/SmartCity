package com.cities.smartCity.repository;

import com.cities.smartCity.entity.VehiculeAutonome;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehiculeAutonomeRepository extends JpaRepository<VehiculeAutonome, Integer> {
}
