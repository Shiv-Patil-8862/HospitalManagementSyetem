package com.TechnoSignia.HospitalManagementSystem.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.TechnoSignia.HospitalManagementSystem.Entity.Client;



public interface ClientRepository extends JpaRepository<Client, Long> {

		Optional<Client> findOneByEmailAndPassword(String email,String password);
		
		Client findByEmail(String email);
		
	
}
