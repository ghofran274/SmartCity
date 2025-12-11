package com.cities.smartCity.controller;

import com.cities.smartCity.entity.Trajet;
import com.cities.smartCity.service.TrajetService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trajet")
public class TrajetController {

    private final TrajetService trajetService;

    public TrajetController(TrajetService trajetService) {
        this.trajetService = trajetService;
    }
    @GetMapping("/getAll")
    public List<Trajet> getAllTrajets() {
        return trajetService.getAllTrajets();
    }


    // all trajets ordered by best CO2 reduction
    @GetMapping("/by-co2")
    public List<Trajet> getTrajetsOrderedByCo2() {
        return trajetService.getTrajetsOrderedByCo2();
    }

    // only the best trajet (maximum economie_co2)
    @GetMapping("/best-co2")
    public Trajet getBestCo2Trajet() {
        return trajetService.getBestCo2Trajet();
    }
    @PostMapping("/add")
    public Trajet createTrajet(@RequestBody Trajet trajet) {
        System.out.println("Received trajet = " + trajet);
        System.out.println("Vehicule = " + (trajet.getVehicule() != null ? trajet.getVehicule().getId() : null));
        return trajetService.createTrajet(trajet);
    }

}
