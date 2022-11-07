package com.syntellect.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="user_table")	

public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name="user_id",nullable=false,unique = true)
	private int id;

	@Column (name="first_name")
	private String firstName;

	@Column (name="last_name")
	private String lastName;
	
	@OneToMany (mappedBy = "user",fetch = FetchType.LAZY,cascade = CascadeType.ALL )
	
	private List <Project> project= new ArrayList<>();

	public List<Project> getProject() {
		return project;
	}

	public void setProject(List<Project> project) {
		this.project = project;
	
	}
	

	public User(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	

	public User(int id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		
	}

	public User() {
		
	}	
	

}