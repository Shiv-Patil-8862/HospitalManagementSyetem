package com.TechnoSignia.HospitalManagementSystem.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class loginClient {

	@Id
	private Long id;
	private String email;
	
	private String password;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public loginClient(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	
	public loginClient() {
		
	}
}
