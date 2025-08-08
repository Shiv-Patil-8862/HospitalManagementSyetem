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

import com.TechnoSignia.HospitalManagementSystem.DTO.DoctorDTO;
import com.TechnoSignia.HospitalManagementSystem.Service.DoctorService;


@CrossOrigin("*")
@RestController
@RequestMapping("/doctor")
public class DoctorController {


	@Autowired
	DoctorService doctorService;
	
	@PostMapping
	public ResponseEntity<DoctorDTO> createDoctor(@RequestBody DoctorDTO doctorDTO) { 
		DoctorDTO savedDoctor = doctorService.createDoctor(doctorDTO);
		return new ResponseEntity<>(savedDoctor,HttpStatus.CREATED);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<DoctorDTO> getDoctorId(@PathVariable("id") Long empid){
		DoctorDTO doctorDTO = doctorService.getDoctorbyId(empid);
		return ResponseEntity.ok(doctorDTO);
	}
	
	@GetMapping
	public ResponseEntity<List<DoctorDTO>> getAllDoctors(){
	    List<DoctorDTO> doctorDTO = doctorService.getAllDoctor();
		return ResponseEntity.ok(doctorDTO);
	}
	
	@PutMapping("{id}")
	public ResponseEntity<DoctorDTO> updateDoctor(@PathVariable("id") Long id,@RequestBody DoctorDTO doctorDTO){
		DoctorDTO doctorDTO2 = doctorService.updateDoctor(id, doctorDTO);
		return ResponseEntity.ok(doctorDTO2);
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteDoctor(@PathVariable Long id) {
		doctorService.deleteDoctor(id);
		return ResponseEntity.ok("Doctor Successfully deleted!");
	}
	
	@DeleteMapping
	public String deleteAllDoctors(){
		doctorService.deleteAllDoctor();
		return "All Doctor Has been deleted!";
	}
}
	
