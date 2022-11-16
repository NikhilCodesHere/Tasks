package com.syntellect.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.syntellect.model.IplModel;
import com.syntellect.service.IplService;

@RestController
public class IplController {
	@Autowired
	IplService iplservice;
	
	@GetMapping("/getmatch")
	public List<IplModel> getIplModels(){
		return iplservice.getIplModel();
	}
	
	@PostMapping("/addmatch")
	public void addmatch(@RequestBody IplModel iplModel) {
		iplservice.addIplModel(iplModel);
	}
	
	@PutMapping("/update")
	public IplModel update(@RequestBody IplModel iplModel) {
		return iplservice.updateIplModel(iplModel);
	}
	@DeleteMapping("/delete/{id}")
	public String deleteIplModel (@PathVariable ("id") Integer id) {
		 iplservice.deleteIplModel(id);
		 return "Reord Deleted";
		
}
}
