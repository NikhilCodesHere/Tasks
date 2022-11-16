package com.syntellect.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syntellect.Repository.Repository;
import com.syntellect.model.Model;


@Service
public class DBService {

	@Autowired
	Repository repository;

	public List<Model> getlistall() {
		List<Model> models = new ArrayList<>();
		return repository.findAll();
	}
	
//	public Model getmodel(Model model) {
//		return repository.getById(Id);
//	}

	public Model update(Model model) {
		return repository.save(model);
	}

	public void deleteModel(int id) {
		repository.deleteById(id);
	}

	public void createuser(Model model) {
		 repository.save(model);
	}

}
