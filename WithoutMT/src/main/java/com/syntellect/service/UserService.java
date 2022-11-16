package com.syntellect.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
//import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.syntellect.model.Model;
import com.syntellect.repository.UserRepository;



@Service
public class UserService {
	@Autowired
	UserRepository userrepository;
	public List<Model> list = new ArrayList<>();
	
	//get list
	public List<Model> getList() {
		return userrepository.findAll();
	}
	
	//get by id
	public Model getmodelbyid(int id) {
		return userrepository.findById(id).get();
	}
	
	//add 
	public void add(Model model) {
		//userrepository.save(model);
		list.add(model);
		userrepository.saveAll(list);
	}
	
	public void addlist(List<Model> model) {
		long start = System.currentTimeMillis();
		userrepository.saveAll(model);
		long end = System.currentTimeMillis();
		logger.info("Total time {}", (end - start));	
	}
	
	
	
	//update
	public Model update(Model model) {
		return userrepository.save(null);
	}
	
	//delete
	public void delete(int id) {
		userrepository.deleteById(id);
	}
	
	Object target;
	Logger logger = LoggerFactory.getLogger(UserService.class);
	
	 @Async
	    public CompletableFuture<List<Model>> adduser(Model model){
		 long start = System.currentTimeMillis();
	        logger.info("saving list of users of size {}", list.size(), "" + Thread.currentThread().getName());
	        list = userrepository.saveAll(list);
	        long end = System.currentTimeMillis();
	        logger.info("Total time {}", (end - start));
	        return CompletableFuture.completedFuture(list);
	 }
	
	    @Async
	    public CompletableFuture<List<Model>> findAllUsers(){
	        logger.info("get list of user by "+Thread.currentThread().getName());
	        List<Model> model=userrepository.findAll();
	        return CompletableFuture.completedFuture(model);
	    }
	    
	    @Async
	    public CompletableFuture<List<Model>> saveUsers(List<Model> model) {
	        long start = System.currentTimeMillis();
	        logger.info("saving list of users of size {}", model.size(), "" + Thread.currentThread().getName());
	        list = userrepository.saveAll(model);
	        long end = System.currentTimeMillis();
	        logger.info("Total time {}", (end - start));
	        return CompletableFuture.completedFuture(list);
	    }
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
