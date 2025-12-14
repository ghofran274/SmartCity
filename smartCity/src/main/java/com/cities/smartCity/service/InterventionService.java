package com.cities.smartCity.service;

import com.cities.smartCity.entity.Intervention;
import com.cities.smartCity.repository.InterventionRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.YearMonth;
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
    public List<Intervention> getPredictiveThisMonth() {
        YearMonth ym = YearMonth.now();
        LocalDateTime from = ym.atDay(1).atStartOfDay();
        LocalDateTime to = ym.atEndOfMonth().atTime(23, 59, 59);

        return repo.findPredictiveThisMonth(from, to);
    }
}
