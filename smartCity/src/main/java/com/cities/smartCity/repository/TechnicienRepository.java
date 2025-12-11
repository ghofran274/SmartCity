package com.cities.smartCity.repository;


import com.cities.smartCity.entity.Technicien;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TechnicienRepository
        extends JpaRepository<Technicien, Integer> {
}

