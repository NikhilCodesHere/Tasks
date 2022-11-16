package com.syntellect.service;


import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.syntellect.model.User;
import com.syntellect.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;

	public List<User> getAllUser() {
		List<User> user=new ArrayList<>();
		return userRepository.findAll();
	}

	public User getUserById(int id) {
		return userRepository.findById(id).get();
	}

	public User update(User user) {
		return userRepository.save(user);
	}

	public void delete(int id) {
		userRepository.deleteById(id);

	}

	public void create (User user) {
		userRepository.save(user);
	}

//	@Test
//	public void getidmorethanvalue() {
//		Integer value = 102;
//		Pageable pageable= PageRequest.of(0, 0);
//		List<User> userlist= userRepository.getuseridmorethanvalue(value,pageable);
//		userlist.forEach(System.out::println);
//	}
//	

}