package com.cities.smartCity.service;

import com.cities.smartCity.entity.Proprietaire;
import com.cities.smartCity.repository.ProprietaireRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProprietaireService {

    private final ProprietaireRepository repo;

    public ProprietaireService(ProprietaireRepository repo) {
        this.repo = repo;
    }

    public Proprietaire create(Proprietaire p) {
        return repo.save(p);
    }

    public List<Proprietaire> getAll() {
        return repo.findAll();
    }
}
