package com.cities.smartCity.controller;



import com.cities.smartCity.entity.Intervention;
import com.cities.smartCity.service.InterventionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/interventions")
@CrossOrigin(origins = "*")
public class InterventionController {

    private final InterventionService service;

    public InterventionController(InterventionService service) {
        this.service = service;
    }

    @GetMapping
    public List<Intervention> getAll() {
        return service.getAll();
    }

    @GetMapping("{id}")
    public ResponseEntity<Intervention> getById(@PathVariable Integer id) {
        Intervention i = service.getById(id);
        return i != null ? ResponseEntity.ok(i) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public Intervention create(@RequestBody Intervention i) {
        return service.create(i);
    }

    @PutMapping("{id}")
    public ResponseEntity<Intervention> update(@PathVariable Integer id,
                                               @RequestBody Intervention i) {
        return ResponseEntity.ok(service.update(id, i));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}



