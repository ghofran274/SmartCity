package com.cities.smartCity.controller.bd2C;

import com.cities.smartCity.entity.bd2E.Consultation;
import com.cities.smartCity.service.bd2S.ConsultationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/consultations")
public class ConsultationController {

    private final ConsultationService consultationService;

    public ConsultationController(ConsultationService consultationService) {
        this.consultationService = consultationService;
    }

    @PostMapping("/add")
    public ResponseEntity<Consultation> create(@RequestBody Consultation consultation) {
        Consultation saved = consultationService.create(consultation);
        return ResponseEntity.ok(saved);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Consultation>> getAll() {
        return ResponseEntity.ok(consultationService.getAll());
    }
}
