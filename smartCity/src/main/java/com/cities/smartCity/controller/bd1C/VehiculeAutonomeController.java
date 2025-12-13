// Controller
package com.cities.smartCity.controller.bd1C;

import com.cities.smartCity.entity.bd1E.VehiculeAutonome;
import com.cities.smartCity.service.bd1S.VehiculeAutonomeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehicules")
public class VehiculeAutonomeController {

    private final VehiculeAutonomeService service;

    public VehiculeAutonomeController(VehiculeAutonomeService service) {
        this.service = service;
    }

    @GetMapping("/getAll")
    public List<VehiculeAutonome> getAll() {
        return service.getAll();
    }

    @PostMapping("/add")
    public VehiculeAutonome create(@RequestBody VehiculeAutonome v) {
        return service.create(v);
    }
}
