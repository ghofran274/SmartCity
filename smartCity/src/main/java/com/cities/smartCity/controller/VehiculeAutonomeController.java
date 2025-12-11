package com.cities.smartCity.controller;

import com.cities.smartCity.entity.VehiculeAutonome;
import com.cities.smartCity.service.VehiculeAutonomeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vehicules")
@CrossOrigin(origins = "*")
public class VehiculeAutonomeController {

    private final VehiculeAutonomeService service;

    public VehiculeAutonomeController(VehiculeAutonomeService service) {
        this.service = service;
    }

    @GetMapping
    public List<VehiculeAutonome> getAll() {
        return service.getAll();
    }

    @GetMapping("{id}")
    public ResponseEntity<VehiculeAutonome> getById(@PathVariable Integer id) {
        VehiculeAutonome v = service.getById(id);
        return v != null ? ResponseEntity.ok(v) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public VehiculeAutonome create(@RequestBody VehiculeAutonome v) {
        return service.create(v);
    }

    @PutMapping("{id}")
    public ResponseEntity<VehiculeAutonome> update(@PathVariable Integer id,
                                                   @RequestBody VehiculeAutonome v) {
        return ResponseEntity.ok(service.update(id, v));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}


