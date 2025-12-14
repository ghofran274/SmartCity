package com.cities.smartCity.repository;

import com.cities.smartCity.entity.Capteur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CapteurRepository extends JpaRepository<Capteur, Integer> {
}
