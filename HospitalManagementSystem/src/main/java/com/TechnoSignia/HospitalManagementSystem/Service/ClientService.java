package com.TechnoSignia.HospitalManagementSystem.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TechnoSignia.HospitalManagementSystem.DTO.ClientDTO;
import com.TechnoSignia.HospitalManagementSystem.DTO.loginClientDTO;
import com.TechnoSignia.HospitalManagementSystem.Entity.Client;
import com.TechnoSignia.HospitalManagementSystem.Mapper.ClientMapper;
import com.TechnoSignia.HospitalManagementSystem.Repository.ClientRepository;
import com.TechnoSignia.HospitalManagementSystem.Response.LoginResponce;


@Service
public class ClientService {

	@Autowired
	ClientRepository clientRepository;
	
	
	
	public ClientDTO createClient(ClientDTO clientDTO) {
		Client client = ClientMapper.mapToClient(clientDTO);
		Client savedClient = clientRepository.save(client);
		return ClientMapper.mapToClientDTO(savedClient);
	}
	
	public LoginResponce loginClient(loginClientDTO loginClientDTOs) {
		String mes ="";
		Client client = clientRepository.findByEmail(loginClientDTOs.getEmail());
		if(client != null) {
//			String password = loginClientDTOs.getPassword();
			String encodePassword = client.getPassword();
			if(encodePassword != "") {
				Optional<Client> clients = clientRepository.findOneByEmailAndPassword(loginClientDTOs.getEmail(),loginClientDTOs.getPassword());
				if(clients.isPresent()) {
					return new LoginResponce("login Successfully",true);
				}
				else {
					return new LoginResponce("login failed",false);
				}
			}else {
				return new LoginResponce("Password not match",false);
			}
		}else {
			return new LoginResponce("Email is not exist",false);
		}
	}
	
	public ClientDTO getClient(Long id) {
		Client client = clientRepository.findById(id).get();
		return ClientMapper.mapToClientDTO(client);
	}
	
	public List<ClientDTO> getAllClient(){
		List<Client> client = clientRepository.findAll();
		return client.stream().map((clients) -> ClientMapper.mapToClientDTO(clients))
			         .collect(Collectors.toList());
	}
	
	public ClientDTO updatClient(Long id,ClientDTO clientDTO) {
	    Client client = clientRepository.findById(id).get();
	    client.setName(clientDTO.getName());
	    client.setEmail(clientDTO.getEmail());
	    client.setPassword(clientDTO.getPassword());
	    client.setConfirmPassword(clientDTO.getConfirmPassword());
	    
	    Client clientObj = clientRepository.save(client);
	    return ClientMapper.mapToClientDTO(clientObj);
	    
	}
	
	public void deleteClient(Long id) {
		clientRepository.deleteById(id);
	}
	
}
