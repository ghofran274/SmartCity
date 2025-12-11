package com.cities.smartCity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cities.smartCity.entity.Participation;

public interface ParticipationRepository extends JpaRepository<Participation, Integer> {
}
