package com.cities.smartCity.service;


import com.cities.smartCity.entity.Capteur;
import com.cities.smartCity.repository.CapteurRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CapteurService {

    private final CapteurRepository repository;

    public CapteurService(CapteurRepository repository) {
        this.repository = repository;
    }

    public Capteur create(Capteur c) {
        return repository.save(c);
    }

    public Capteur getById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public List<Capteur> getAll() {
        return repository.findAll();
    }

    public Capteur update(Integer id, Capteur c) {
        c.setIdCapteur(id);
        return repository.save(c);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}

