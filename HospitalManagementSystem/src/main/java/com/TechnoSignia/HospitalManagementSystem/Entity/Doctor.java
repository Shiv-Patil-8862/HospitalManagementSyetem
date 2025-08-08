package com.TechnoSignia.HospitalManagementSystem.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
public class Doctor {
	
	@Id
	@GeneratedValue
	
	private Long id;
	
	private String name;
	
	private String education;
	
	private String department;
	
	private String email;
	
	private String contact;
	
	private String specialization;

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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	
	public Doctor() {
		
	}

	public Doctor(Long id2, String name2, String education2, String department2, String email2, String contact2,
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

	
}
