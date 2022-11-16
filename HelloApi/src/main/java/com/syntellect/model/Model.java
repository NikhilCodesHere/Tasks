package com.syntellect.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;



@Entity
@Table(name = "user_mapping")
public class Model {
	@Autowired
@Column(name = "first_name")
private String firstName;
@Column(name = "last_name")
private String lastName;
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "user_id")
private int id;
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
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Model(String firstName, String lastName, int id) {
	this.firstName = firstName;
	this.lastName = lastName;
	this.id = id;
}
public Model() {
	
}




}
