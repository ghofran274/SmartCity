package com.cities.smartCity.repository.bd2R;

import com.cities.smartCity.entity.bd2E.Citoyen;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CitoyenRepository extends JpaRepository<Citoyen, Integer> {
    List<Citoyen> findAllByOrderByScoreEngagementDesc();

}
