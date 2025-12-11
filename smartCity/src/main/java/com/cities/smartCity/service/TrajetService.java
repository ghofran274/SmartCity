package com.cities.smartCity.service;


import com.cities.smartCity.entity.Trajet;
import com.cities.smartCity.repository.TrajetRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrajetService {

    private final TrajetRepository repository;

    public TrajetService(TrajetRepository repository) {
        this.repository = repository;
    }

    public Trajet create(Trajet t) {
        return repository.save(t);
    }

    public Trajet getById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public List<Trajet> getAll() {
        return repository.findAll();
    }

    public Trajet update(Integer id, Trajet t) {
        t.setIdTrajet(id);
        return repository.save(t);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}

