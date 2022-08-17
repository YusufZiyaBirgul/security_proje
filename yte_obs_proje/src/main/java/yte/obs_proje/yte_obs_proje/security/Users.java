package yte.obs_proje.yte_obs_proje.security;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import yte.obs_proje.yte_obs_proje.common.entity.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.*;
import java.util.Collection;
import java.util.Collections;

@Data
@Entity
@Table(name = "USERS")
public class Users extends BaseEntity implements UserDetails {



    @Column(name = "USERNAME")
    private String username;

    @Column(name = "PASSWORD")
    private String password;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "ROLE")
    private Role role;

    @Column(name = "USER_ID")
    private Long userId;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.singletonList(role);
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

}