package yte.obs_proje.yte_obs_proje.academician.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import yte.obs_proje.yte_obs_proje.academician.entity.Academician;

import java.util.List;
import java.util.Optional;

public interface AcademicianRepository extends JpaRepository<Academician, Long> {
    Optional<Academician> findAcademicianById(Long id);

    List<Academician> findAll();
}
