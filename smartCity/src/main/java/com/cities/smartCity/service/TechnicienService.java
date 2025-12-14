package com.cities.smartCity.service;

import com.cities.smartCity.entity.Technicien;
import com.cities.smartCity.repository.TechnicienRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TechnicienService {

    private final TechnicienRepository repo;

    public TechnicienService(TechnicienRepository repo) {
        this.repo = repo;
    }

    public Technicien create(Technicien t) {
        return repo.save(t);
    }

    public List<Technicien> getAll() {
        return repo.findAll();
    }
}
