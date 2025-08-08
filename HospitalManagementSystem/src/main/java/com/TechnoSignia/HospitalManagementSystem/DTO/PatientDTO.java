package com.TechnoSignia.HospitalManagementSystem.DTO;


import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class PatientDTO {
	
    private Long id;
	
	@NotNull( message = "Employee first Name Shoudn't be null")
	private String name;
	
	@NotNull( message = "Employee Last name Shoudn't be null")
	private String address;
	
	@Pattern(regexp = "^\\d{10}$",message = "invalid mobile number entered ")
	private String mobileno;

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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public PatientDTO(Long id, @NotNull(message = "Employee first Name Shoudn't be null") String name,
			@NotNull(message = "Employee Last name Shoudn't be null") String address,
			@Pattern(regexp = "^\\d{10}$", message = "invalid mobile number entered ") String mobileno) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.mobileno = mobileno;
	}
	
	public PatientDTO() {
		
	}

}
