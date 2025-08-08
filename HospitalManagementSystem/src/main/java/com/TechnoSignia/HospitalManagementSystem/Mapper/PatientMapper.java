package com.TechnoSignia.HospitalManagementSystem.Mapper;


import com.TechnoSignia.HospitalManagementSystem.DTO.PatientDTO;

import com.TechnoSignia.HospitalManagementSystem.Entity.Patient;

public class PatientMapper {
	
public static PatientDTO mapToPatientDTO(Patient patient) {
		
		return new PatientDTO(
				patient.getId(),
				patient.getName(),
				patient.getAddress(),
				patient.getMobileno()
	    );
	}
	
	public static Patient mapToPatient(PatientDTO pat) {
		
		return new Patient(
				pat.getId(),
				pat.getName(),
				pat.getAddress(),
				pat.getMobileno()
        );
	}

}
