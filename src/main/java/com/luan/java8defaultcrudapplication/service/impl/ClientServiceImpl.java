package com.luan.java8defaultcrudapplication.service.impl;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.luan.java8defaultcrudapplication.Java8DefaultCrudApplication;
import com.luan.java8defaultcrudapplication.repository.AddressRepository;
import com.luan.java8defaultcrudapplication.repository.ClientRepository;
import com.luan.java8defaultcrudapplication.repository.ContactRepository;
import com.luan.java8defaultcrudapplication.service.ClientService;
import com.luan.java8defaultcrudapplication.service.dto.ClientDTO;
import com.luan.java8defaultcrudapplication.service.mapper.ClientMapper;
import com.luan.java8defaultcrudapplication.service.mapper.ContactMapper;

@Service
@Component
public class ClientServiceImpl implements ClientService {

	private static final Logger log = LoggerFactory.getLogger(ClientServiceImpl.class);
	
	@Autowired
	ClientRepository clientRepository;

	ClientMapper clientMapper;
	
	ContactMapper contactMapper;
	
	@Autowired
	ContactRepository contactRepository;
	
	@Autowired
	AddressRepository addressRepository;
	
	private ClientServiceImpl(ClientMapper clientMapper, ContactMapper contactMapper) {
		this.clientMapper = clientMapper;
		this.contactMapper = contactMapper;
	}

	@Override
	public ClientDTO save(ClientDTO clientDTO) {
		log.info("Request to save(): {}", clientDTO);
		clientDTO.setAlterationDate(LocalDate.now());
		ClientDTO clientSaved = clientMapper.toDto(clientRepository.save(clientMapper.toEntity(clientDTO)));
		clientSaved.getContact().setIdClient(clientSaved.getId());
        contactRepository.save(clientSaved.getContact());		
		return clientSaved;
	}

	@Override
	public ClientDTO update(ClientDTO clientDTO) {
		log.info("Request to update(): {}", clientDTO);
		clientDTO.setAlterationDate(LocalDate.now());
		return clientMapper.toDto(clientRepository.save(clientMapper.toEntity(clientDTO)));
	}

	@Override
	public List<ClientDTO> findAll() {
		log.info("Request to findAll(): {}");
		return clientRepository.findAll()
				.stream()
				.map(clientMapper :: toDto)
				.collect(Collectors.toCollection(LinkedList :: new));
	}

	@Override
	public ClientDTO findById(Long clientId) {
		log.info("Request to findById(): {}", clientId);
		return clientMapper.toDto(clientRepository.findById(clientId));
	}

	@Override
	public void delete(Long clientId) {
		log.info("Request to delete(): {}", clientId);
	     clientRepository.deleteById(clientId);		
	}
	
}
