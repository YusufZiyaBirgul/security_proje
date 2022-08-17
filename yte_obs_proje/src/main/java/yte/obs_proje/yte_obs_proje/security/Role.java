package yte.obs_proje.yte_obs_proje.security;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
    Academician,
    Student;

    @Override
    public String getAuthority() {
        return name();
    }
}
