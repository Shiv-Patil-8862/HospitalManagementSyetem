package com.TechnoSignia.HospitalManagementSystem.DTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class loginClientDTO {

	@Email( message = "Invalid Email address")
	private String email;
	@NotBlank(message = "Password is Mandotaroy")
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
	public loginClientDTO(@Email(message = "Invalid Email address") String email,
			@NotBlank(message = "Password is Mandotaroy") String password) {
		super();
		this.email = email;
		this.password = password;
	}
	
	public loginClientDTO() {
		
	}
}
