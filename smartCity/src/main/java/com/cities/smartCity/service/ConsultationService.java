package com.cities.smartCity.service;

import com.cities.smartCity.entity.ConsultationCitoyenne;
import com.cities.smartCity.repository.ConsultationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultationService {

    private final ConsultationRepository repo;

    public ConsultationService(ConsultationRepository repo) {
        this.repo = repo;
    }

    public List<ConsultationCitoyenne> getAll() { return repo.findAll(); }

    public ConsultationCitoyenne save(ConsultationCitoyenne c) { return repo.save(c); }

    public void delete(Integer id) { repo.deleteById(id); }
}