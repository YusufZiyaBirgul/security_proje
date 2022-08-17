package yte.obs_proje.yte_obs_proje.academician.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import yte.obs_proje.yte_obs_proje.common.entity.BaseEntity;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Academician extends BaseEntity {


    private String name;
    private String surname;
    private String username;
    private String password;




    public Academician(String name, String surname, String username, String password) {
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.password = password;
    }

    public void update(Academician updateAcademician) {
        this.name = updateAcademician.name;
        this.surname = updateAcademician.surname;
        this.password = updateAcademician.password;
    }
}
