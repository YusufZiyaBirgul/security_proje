package yte.obs_proje.yte_obs_proje.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import yte.obs_proje.yte_obs_proje.student.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Long> {

    Optional<Student> findStudentById(Long id);

    List<Student> findAll();
}
