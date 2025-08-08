package com.TechnoSignia.HospitalManagementSystem.DTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class ClientDTO {

	private Long id;
	@NotNull( message = "Employee first Name Shoudn't be null")
	private String name;
	@Email( message = "Invalid Email address")
	private String email;
	@NotBlank(message = "Password is Mandotaroy")
	private String password;
	@NotBlank(message = "ConfirmPassword is Mandotaroy")
	private String confirmPassword;

	public ClientDTO(Long id2, String name2, String email2, String password2, String confirmPassword2) {

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
