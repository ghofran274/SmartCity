package com.cities.smartCity.controller;

import com.cities.smartCity.entity.Proprietaire;
import com.cities.smartCity.service.ProprietaireService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/proprietaires")
public class ProprietaireController {

    private final ProprietaireService service;

    public ProprietaireController(ProprietaireService service) {
        this.service = service;
    }

    @PostMapping("/add")
    public Proprietaire create(@RequestBody Proprietaire p) {
        return service.create(p);
    }

    @GetMapping("/getAll")
    public List<Proprietaire> getAll() {
        return service.getAll();
    }
}
