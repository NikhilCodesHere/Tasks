package com.syntellect.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Model {
	@Column(name = "product")
private String product;
	@Column(name = "user_name")
private String name;
@Id
@Column(name = "user_id")
private int user_id;

public Model(String product, String name, int user_id) {
	super();
	this.product = product;
	this.name = name;
	this.user_id = user_id;
}
public String getProduct() {
	return product;
}
public void setProduct(String product) {
	this.product = product;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getUser_id() {
	return user_id;
}
public void setUser_id(int user_id) {
	this.user_id = user_id;
}
public Model() {
	
}





}
