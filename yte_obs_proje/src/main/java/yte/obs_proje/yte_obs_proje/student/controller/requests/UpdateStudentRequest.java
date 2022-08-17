package yte.obs_proje.yte_obs_proje.student.controller.requests;

import yte.obs_proje.yte_obs_proje.student.entity.Student;

public record UpdateStudentRequest(
        String name,
        String surname,
        String email,
        String username,
        String password
) {

    public Student toDomainEntity() {
        return new Student(name, surname, email, username, password);
    }
}
