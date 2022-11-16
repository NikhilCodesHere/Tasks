package com.example.service;


import java.util.ArrayList;
import java.util.List;

//import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Model;
import com.example.repository.Repository;

@Service
public class DBservices {
	
@Autowired
Repository exampleModelRepo;
public List <Model> list =new ArrayList<>();
public void addModel(Model model) {
	list.add(model);
	exampleModelRepo.saveAll(list);
}
}
