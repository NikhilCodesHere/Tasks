package com.syntellect.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.syntellect.model.Model;

public interface UserRepository extends JpaRepository<Model, Integer>{

}
