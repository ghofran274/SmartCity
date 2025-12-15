package com.cities.smartCity.service;

import com.cities.smartCity.entity.Intervention;
import com.cities.smartCity.repository.InterventionRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;

@Service
public class InterventionService {

    private final InterventionRepository repo;

    public InterventionService(InterventionRepository repo) {
        this.repo = repo;
    }

    // ----- CRUD simple -----
    public Intervention create(Intervention i) {
        return repo.save(i);
    }

    public List<Intervention> getAll() {
        return repo.findAll();
    }

    // ----- STATS : toutes les interventions prédictives du mois courant -----
    public List<Ozil> getPredictiveThisMonth() {
        YearMonth ym = YearMonth.now();
        LocalDateTime from = ym.atDay(1).atStartOfDay();
        LocalDateTime to = ym.atEndOfMonth().atTime(23, 59, 59);
        List<Object[]> rows =repo.findPredictiveThisMonth(from, to);
        List<Ozil> result = new ArrayList<>();
        for (Object[] row : rows) {
            Long countLong = (Long) row[0];
            Double impactDouble = (Double) row[1];
            Integer count = countLong.intValue();
            Float impactTotal = impactDouble.floatValue();
            result.add(new Ozil(count, impactTotal));
        }
        return result;
    }
    public static class Ozil {
        public Integer count;

        public Float impactTotal;


        public Ozil(Integer count, Float impactTotal) {
            this.count = count;

            this.impactTotal = impactTotal;


        }
    }
}
