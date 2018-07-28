package com.luan.java8defaultcrudapplication.service.impl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.luan.java8defaultcrudapplication.Java8DefaultCrudApplication;
import com.luan.java8defaultcrudapplication.repository.ContactRepository;
import com.luan.java8defaultcrudapplication.service.ContactService;
import com.luan.java8defaultcrudapplication.service.dto.ContactDTO;
import com.luan.java8defaultcrudapplication.service.mapper.ContactMapper;
@Service
@Component
public class ContactServiceImpl implements ContactService{
	
	private static final Logger log = LoggerFactory.getLogger(Java8DefaultCrudApplication.class);
	@Autowired
	ContactRepository contactRepository;

	ContactMapper contactMapper;
	
	@Override
	public ContactDTO save(ContactDTO contactDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ContactDTO> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ContactDTO update(ContactDTO contactDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long idContact) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<ContactDTO> findById(Long IdContact) {
		// TODO Auto-generated method stub
		return null;
	}

}
