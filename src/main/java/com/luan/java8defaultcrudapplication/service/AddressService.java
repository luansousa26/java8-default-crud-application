package com.luan.java8defaultcrudapplication.service;

import java.util.List;

import com.luan.java8defaultcrudapplication.service.dto.AddressDTO;

public interface AddressService {

	AddressDTO save(AddressDTO addressDTO);
	
	AddressDTO update(AddressDTO addressDTO);
	
	List<AddressDTO> findAll();
	
	AddressDTO findById(Long id);
	
	void delete(Long id);
	
	AddressDTO findByIdClient(Long idClient);
}
