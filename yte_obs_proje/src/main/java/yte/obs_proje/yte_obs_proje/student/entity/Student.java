package yte.obs_proje.yte_obs_proje.student.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import yte.obs_proje.yte_obs_proje.common.entity.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@NoArgsConstructor
public class Student extends BaseEntity {


    private String name;
    private String surname;
    private String email;
    private String username;
    private String password;


    //@ManyToMany
    //@JoinColumn(name = "student_id")
    //private Set<Book> books = new HashSet<>();

   /* @ManyToMany
    @JoinColumn(name = "lesson_id")
    private Set<Lesson> lessons=new HashSet<>();*/
    public Student(String name, String surname, String email, String username, String password) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.username = username;
        this.password = password;
    }

    public void update(Student updatedStudent) {
        this.name = updatedStudent.name;
        this.surname = updatedStudent.surname;
        this.email = updatedStudent.email;
        this.password=updatedStudent.password;
    }

}
