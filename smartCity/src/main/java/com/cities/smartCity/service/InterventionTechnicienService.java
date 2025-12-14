package com.cities.smartCity.service;

import com.cities.smartCity.entity.InterventionTechnicien;
import com.cities.smartCity.repository.InterventionTechnicienRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InterventionTechnicienService {

    private final InterventionTechnicienRepository repo;

    public InterventionTechnicienService(InterventionTechnicienRepository repo) {
        this.repo = repo;
    }

    public InterventionTechnicien create(InterventionTechnicien it) {
        return repo.save(it);
    }

    public List<InterventionTechnicien> getAll() {
        return repo.findAll();
    }
}
