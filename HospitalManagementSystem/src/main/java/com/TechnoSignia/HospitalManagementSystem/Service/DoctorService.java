package com.TechnoSignia.HospitalManagementSystem.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TechnoSignia.HospitalManagementSystem.DTO.DoctorDTO;
import com.TechnoSignia.HospitalManagementSystem.Entity.Doctor;
import com.TechnoSignia.HospitalManagementSystem.Mapper.DoctorMapper;
import com.TechnoSignia.HospitalManagementSystem.Repository.DoctorRepository;

@Service
public class DoctorService {
	
	@Autowired
	DoctorRepository doctorRepository;
	
	public DoctorDTO createDoctor(DoctorDTO doctorDTO) {
		Doctor doctor = DoctorMapper.mapToDoctor(doctorDTO);
		Doctor savedDoctor = doctorRepository.save(doctor);
		return DoctorMapper.mapToDoctorDTO(savedDoctor);
	}
	
	public DoctorDTO getDoctorbyId(Long empid) {
		Doctor doctor = doctorRepository.findById(empid).get();
		return DoctorMapper.mapToDoctorDTO(doctor);
	}
	
	public List<DoctorDTO> getAllDoctor(){
		List<Doctor> Doctors = doctorRepository.findAll();
		return Doctors.stream().map((doctor) -> DoctorMapper.mapToDoctorDTO(doctor))
				.collect(Collectors.toList());
	}
	
	public DoctorDTO updateDoctor(Long id,DoctorDTO doctorDTO) {
	    Doctor doctor = doctorRepository.findById(id).get();
	    doctor.setName(doctorDTO.getName());
	    doctor.setEmail(doctorDTO.getEmail());
	    doctor.setContact(doctorDTO.getContact());
	    doctor.setDepartment(doctorDTO.getDepartment());
	    doctor.setEducation(doctorDTO.getEducation());
	    doctor.setSpecialization(doctorDTO.getSpecialization());
	    
	    Doctor updateDoctorobj = doctorRepository.save(doctor);
	    return DoctorMapper.mapToDoctorDTO(updateDoctorobj);
		
	}
	
	public void deleteDoctor(Long id) {
		doctorRepository.deleteById(id);
	}
	
	public void deleteAllDoctor(){		
		doctorRepository.deleteAll();
	}

}
