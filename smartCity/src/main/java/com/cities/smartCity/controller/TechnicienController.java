package com.cities.smartCity.controller;

import com.cities.smartCity.entity.Technicien;
import com.cities.smartCity.service.TechnicienService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/techniciens")
public class TechnicienController {

    private final TechnicienService service;

    public TechnicienController(TechnicienService service) {
        this.service = service;
    }

    @PostMapping("/add")
    public Technicien create(@RequestBody Technicien t) {
        return service.create(t);
    }

    @GetMapping("/getAll")
    public List<Technicien> getAll() {
        return service.getAll();
    }
}
