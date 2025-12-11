package com.cities.smartCity.repository;


import com.cities.smartCity.entity.MesureCapteur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MesureCapteurRepository
        extends JpaRepository<MesureCapteur, Integer> {
}

