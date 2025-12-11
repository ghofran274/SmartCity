package com.cities.smartCity.service;


import com.cities.smartCity.entity.Technicien;
import com.cities.smartCity.repository.TechnicienRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TechnicienService {

    private final TechnicienRepository repository;

    public TechnicienService(TechnicienRepository repository) {
        this.repository = repository;
    }

    public Technicien create(Technicien t) {
        return repository.save(t);
    }

    public Technicien getById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public List<Technicien> getAll() {
        return repository.findAll();
    }

    public Technicien update(Integer id, Technicien t) {
        t.setIdTechnicien(id);
        return repository.save(t);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}

