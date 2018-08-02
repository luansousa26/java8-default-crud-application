package com.luan.java8defaultcrudapplication.service.impl;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

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
		return addressMapper.toDto(addressRepository.saveAndFlush(addressMapper.toEntity(addressDTO)));
	}

	@Override
	public List<AddressDTO> findAll() {
		return addressRepository.findAll()
				.stream()
				.map(addressMapper :: toDto)
				.collect(Collectors.toCollection(LinkedList :: new));
	}

	@Override
	public AddressDTO findById(Long id) {
		return addressMapper.toDto(addressRepository.findById(id));
	}

	@Override
	public void delete(Long id) {
		addressRepository.deleteById(id);
		
	}

}
