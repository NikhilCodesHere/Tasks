package com.syntellect.repository;


import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.syntellect.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	@Query(value = "select * from user_table where user_id > :value",nativeQuery = true)
	public List <User> getuseridmorethanvalue(Integer value,Pageable pageable);
}