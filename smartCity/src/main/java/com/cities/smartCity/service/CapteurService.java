package com.cities.smartCity.service;

import com.cities.smartCity.entity.Capteur;
import com.cities.smartCity.repository.CapteurRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CapteurService {

    private final CapteurRepository repo;

    public CapteurService(CapteurRepository repo) {
        this.repo = repo;
    }

    public Capteur create(Capteur c) {
        return repo.save(c);
    }

    public List<Capteur> getAll() {
        return repo.findAll();
    }
}
