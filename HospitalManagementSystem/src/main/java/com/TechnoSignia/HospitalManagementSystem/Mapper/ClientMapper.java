package com.TechnoSignia.HospitalManagementSystem.Mapper;

import com.TechnoSignia.HospitalManagementSystem.DTO.ClientDTO;
import com.TechnoSignia.HospitalManagementSystem.Entity.Client;

public class ClientMapper {

public static ClientDTO mapToClientDTO(Client client) {
		
		return new ClientDTO(
				client.getId(),
				client.getName(),
				client.getEmail(),
				client.getPassword(),
				client.getConfirmPassword()
	    );
	}
	
	public static Client mapToClient(ClientDTO clientDTO) {
		
		return new Client(
		      clientDTO.getId(),
		      clientDTO.getName(),
		      clientDTO.getEmail(),
		      clientDTO.getPassword(),
		      clientDTO.getConfirmPassword()
        );
	}
}
