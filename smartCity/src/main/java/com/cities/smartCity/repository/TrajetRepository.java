package com.cities.smartCity.repository;

import com.cities.smartCity.entity.Trajet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrajetRepository
        extends JpaRepository<Trajet, Integer> {
}
