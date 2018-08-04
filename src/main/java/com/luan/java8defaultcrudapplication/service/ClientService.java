package com.luan.java8defaultcrudapplication.service;

import java.util.List;

import com.luan.java8defaultcrudapplication.service.dto.ClientDTO;

public interface ClientService {

	ClientDTO save(ClientDTO clientDTO);
	
	ClientDTO update(ClientDTO clientDTO);
	
	List<ClientDTO> findAll();
	
	ClientDTO findById(Long clientId);
	
	void delete(Long clientId);
	
	List<ClientDTO> findByName(String name);
	
	List<ClientDTO> findByJob(String job);
	
}
