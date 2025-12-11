package com.cities.smartCity.service;


import com.cities.smartCity.entity.InterventionTechnicien;
import com.cities.smartCity.repository.InterventionTechnicienRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InterventionTechnicienService {

    private final InterventionTechnicienRepository repository;

    public InterventionTechnicienService(InterventionTechnicienRepository repository) {
        this.repository = repository;
    }

    public InterventionTechnicien create(InterventionTechnicien it) {
        return repository.save(it);
    }

    public InterventionTechnicien getById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public List<InterventionTechnicien> getAll() {
        return repository.findAll();
    }

    public InterventionTechnicien update(Integer id, InterventionTechnicien it) {
        it.setIdInterventionTechnicien(id);
        return repository.save(it);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}

