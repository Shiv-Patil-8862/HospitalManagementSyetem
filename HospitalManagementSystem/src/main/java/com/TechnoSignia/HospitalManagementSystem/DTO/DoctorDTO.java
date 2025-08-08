package com.TechnoSignia.HospitalManagementSystem.DTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class DoctorDTO {
	
	private Long id;
	
	@NotNull( message = "Doctor first Name Shoudn't be null")
	private String name;
	
	@NotNull( message = "Employee education Shoudn't be null")
	private String education;
	
	private String department;
	
	@Email( message = "Invalid Email address")
	private String email;
	
	@Pattern(regexp = "^\\d{10}$",message = "invalid mobile number entered ")
	private String contact;
	
	private String specialization;
	
	public DoctorDTO() {
		
	}

	public DoctorDTO(Long id2, String name2, String education2, String department2, String email2, String contact2,
			String specialization2) {
		super();
		this.id=id2;
		this.name=name2;
		this.education=education2;
		this.department=department2;
		this.email=email2;
		this.contact=contact2;
		this.specialization=specialization2;
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

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

 
	

}
