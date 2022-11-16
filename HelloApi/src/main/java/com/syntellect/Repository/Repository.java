package com.syntellect.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.syntellect.model.Model;

public interface Repository extends JpaRepository<Model, Integer>{

}
