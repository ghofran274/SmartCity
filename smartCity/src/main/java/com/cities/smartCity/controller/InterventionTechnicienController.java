package com.cities.smartCity.controller;


import com.cities.smartCity.entity.InterventionTechnicien;
import com.cities.smartCity.service.InterventionTechnicienService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/intervention-techniciens")
@CrossOrigin(origins = "*")
public class InterventionTechnicienController {

    private final InterventionTechnicienService service;

    public InterventionTechnicienController(InterventionTechnicienService service) {
        this.service = service;
    }

    @GetMapping
    public List<InterventionTechnicien> getAll() {
        return service.getAll();
    }

    @GetMapping("{id}")
    public ResponseEntity<InterventionTechnicien> getById(@PathVariable Integer id) {
        InterventionTechnicien it = service.getById(id);
        return it != null ? ResponseEntity.ok(it) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public InterventionTechnicien create(@RequestBody InterventionTechnicien it) {
        return service.create(it);
    }

    @PutMapping("{id}")
    public ResponseEntity<InterventionTechnicien> update(@PathVariable Integer id,
                                                         @RequestBody InterventionTechnicien it) {
        return ResponseEntity.ok(service.update(id, it));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}

