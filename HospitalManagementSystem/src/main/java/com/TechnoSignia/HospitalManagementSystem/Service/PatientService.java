package com.TechnoSignia.HospitalManagementSystem.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TechnoSignia.HospitalManagementSystem.DTO.PatientDTO;
import com.TechnoSignia.HospitalManagementSystem.Entity.Patient;
import com.TechnoSignia.HospitalManagementSystem.Mapper.PatientMapper;
import com.TechnoSignia.HospitalManagementSystem.Repository.PatientRepository;



@Service
public class PatientService {

	@Autowired
	PatientRepository patientRepository;
	
	public PatientDTO createPatient(PatientDTO patientDTO) {
		Patient patient = PatientMapper.mapToPatient(patientDTO);
		Patient savedPatient = patientRepository.save(patient);
		return PatientMapper.mapToPatientDTO(savedPatient);
	}
	
	public PatientDTO getPatientbyId(Long empid) {
		Patient patient = patientRepository.findById(empid).get();
		return PatientMapper.mapToPatientDTO(patient);
	}
	
	public List<PatientDTO> getAllPatient(){
		List<Patient> patients = patientRepository.findAll();
		return patients.stream().map((patient) -> PatientMapper.mapToPatientDTO(patient))
				.collect(Collectors.toList());
	}
	
	public PatientDTO updatePatient(Long id,PatientDTO patientDTO) {
	    Patient patient = patientRepository.findById(id).get();
	    patient.setName(patientDTO.getName());
	    patient.setAddress(patientDTO.getAddress());
	    patient.setMobileno(patientDTO.getMobileno());
	    
	    Patient updatePatientobj = patientRepository.save(patient);
	    return PatientMapper.mapToPatientDTO(updatePatientobj);
		
	}
	
	public void deletePatient(Long id) {
		patientRepository.deleteById(id);
	}
	
	public void deleteAllPatient(){		
		patientRepository.deleteAll();
	}

}
