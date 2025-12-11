package com.cities.smartCity.repository;

import com.cities.smartCity.entity.Zone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ZoneRepository
        extends JpaRepository<Zone, Integer> {
}

