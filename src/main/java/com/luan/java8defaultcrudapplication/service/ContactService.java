package com.luan.java8defaultcrudapplication.service;

import java.util.List;

import com.luan.java8defaultcrudapplication.service.dto.ContactDTO;

public interface ContactService {
   
	ContactDTO save(ContactDTO contactDTO);
	
	List<ContactDTO> findAll();
	
	ContactDTO update(ContactDTO contactDTO);
	
	void delete(Long idContact);
	
	ContactDTO findById(Long IdContact);
}
