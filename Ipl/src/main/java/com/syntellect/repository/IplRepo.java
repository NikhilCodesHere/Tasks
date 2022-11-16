package com.syntellect.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.syntellect.model.IplModel;
@Repository
public interface IplRepo extends JpaRepository<IplModel, Integer>{

}
