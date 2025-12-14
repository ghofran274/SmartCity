package com.cities.smartCity.controller;

import com.cities.smartCity.entity.Capteur;
import com.cities.smartCity.service.CapteurService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/capteurs")
public class CapteurController {

    private final CapteurService service;

    public CapteurController(CapteurService service) {
        this.service = service;
    }

    @PostMapping("/add")
    public Capteur create(@RequestBody Capteur c) {
        return service.create(c);
    }

    @GetMapping("/getAll")
    public List<Capteur> getAll() {
        return service.getAll();
    }
}
