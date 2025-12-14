package com.cities.smartCity.controller;

import com.cities.smartCity.entity.InterventionTechnicien;
import com.cities.smartCity.service.InterventionTechnicienService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/intervention-techniciens")
public class InterventionTechnicienController {

    private final InterventionTechnicienService service;

    public InterventionTechnicienController(InterventionTechnicienService service) {
        this.service = service;
    }

    @PostMapping("/add")
    public InterventionTechnicien create(@RequestBody InterventionTechnicien it) {
        return service.create(it);
    }

    @GetMapping("getAll")
    public List<InterventionTechnicien> getAll() {
        return service.getAll();
    }
}
