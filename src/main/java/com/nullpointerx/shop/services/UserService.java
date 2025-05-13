package com.nullpointerx.shop.services;

import com.nullpointerx.shop.model.User;
import com.nullpointerx.shop.repositories.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private UserRepository repository;
    private PasswordEncoder passwordEncoder;

    public UserService(UserRepository repository) {
        this.repository = repository;
        this.passwordEncoder = new BCryptPasswordEncoder();
    }

    public User userRegister(String username, String password){
        String senhaCriptografada = passwordEncoder.encode(password);
        return new User(username,senhaCriptografada);
    }

    public Optional<User> findByUser(String username){
        return repository.findByUser(username);
    }
}
