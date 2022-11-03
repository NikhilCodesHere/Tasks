package com.syntellect.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syntellect.model.User;
import com.syntellect.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;

	public List<User> getAllUser() {
		List<User> user = new ArrayList<User>();
		userRepository.findAll();
		return user;
	}

	public User getUserById(int id) {
		return userRepository.findById(id).get();
	}

	public void saveOrUpdate(User user) {
		userRepository.save(user);
	}

	public void delete(int id) {
		userRepository.deleteById(id);

	}

	public void saveOrUpdate(User user, int id) {
		userRepository.save(user);
	}

}
