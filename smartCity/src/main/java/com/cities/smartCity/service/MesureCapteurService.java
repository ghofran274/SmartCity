package com.cities.smartCity.service;

import com.cities.smartCity.entity.MesureCapteur;
import com.cities.smartCity.repository.MesureCapteurRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class MesureCapteurService {

    private final MesureCapteurRepository repo;

    public MesureCapteurService(MesureCapteurRepository repo) {
        this.repo = repo;
    }

    // ----- CRUD simple -----
    public MesureCapteur create(MesureCapteur m) {
        return repo.save(m);
    }

    public List<MesureCapteur> getAll() {
        return repo.findAll();
    }

    // ----- STATS : capteurs les plus polluants sur 24h -----
    public List<CapteurPollutionDto> getTopPollutionLast24h() {
        LocalDateTime to = LocalDateTime.now();
        LocalDateTime from = to.minusHours(24);

        List<Object[]> rows = repo.findCapteursPollutionOrdered(from, to);
        List<CapteurPollutionDto> result = new ArrayList<>();

        for (Object[] row : rows) {
            Integer idCapteur = (Integer) row[0];
            String nomCapteur = (String) row[1];
            Double total = (Double) row[2];
            result.add(new CapteurPollutionDto(idCapteur, nomCapteur, total.floatValue()));
        }
        return result;
    }

    public static class CapteurPollutionDto {
        public Integer idCapteur;
        public String nomCapteur;
        public Float totalPollution;

        public CapteurPollutionDto(Integer idCapteur, String nomCapteur, Float totalPollution) {
            this.idCapteur = idCapteur;
            this.nomCapteur = nomCapteur;
            this.totalPollution = totalPollution;
        }
    }
}
