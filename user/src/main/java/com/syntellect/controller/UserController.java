package com.syntellect.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.syntellect.model.User;
import com.syntellect.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userservice;
	
	@RequestMapping("/hello")
	public String hello() {
		return "Hello World";
	}

	@GetMapping("/user")
	private List<User> getAllUsers() {
		return userservice.getAllUser();
	}
	
	@GetMapping("/user/{id}")
	private User getUser(@PathVariable("id") int id) {
		return userservice.getUserById(id);
	}
	
	@DeleteMapping("/user/{id}")
	private void deleteUser(@PathVariable("id") int id) {
		userservice.delete(id);
	}
	
	@PostMapping ("/user")
	private int saveUser(@RequestBody User user) {
		userservice.saveOrUpdate(user);
		return user.getId();
	}
	
	@PutMapping ("/user")
	private User update(@RequestBody User user) {
		userservice.saveOrUpdate(user);
		return user;
	}
	
}
