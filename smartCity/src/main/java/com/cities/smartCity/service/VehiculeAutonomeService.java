package com.cities.smartCity.service;

import com.cities.smartCity.entity.VehiculeAutonome;
import com.cities.smartCity.repository.VehiculeAutonomeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehiculeAutonomeService {

    private final VehiculeAutonomeRepository repository;

    public VehiculeAutonomeService(VehiculeAutonomeRepository repository) {
        this.repository = repository;
    }

    public VehiculeAutonome create(VehiculeAutonome v) {
        return repository.save(v);
    }

    public VehiculeAutonome getById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public List<VehiculeAutonome> getAll() {
        return repository.findAll();
    }

    public VehiculeAutonome update(Integer id,VehiculeAutonome v) {
        v.setIdVehicule(id);
        return repository.save(v);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}

