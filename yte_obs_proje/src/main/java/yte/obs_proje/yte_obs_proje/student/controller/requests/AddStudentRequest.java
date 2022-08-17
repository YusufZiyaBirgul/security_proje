package yte.obs_proje.yte_obs_proje.student.controller.requests;


import yte.obs_proje.yte_obs_proje.common.validators.TcKimlikNo;
import yte.obs_proje.yte_obs_proje.student.entity.Student;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public record AddStudentRequest(
        @NotBlank
        @Size(max = 25)
        String name,
        @NotBlank
        @Size(max = 25)
        String surname,

        String email,
        String username,
        String password

) {

    public Student toDomainEntity() {
        return new Student(name, surname, email, username, password);
    }
}
