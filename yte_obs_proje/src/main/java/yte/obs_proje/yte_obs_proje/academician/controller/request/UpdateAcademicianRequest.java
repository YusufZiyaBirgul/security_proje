package yte.obs_proje.yte_obs_proje.academician.controller.request;

import yte.obs_proje.yte_obs_proje.academician.entity.Academician;

public record UpdateAcademicianRequest(
        String name,

        String surname,

        String username,

        String password
) {
    public Academician toDomainEntity() {
        return new Academician(name, surname, username, password);
    }

}
