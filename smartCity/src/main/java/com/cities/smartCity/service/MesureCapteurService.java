package com.cities.smartCity.service;


import com.cities.smartCity.entity.MesureCapteur;
import com.cities.smartCity.repository.MesureCapteurRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MesureCapteurService {

    private final MesureCapteurRepository repository;

    public MesureCapteurService(MesureCapteurRepository repository) {
        this.repository = repository;
    }

    public MesureCapteur create(MesureCapteur m) {
        return repository.save(m);
    }

    public MesureCapteur getById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public List<MesureCapteur> getAll() {
        return repository.findAll();
    }

    public MesureCapteur update(Integer id, MesureCapteur m) {
        m.setIdMesureCapteur(id);
        return repository.save(m);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}

