package com.syntellect;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.syntellect.model.Project;
import com.syntellect.model.User;
import com.syntellect.repository.UserRepository;

@SpringBootApplication

public class UserApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(UserApplication.class, args);
		
		
		
		
	}
	@Autowired
	private UserRepository userRepository ;

	@Override
	public void run(String... args) throws Exception {
		
	
		
		Project p1= new Project (101,"Raymond",101);

		User user = new User (104,"Sahil","Gujar");
	
		user.getProject().add(p1);

		
		this.userRepository.save(user);
		

				
	}

}

