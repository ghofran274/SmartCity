package com.cities.smartCity.controller;

import com.cities.smartCity.entity.Participation;
import com.cities.smartCity.service.ParticipationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/participations")
public class ParticipationController {

    private final ParticipationService service;

    public ParticipationController(ParticipationService service) {
        this.service = service;
    }

    @GetMapping
    public List<Participation> all() { return service.getAll(); }

    @PostMapping
    public Participation create(@RequestBody Participation p) { return service.save(p); }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) { service.delete(id); }
}

