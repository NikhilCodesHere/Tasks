package com.syntellect.controller;

import java.util.List;

import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.syntellect.Repository.Repository;
import com.syntellect.model.Model;
import com.syntellect.service.DBService;
@RequestMapping
@RestController
public class HelloController {
	@Autowired
	DBService services;
	Repository repository;
	
	@PostMapping
	public String createUser(@RequestBody Model model) {
		 services.createuser(model);
		 return "Created";	 
	}

	@GetMapping("/list")
	public List<Model> getlist(){
		return services.getlistall();
	}
	
	@PutMapping("/update")
	public Model updateModel(@RequestBody Model model) {
		try {
			services.update(model);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return services.update(model);
	}
	
	@DeleteMapping("delete/{id}")
	public void deleteModel(@PathVariable ("id") int id) {
		services.deleteModel(id);
	}
}
