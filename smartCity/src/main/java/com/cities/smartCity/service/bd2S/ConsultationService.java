package com.cities.smartCity.service.bd2S;

import com.cities.smartCity.entity.bd2E.Consultation;
import com.cities.smartCity.repository.bd2R.ConsultationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultationService {

    private final ConsultationRepository consultationRepository;

    public ConsultationService(ConsultationRepository consultationRepository) {
        this.consultationRepository = consultationRepository;
    }

    public Consultation create(Consultation c) {
        return consultationRepository.save(c);
    }

    public List<Consultation> getAll() {
        return consultationRepository.findAll();
    }
}
