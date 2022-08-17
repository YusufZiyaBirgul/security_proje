package yte.obs_proje.yte_obs_proje.academician.controller.request;

import yte.obs_proje.yte_obs_proje.academician.entity.Academician;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public record AddAcademicianRequest(
        @NotBlank
        @Size(max = 25)
        String name,

        @Size(max = 25)
        @NotBlank
        String surname,

        String username,

        String password
) {
    public Academician toDomainEntity() {
        return new Academician(name, surname, username, password);//, Set.of(new Lesson(lesson)));
    }

}
