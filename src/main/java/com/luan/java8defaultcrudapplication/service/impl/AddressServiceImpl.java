package com.luan.java8defaultcrudapplication.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.luan.java8defaultcrudapplication.repository.AddressRepository;
import com.luan.java8defaultcrudapplication.service.AddressService;
import com.luan.java8defaultcrudapplication.service.dto.AddressDTO;
import com.luan.java8defaultcrudapplication.service.mapper.AddressMapper;

@Service
@Component
public class AddressServiceImpl implements AddressService {

	@Autowired
	private AddressRepository addressRepository;
	
	@Autowired
	private AddressMapper addressMapper;
	
	@Override
	public AddressDTO save(AddressDTO addressDTO) {
		return addressMapper.toDto(addressRepository.save(addressMapper.toEntity(addressDTO)));
	}

	@Override
	public AddressDTO update(AddressDTO addressDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AddressDTO> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AddressDTO findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

}
