package com.cities.smartCity.service;


import com.cities.smartCity.entity.Intervention;
import com.cities.smartCity.repository.InterventionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InterventionService {

    private final InterventionRepository repository;

    public InterventionService(InterventionRepository repository) {
        this.repository = repository;
    }

    public Intervention create(Intervention i) {
        return repository.save(i);
    }

    public Intervention getById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public List<Intervention> getAll() {
        return repository.findAll();
    }

    public Intervention update(Integer id, Intervention i) {
        i.setIdIntervention(id);
        return repository.save(i);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}

