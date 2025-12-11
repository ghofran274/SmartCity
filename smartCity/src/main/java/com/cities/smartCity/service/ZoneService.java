package com.cities.smartCity.service;


import com.cities.smartCity.entity.Zone;
import com.cities.smartCity.repository.ZoneRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZoneService {

    private final ZoneRepository repository;

    public ZoneService(ZoneRepository repository) {
        this.repository = repository;
    }

    public Zone create(Zone z) {
        return repository.save(z);
    }

    public Zone getById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public List<Zone> getAll() {
        return repository.findAll();
    }

    public Zone update(Integer id, Zone z) {
        z.setIdZone(id);
        return repository.save(z);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}

