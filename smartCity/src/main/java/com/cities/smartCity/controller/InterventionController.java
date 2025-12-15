package com.cities.smartCity.controller;

import com.cities.smartCity.entity.Intervention;
import com.cities.smartCity.service.InterventionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/interventions")
public class InterventionController {

    private final InterventionService service;

    public InterventionController(InterventionService service) {
        this.service = service;
    }

    @PostMapping("/add")
    public Intervention create(@RequestBody Intervention i) {
        return service.create(i);
    }

    @GetMapping("/getAll")
    public List<Intervention> getAll() {
        return service.getAll();
    }

    // Toutes les interventions prédictives de ce mois
    @GetMapping("/prem")
    public List<InterventionService.Ozil> predictiveThisMonth() {
        return service.getPredictiveThisMonth();
    }
}
