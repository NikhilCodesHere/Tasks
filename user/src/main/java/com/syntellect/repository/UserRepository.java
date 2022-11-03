package com.syntellect.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.syntellect.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
