// Service
package com.cities.smartCity.service.bd1S;

import com.cities.smartCity.entity.bd1E.VehiculeAutonome;
import com.cities.smartCity.repository.bd1R.VehiculeAutonomeRepository;
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
