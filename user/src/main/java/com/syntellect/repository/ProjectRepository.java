package com.syntellect.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.syntellect.model.Project;
import com.syntellect.model.User;

public interface ProjectRepository extends JpaRepository<Project, Integer>{

}
