package com.TechnoSignia.HospitalManagementSystem.Mapper;

import com.TechnoSignia.HospitalManagementSystem.DTO.DoctorDTO;
import com.TechnoSignia.HospitalManagementSystem.Entity.Doctor;

public class DoctorMapper {
	
public static DoctorDTO mapToDoctorDTO(Doctor doctor) {
		
		return new DoctorDTO(
				doctor.getId(),
				doctor.getName(),
				doctor.getEducation(),
				doctor.getDepartment(),
				doctor.getEmail(),
				doctor.getContact(),
				doctor.getSpecialization()
	    );
	}
	
	public static Doctor mapToDoctor(DoctorDTO doc) {
		
		return new Doctor(
				doc.getId(),
				doc.getName(),
				doc.getEducation(),
				doc.getDepartment(),
				doc.getEmail(),
				doc.getContact(),
				doc.getSpecialization()
        );
	}

}
