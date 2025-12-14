package com.cities.smartCity.controller;

import com.cities.smartCity.entity.MesureCapteur;
import com.cities.smartCity.service.MesureCapteurService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mesures")
public class MesureCapteurController {

    private final MesureCapteurService service;

    public MesureCapteurController(MesureCapteurService service) {
        this.service = service;
    }

    // CRUD
    @PostMapping("/add")
    public MesureCapteur create(@RequestBody MesureCapteur m) {
        return service.create(m);
    }

    @GetMapping("/getAll")
    public List<MesureCapteur> getAll() {
        return service.getAll();
    }

    // Stats: capteurs ayant le plus de mesures de pollution sur les 24 dernières heures
    @GetMapping("/topp24")
    public List<MesureCapteurService.CapteurPollutionDto> topPollutionLast24h() {
        return service.getTopPollutionLast24h();
    }
}
