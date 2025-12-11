package com.cities.smartCity.controller;

import com.cities.smartCity.entity.ConsultationCitoyenne;
import com.cities.smartCity.service.ConsultationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/consultations")
public class ConsultationController {

    private final ConsultationService service;

    public ConsultationController(ConsultationService service) {
        this.service = service;
    }
    @GetMapping
    public List<ConsultationCitoyenne> all() { return service.getAll(); }

    @PostMapping
    public ConsultationCitoyenne create(@RequestBody ConsultationCitoyenne c) { return service.save(c); }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) { service.delete(id); }
}