package com.TechnoSignia.HospitalManagementSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.TechnoSignia.HospitalManagementSystem.Entity.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long>{

}
