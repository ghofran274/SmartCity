package com.cities.smartCity.controller;

import com.cities.smartCity.entity.Citoyen;
import com.cities.smartCity.service.CitoyenService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/citoyens")
public class CitoyenController {

    private final CitoyenService service;

    public CitoyenController(CitoyenService service) {
        this.service = service;
    }

    @GetMapping
    public List<Citoyen> all() { return service.getAll(); }

    @PostMapping
    public Citoyen create(@RequestBody Citoyen c) { return service.save(c); }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) { service.delete(id); }
}
