package com.TechnoSignia.HospitalManagementSystem.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.TechnoSignia.HospitalManagementSystem.DTO.PatientDTO;
import com.TechnoSignia.HospitalManagementSystem.Service.PatientService;

@CrossOrigin("*")
@RestController
@RequestMapping("/Patient")
public class PatientController {

	@Autowired
	PatientService patientService;
	
	@PostMapping
	public ResponseEntity<PatientDTO> createPatient(@RequestBody PatientDTO patientDTO) { 
		PatientDTO savedPatient = patientService.createPatient(patientDTO);
		return new ResponseEntity<>(savedPatient,HttpStatus.CREATED);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<PatientDTO> getPatientId(@PathVariable("id") Long empid){
		PatientDTO patientDTO = patientService.getPatientbyId(empid);
		return ResponseEntity.ok(patientDTO);
	}
	
	@GetMapping
	public ResponseEntity<List<PatientDTO>> getAllPatients(){
	    List<PatientDTO> patientDTO = patientService.getAllPatient();
		return ResponseEntity.ok(patientDTO);
	}
	
	@PutMapping("{id}")
	public ResponseEntity<PatientDTO> updatePatient(@PathVariable("id") Long id,@RequestBody PatientDTO patientDTO){
		PatientDTO patientDTO2 = patientService.updatePatient(id, patientDTO);
		return ResponseEntity.ok(patientDTO2);
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<String> deletePatient(@PathVariable Long id) {
		patientService.deletePatient(id);
		return ResponseEntity.ok("Patient Successfully deleted!");
	}
	
	@DeleteMapping
	public String deleteAllPatients(){
		patientService.deleteAllPatient();
		return "All Patient Has been deleted!";
	}
}
