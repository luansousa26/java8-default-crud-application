package com.luan.java8defaultcrudapplication.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.luan.java8defaultcrudapplication.service.ContactService;
import com.luan.java8defaultcrudapplication.service.dto.ContactDTO;

@Service
@Component
public class ContactServiceImpl implements ContactService{

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
