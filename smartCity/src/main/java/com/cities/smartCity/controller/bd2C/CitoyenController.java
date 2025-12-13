package com.cities.smartCity.controller.bd2C;

import com.cities.smartCity.entity.bd2E.Citoyen;
import com.cities.smartCity.service.bd2S.CitoyenService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/citoyens")
public class CitoyenController {

    private final CitoyenService citoyenService;

    public CitoyenController(CitoyenService citoyenService) {
        this.citoyenService = citoyenService;
    }

    @PostMapping("/add")
    public ResponseEntity<Citoyen> create(@RequestBody Citoyen citoyen) {
        return ResponseEntity.ok(citoyenService.create(citoyen));
    }

    @GetMapping("getAll")
    public ResponseEntity<List<Citoyen>> getAll() {
        return ResponseEntity.ok(citoyenService.getAll());
    }

    @GetMapping("/tope")
    public ResponseEntity<List<Citoyen>> getAllByScoreEngagementDesc() {
        return ResponseEntity.ok(citoyenService.getAllOrderByScoreEngagementDesc());
    }
}
