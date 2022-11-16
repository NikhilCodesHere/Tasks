package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Model;
import com.example.service.*;
import com.google.gson.Gson;

@RestController
@RequestMapping
public class ExController {

	@Autowired
	DBservices dBservices;

	@PostMapping("/add")
	public void addModel(@RequestBody String modelString) {
		Model model = new Gson().fromJson(modelString, Model.class);
		dBservices.addModel(model);
	}
}
