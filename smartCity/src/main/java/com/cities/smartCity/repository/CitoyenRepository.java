package com.cities.smartCity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cities.smartCity.entity.Citoyen;

public interface CitoyenRepository extends JpaRepository<Citoyen, Integer> {
}
