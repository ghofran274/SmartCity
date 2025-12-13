package com.cities.smartCity.service.bd2S;

import com.cities.smartCity.entity.bd2E.Citoyen;
import com.cities.smartCity.repository.bd2R.CitoyenRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CitoyenService {

    private final CitoyenRepository citoyenRepository;

    public CitoyenService(CitoyenRepository citoyenRepository) {
        this.citoyenRepository = citoyenRepository;
    }

    public Citoyen create(Citoyen c) {
        return citoyenRepository.save(c);
    }

    public List<Citoyen> getAll() {
        return citoyenRepository.findAll();
    }

    public List<Citoyen> getAllOrderByScoreEngagementDesc() {
        return citoyenRepository.findAllByOrderByScoreEngagementDesc();
    }
}
