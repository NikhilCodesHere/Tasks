package com.syntellect.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.syntellect.model.Project;
import com.syntellect.model.User;
import com.syntellect.service.ProjectService;

@RestController
public class ProjectController {

	@Autowired
	ProjectService projectservice;
	
//	@GetMapping("/projectId")
//	private List<Project> getAllProject() {
//		
//		return projectservice.findAll();// Why not giving me method automatically?
//	}
	
	@PostMapping ("/projectId")
	private int saveProject(@RequestBody Project project) {
		projectservice.saveOrUpdate(project);
		return project.getProjectId();
	}
	
}
