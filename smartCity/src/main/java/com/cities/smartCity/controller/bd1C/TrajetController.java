package com.cities.smartCity.controller.bd1C;

import com.cities.smartCity.entity.bd1E.Trajet;
import com.cities.smartCity.service.bd1S.TrajetService;
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
