package com.TechnoSignia.HospitalManagementSystem.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Client")
@AllArgsConstructor
@NoArgsConstructor
public class Client {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String email;
	private String password;
	private String confirmPassword;
	
	public Client() {
		
	}
	
	public Client(Long id2, String name2, String email2, String password2, String confirmPassword2) {
		
		this.id = id2;
		this.name = name2;
		this.email = email2;
		this.password = password2;
		this.confirmPassword = confirmPassword2;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
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
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	
	
}
