package com.cities.smartCity.repository.bd1R;

import com.cities.smartCity.entity.bd1E.Trajet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrajetRepository extends JpaRepository<Trajet, Long> {

    // all trajets ordered by economie_co2 desc
    List<Trajet> findAllByOrderByEconomieCo2Desc();

    // only the first (best) trajet
    Trajet findTopByOrderByEconomieCo2Desc();
}
