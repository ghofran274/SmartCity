// Service
package com.cities.smartCity.service;

import com.cities.smartCity.entity.VehiculeAutonome;
import com.cities.smartCity.repository.VehiculeAutonomeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehiculeAutonomeService {

    private final VehiculeAutonomeRepository repo;

    public VehiculeAutonomeService(VehiculeAutonomeRepository repo) {
        this.repo = repo;
    }

    public List<VehiculeAutonome> getAll() {
        return repo.findAll();
    }

    public VehiculeAutonome create(VehiculeAutonome v) {
        return repo.save(v);
    }
}
