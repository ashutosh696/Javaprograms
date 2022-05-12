package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.User;

public interface Userrepo extends JpaRepository<User, Integer> {

	Optional<User> findByEmail(String email);
}
