package com.example.CrudApplication.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ModelUser {

	@Id
	private Integer userId;
	private String username;
	private String email;
	private String designation;
	
	
	public Integer getuserId() {
		return userId;
	}
	public void setuserId(Integer userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	

}
