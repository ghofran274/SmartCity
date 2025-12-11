package com.cities.smartCity.controller;


import com.cities.smartCity.entity.Proprietaire;
import com.cities.smartCity.service.ProprietaireService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/proprietaires")
@CrossOrigin(origins = "*")
public class ProprietaireController {

    private final ProprietaireService service;

    public ProprietaireController(ProprietaireService service) {
        this.service = service;
    }

    @GetMapping
    public List<Proprietaire> getAll() {
        return service.getAll();
    }

    @GetMapping("{id}")
    public ResponseEntity<Proprietaire> getById(@PathVariable Integer id) {
        Proprietaire p = service.getById(id);
        return p != null ? ResponseEntity.ok(p) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public Proprietaire create(@RequestBody Proprietaire p) {
        return service.create(p);
    }

    @PutMapping("{id}")
    public ResponseEntity<Proprietaire> update(@PathVariable Integer id,
                                               @RequestBody Proprietaire p) {
        return ResponseEntity.ok(service.update(id, p));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}


