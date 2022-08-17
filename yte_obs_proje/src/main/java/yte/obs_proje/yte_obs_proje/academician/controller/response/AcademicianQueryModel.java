package yte.obs_proje.yte_obs_proje.academician.controller.response;

import yte.obs_proje.yte_obs_proje.academician.entity.Academician;

public record AcademicianQueryModel(
        Long id,
        String name,
        String surname,
        String username,
        String password
) {

    public AcademicianQueryModel(Academician academician){
        this(
                academician.getId(),
                academician.getName(),
                academician.getSurname(),
                academician.getUsername(),
                academician.getPassword()

        );
    }
}
