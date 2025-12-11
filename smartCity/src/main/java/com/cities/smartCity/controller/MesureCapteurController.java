package com.cities.smartCity.controller;


import com.cities.smartCity.entity.MesureCapteur;
import com.cities.smartCity.service.MesureCapteurService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/mesures")
@CrossOrigin(origins = "*")
public class MesureCapteurController {

    private final MesureCapteurService service;

    public MesureCapteurController(MesureCapteurService service) {
        this.service = service;
    }

    @GetMapping
    public List<MesureCapteur> getAll() {
        return service.getAll();
    }

    @GetMapping("{id}")
    public ResponseEntity<MesureCapteur> getById(@PathVariable Integer id) {
        MesureCapteur m = service.getById(id);
        return m != null ? ResponseEntity.ok(m) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public MesureCapteur create(@RequestBody MesureCapteur m) {
        return service.create(m);
    }

    @PutMapping("{id}")
    public ResponseEntity<MesureCapteur> update(@PathVariable Integer id,
                                                @RequestBody MesureCapteur m) {
        return ResponseEntity.ok(service.update(id, m));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}


