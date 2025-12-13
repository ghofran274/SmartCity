package com.cities.smartCity.service.bd1S;

import com.cities.smartCity.entity.bd1E.Trajet;
import com.cities.smartCity.entity.bd1E.VehiculeAutonome;
import com.cities.smartCity.repository.bd1R.TrajetRepository;
import com.cities.smartCity.repository.bd1R.VehiculeAutonomeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrajetService {

    private final TrajetRepository trajetRepository;
    private final VehiculeAutonomeRepository vehiculeRepository;
    public TrajetService(TrajetRepository trajetRepository, VehiculeAutonomeRepository vehiculeRepository) {
        this.trajetRepository = trajetRepository;
        this.vehiculeRepository = vehiculeRepository;
    }

    // return the trajet with best CO2 reduction
    public Trajet getBestCo2Trajet() {
        return trajetRepository.findTopByOrderByEconomieCo2Desc();
    }

    // if you want a list ordered by best -> worst
    public List<Trajet> getTrajetsOrderedByCo2() {
        return trajetRepository.findAllByOrderByEconomieCo2Desc();
    }
    public Trajet createTrajet(Trajet trajet) {
        if (trajet.getVehicule() != null && trajet.getVehicule().getId() != 0) {
            VehiculeAutonome v = vehiculeRepository
                    .findById(trajet.getVehicule().getId())
                    .orElseThrow(() -> new IllegalArgumentException("Vehicule not found"));
            trajet.setVehicule(v);
        }
        System.out.println("Vehicule in service = " + trajet.getVehicule());
        return trajetRepository.save(trajet);
    }


    public List<Trajet> getAllTrajets() {
        return trajetRepository.findAll();
    }
}
