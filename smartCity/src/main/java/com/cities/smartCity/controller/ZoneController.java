package com.cities.smartCity.controller;


import com.cities.smartCity.entity.Zone;
import com.cities.smartCity.service.ZoneService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/zones")
@CrossOrigin(origins = "*")
public class ZoneController {

    private final ZoneService service;

    public ZoneController(ZoneService service) {
        this.service = service;
    }

    @GetMapping
    public List<Zone> getAll() {
        return service.getAll();
    }

    @GetMapping("{id}")
    public ResponseEntity<Zone> getById(@PathVariable Integer id) {
        Zone z = service.getById(id);
        return z != null ? ResponseEntity.ok(z) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public Zone create(@RequestBody Zone z) {
        return service.create(z);
    }

    @PutMapping("{id}")
    public ResponseEntity<Zone> update(@PathVariable Integer id,
                                       @RequestBody Zone z) {
        return ResponseEntity.ok(service.update(id, z));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}

