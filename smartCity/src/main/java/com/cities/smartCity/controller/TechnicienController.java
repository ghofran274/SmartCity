package com.cities.smartCity.controller;

import com.cities.smartCity.entity.Technicien;
import com.cities.smartCity.service.TechnicienService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/techniciens")
@CrossOrigin(origins = "*")
public class TechnicienController {

    private final TechnicienService service;

    public TechnicienController(TechnicienService service) {
        this.service = service;
    }

    @GetMapping
    public List<Technicien> getAll() {
        return service.getAll();
    }

    @GetMapping("{id}")
    public ResponseEntity<Technicien> getById(@PathVariable Integer id) {
        Technicien t = service.getById(id);
        return t != null ? ResponseEntity.ok(t) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public Technicien create(@RequestBody Technicien t) {
        return service.create(t);
    }

    @PutMapping("{id}")
    public ResponseEntity<Technicien> update(@PathVariable Integer id,
                                             @RequestBody Technicien t) {
        return ResponseEntity.ok(service.update(id, t));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}


