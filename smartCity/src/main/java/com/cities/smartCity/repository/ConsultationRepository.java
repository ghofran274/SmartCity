package com.cities.smartCity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cities.smartCity.entity.ConsultationCitoyenne;

public interface ConsultationRepository extends JpaRepository<ConsultationCitoyenne, Integer> {
}
