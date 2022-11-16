package com.syntellect.controller;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.syntellect.model.Model;
import com.syntellect.service.UserService;

@RestController
public class UserController {
	@Autowired
	
	UserService userservice;
	@GetMapping( "/get")
	public List<Model> getlist(){
		
		return userservice.getList();
		
	}
	
	@GetMapping("/get/{id}")
	public Model getModel(@PathVariable("id") int id) {
		return userservice.getmodelbyid(id);
	}
	
	@PostMapping("/add")
	public void add(@RequestBody Model model) {
		userservice.add(model);
	}
	@PostMapping("/addlist")
	public void addlist(@RequestBody List<Model> model) {
		userservice.addlist(model);
	}
	
	@PutMapping("/update")
	public Model update(@RequestBody Model model) {
		return userservice.update(model);
		
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete (@PathVariable ("id")int id) {
		userservice.delete(id);
		return "User deleted";
	}
	
	

    @GetMapping(value = "/getbythread")
    public  CompletableFuture<List<Model>> getUsers(){
        CompletableFuture<List<Model>> model1=userservice.findAllUsers();
        CompletableFuture<List<Model>> model2=userservice.findAllUsers();
        CompletableFuture<List<Model>> model3=userservice.findAllUsers();
        long start = System.currentTimeMillis();
        CompletableFuture.allOf(model1,model2,model3).join();
        return userservice.findAllUsers();

}
    @PostMapping("/addbythread")
    public void addbyhready(@RequestBody List<Model> model) {
    	
		userservice.saveUsers(model);
		
	}
    
    
}
