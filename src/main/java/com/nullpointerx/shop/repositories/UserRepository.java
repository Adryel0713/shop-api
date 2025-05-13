package com.nullpointerx.shop.repositories;

import com.nullpointerx.shop.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {

    Optional<User> findByUser(String username);
}
