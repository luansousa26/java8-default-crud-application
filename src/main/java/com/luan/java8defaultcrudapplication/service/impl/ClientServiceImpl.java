package com.luan.java8defaultcrudapplication.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.luan.java8defaultcrudapplication.Java8DefaultCrudApplication;
import com.luan.java8defaultcrudapplication.repository.ClientRepository;
import com.luan.java8defaultcrudapplication.repository.ContactRepository;
import com.luan.java8defaultcrudapplication.service.ClientService;

@Service
@Component
public class ClientServiceImpl implements ClientService {

private static final Logger log = LoggerFactory.getLogger(Java8DefaultCrudApplication.class);
	
	@Autowired
	ClientRepository clientRepository;

	ClientMapper clientMapper;
	
	@Override
	public ClientDTO save(ClientDTO clientDTO) {
		return null;
	}

	@Override
	public ClientDTO update(ClientDTO clientDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ClientDTO> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClientDTO findById(Long clientId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long clientId) {
		// TODO Auto-generated method stub
		
	}

}
