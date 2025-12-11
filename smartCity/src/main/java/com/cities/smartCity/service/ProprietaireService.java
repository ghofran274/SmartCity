package com.cities.smartCity.service;


import com.cities.smartCity.entity.Proprietaire;
import com.cities.smartCity.repository.ProprietaireRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProprietaireService {

    private final ProprietaireRepository repository;

    public ProprietaireService(ProprietaireRepository repository) {
        this.repository = repository;
    }

    public Proprietaire create(Proprietaire p) {
        return repository.save(p);
    }

    public Proprietaire getById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public List<Proprietaire> getAll() {
        return repository.findAll();
    }

    public Proprietaire update(Integer id, Proprietaire p) {
        p.setIdProprietaire(id);
        return repository.save(p);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}

