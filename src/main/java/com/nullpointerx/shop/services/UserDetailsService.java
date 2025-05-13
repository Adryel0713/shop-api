package com.nullpointerx.shop.services;

import com.nullpointerx.shop.repositories.UserRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService {

    private final UserRepository repository;

    public UserDetailsService(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        var user = repository.findByUser(username).orElseThrow(() -> new UsernameNotFoundException("Usuario não encontrado"));
        return User.builder().username(user.getUsername()).password(user.getPassword()).roles("USER").build();
    }
}
