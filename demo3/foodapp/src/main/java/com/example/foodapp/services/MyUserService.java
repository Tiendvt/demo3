package com.example.foodapp.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.example.foodapp.entity.RoleEntity;
import com.example.foodapp.entity.UserEntity;

public class MyUserService implements UserDetails {
    private static final long serialVersionUID = 1L;
    private UserEntity user;

    public MyUserService(UserEntity user) {
        this.user = user;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        Set<RoleEntity> roles = user.getRoles();
        List<SimpleGrantedAuthority> authorities = new ArrayList<>();
        for (RoleEntity role : roles) {
            authorities.add(new SimpleGrantedAuthority(role.getName()));
        }
        return authorities;
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true; // Change this logic if you have fields for account expiration
    }

    @Override
    public boolean isAccountNonLocked() {
        return true; // Change this logic if you have fields for account locking
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true; // Change this logic if you have fields for credential expiration
    }

    @Override
    public boolean isEnabled() {
        return user.isEnabled(); // Ensure UserEntity has an `isEnabled` field
    }
}
