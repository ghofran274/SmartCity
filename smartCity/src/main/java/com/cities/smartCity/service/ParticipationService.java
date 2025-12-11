package com.cities.smartCity.service;

import com.cities.smartCity.entity.Participation;
import com.cities.smartCity.repository.ParticipationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParticipationService {

    private final ParticipationRepository repo;

    public ParticipationService(ParticipationRepository repo) {
        this.repo = repo;
    }
    public List<Participation> getAll() { return repo.findAll(); }

    public Participation save(Participation p) { return repo.save(p); }

    public void delete(Integer id) { repo.deleteById(id); }
}
