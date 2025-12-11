package com.cities.smartCity.service;

import com.cities.smartCity.entity.Citoyen;
import com.cities.smartCity.repository.CitoyenRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CitoyenService {

    private final CitoyenRepository repo;

    public CitoyenService(CitoyenRepository repo) {
        this.repo = repo;
    }

    public List<Citoyen> getAll() { return repo.findAll(); }

    public Citoyen save(Citoyen c) { return repo.save(c); }

    public void delete(Integer id) { repo.deleteById(id); }
}
