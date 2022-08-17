package yte.obs_proje.yte_obs_proje.security;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.*;
import yte.obs_proje.yte_obs_proje.academician.entity.Academician;
import yte.obs_proje.yte_obs_proje.academician.repository.AcademicianRepository;
import yte.obs_proje.yte_obs_proje.student.entity.Student;
import yte.obs_proje.yte_obs_proje.student.repository.StudentRepository;

@Component
public class AuthenticationService {


    private AcademicianRepository academicianRepository;

    private StudentRepository studentRepository;


    public Academician academician() {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        if (principal instanceof Users) {
            Users users = (Users) principal;
            return academicianRepository.findAcademicianById(users.getUserId()).orElseThrow(RuntimeException::new);
        }

        throw new RuntimeException();
    }

    public Student student() {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        if (principal instanceof Users) {
            Users users = (Users) principal;
            return studentRepository.findStudentById(users.getUserId()).orElseThrow(RuntimeException::new);
        }

        throw new RuntimeException();
    }

}