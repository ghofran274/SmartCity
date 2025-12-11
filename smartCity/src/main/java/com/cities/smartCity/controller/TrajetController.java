package com.cities.smartCity.controller;

import com.cities.smartCity.entity.Trajet;
import com.cities.smartCity.service.TrajetService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/trajets")
@CrossOrigin(origins = "*")
public class TrajetController {

    private final TrajetService service;

    public TrajetController(TrajetService service) {
        this.service = service;
    }

    @GetMapping
    public List<Trajet> getAll() {
        return service.getAll();
    }

    @GetMapping("{id}")
    public ResponseEntity<Trajet> getById(@PathVariable Integer id) {
        Trajet t = service.getById(id);
        return t != null ? ResponseEntity.ok(t) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public Trajet create(@RequestBody Trajet t) {
        return service.create(t);
    }

    @PutMapping("{id}")
    public ResponseEntity<Trajet> update(@PathVariable Integer id,
                                         @RequestBody Trajet t) {
        return ResponseEntity.ok(service.update(id, t));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}


