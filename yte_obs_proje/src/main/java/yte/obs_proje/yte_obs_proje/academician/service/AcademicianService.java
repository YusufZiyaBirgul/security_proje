package yte.obs_proje.yte_obs_proje.academician.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import yte.obs_proje.yte_obs_proje.academician.entity.Academician;
import yte.obs_proje.yte_obs_proje.academician.repository.AcademicianRepository;
import yte.obs_proje.yte_obs_proje.common.response.MessageResponse;
import yte.obs_proje.yte_obs_proje.common.response.ResponseType;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AcademicianService {

    private final AcademicianRepository academicianRepository;

    public MessageResponse addAcademician(Academician academician) {
        academicianRepository.save(academician);

        return new MessageResponse(ResponseType.SUCCESS, "Akademisyen başarıyla eklendi");
    }

    public List<Academician> getAllAcademician() {
        return academicianRepository.findAll();
    }

    public Academician getById(Long id) {

        return academicianRepository.findById(id)
                .orElseThrow(() -> (new EntityNotFoundException("Akademisyen bulunamadı")));

    }

    public MessageResponse updateAcademician(Long id, Academician updateAcademician) {

        Academician academician = academicianRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Akademisyen bulunamadı"));

        academician.update(updateAcademician);

        academicianRepository.save(academician);

        return new MessageResponse(ResponseType.SUCCESS, "Akademisyen başarıyla güncellendi");

    }

    public MessageResponse deleteAcademician(Long id) {
        academicianRepository.deleteById(id);
        return new MessageResponse(ResponseType.SUCCESS, "Akademisyen başarıyla silindi");


    }


}