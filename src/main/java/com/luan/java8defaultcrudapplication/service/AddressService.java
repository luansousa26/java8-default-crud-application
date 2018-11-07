package com.luan.java8defaultcrudapplication.service;

import java.util.List;
import java.util.Optional;

import com.luan.java8defaultcrudapplication.domain.Address;
import com.luan.java8defaultcrudapplication.service.dto.AddressDTO;

public interface AddressService {

	AddressDTO save(AddressDTO addressDTO);
	
	AddressDTO update(AddressDTO addressDTO);
	
	List<AddressDTO> findAll();
	
	Optional<Address> findById(Long id);
	
	void delete(Long id);
	
	AddressDTO findByIdClient(Long idClient);
}
