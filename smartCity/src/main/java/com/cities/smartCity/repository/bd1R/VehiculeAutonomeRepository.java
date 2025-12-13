package com.cities.smartCity.repository.bd1R;

import com.cities.smartCity.entity.bd1E.VehiculeAutonome;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehiculeAutonomeRepository extends JpaRepository<VehiculeAutonome, Integer> {
}
