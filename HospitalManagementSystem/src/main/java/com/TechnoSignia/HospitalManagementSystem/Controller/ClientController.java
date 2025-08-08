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

import com.TechnoSignia.HospitalManagementSystem.DTO.ClientDTO;
import com.TechnoSignia.HospitalManagementSystem.DTO.loginClientDTO;
import com.TechnoSignia.HospitalManagementSystem.Response.LoginResponce;
import com.TechnoSignia.HospitalManagementSystem.Service.ClientService;



@CrossOrigin("*")
@RestController
@RequestMapping("/Client")
public class ClientController {

	@Autowired
	ClientService clientService;
	
	@PostMapping("/Save")
	public ResponseEntity<ClientDTO> createClient(@RequestBody ClientDTO clientDTO){
		ClientDTO savedClient = clientService.createClient(clientDTO);
		return new ResponseEntity<>(savedClient,HttpStatus.CREATED);
	}
	
	@PostMapping("/login")
	public ResponseEntity<LoginResponce> createlogin(@RequestBody loginClientDTO loginClientDTOs){
		LoginResponce loginClientDTO= clientService.loginClient(loginClientDTOs);
		return ResponseEntity.ok(loginClientDTO);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<ClientDTO> getClient(@PathVariable Long id){
		ClientDTO clientDTO = clientService.getClient(id);
		return ResponseEntity.ok(clientDTO);
	}
	
	@GetMapping
	public ResponseEntity<List<ClientDTO>> getAllClient(){
		List<ClientDTO> clientDTO = clientService.getAllClient();
		return ResponseEntity.ok(clientDTO);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<ClientDTO> updateClient(@PathVariable Long id, @RequestBody ClientDTO clientDTO){
		ClientDTO clients = clientService.updatClient(id, clientDTO);
		return ResponseEntity.ok(clients);
	}
	
	@DeleteMapping("/{id}")
	public String deleteClient(@PathVariable Long id) {
		
		clientService.deleteClient(id);
		return "Client Deleted Successfully";
	}
	
}
