package com.syntellect.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syntellect.model.Project;
import com.syntellect.model.User;
import com.syntellect.repository.ProjectRepository;

@Service
public class ProjectService {

		@Autowired
		ProjectRepository projectrepository;

		public List<Project> getAllProject() {
			List<Project> project = new ArrayList<Project>();
			projectrepository.findAll();
			return project;
		}

//		public Project getUserById(int id) {
//			return projectrepository.findById(id).get();
//		}

		public void saveOrUpdate(Project project) {
			projectrepository.save(project);
		}



	}


