package com.luan.java8defaultcrudapplication.service;

import java.util.List;
import java.util.Optional;

import com.luan.java8defaultcrudapplication.domain.Client;
import com.luan.java8defaultcrudapplication.service.dto.ClientDTO;

public interface ClientService {

	ClientDTO save(ClientDTO clientDTO);
	
	ClientDTO update(ClientDTO clientDTO);
	
	List<ClientDTO> findAll();
	
	Optional<Client> findById(Long clientId);
	
	void delete(Long clientId);
	
	List<ClientDTO> findByName(String name);
	
	List<ClientDTO> findByJob(String job);
	
}
