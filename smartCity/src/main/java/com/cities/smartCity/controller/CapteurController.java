package com.cities.smartCity.controller;


import com.cities.smartCity.entity.Capteur;
import com.cities.smartCity.service.CapteurService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/capteurs")
public class CapteurController {

    private final CapteurService service;

    public CapteurController(CapteurService service) {
        this.service = service;
    }

    @GetMapping
    public List<Capteur> getAll() {
        return service.getAll();
    }

    @GetMapping("{id}")
    public ResponseEntity<Capteur> getById(@PathVariable Integer id) {
        Capteur c = service.getById(id);
        return c != null ? ResponseEntity.ok(c) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public Capteur create(@RequestBody Capteur c) {
        return service.create(c);
    }

    @PutMapping("{id}")
    public ResponseEntity<Capteur> update(@PathVariable Integer id,
                                          @RequestBody Capteur c) {
        return ResponseEntity.ok(service.update(id, c));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}

