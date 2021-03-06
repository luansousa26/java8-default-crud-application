package com.luan.java8defaultcrudapplication.service.impl;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.luan.java8defaultcrudapplication.domain.Address;
import com.luan.java8defaultcrudapplication.repository.AddressRepository;
import com.luan.java8defaultcrudapplication.service.AddressService;
import com.luan.java8defaultcrudapplication.service.dto.AddressDTO;
import com.luan.java8defaultcrudapplication.service.mapper.AddressMapper;

@Service
@Component
public class AddressServiceImpl implements AddressService {

	private static final Logger log = LoggerFactory.getLogger(AddressServiceImpl.class);

	@Autowired
	private AddressRepository addressRepository;

	private AddressMapper addressMapper;

	private AddressServiceImpl(AddressMapper addressMapper) {
		this.addressMapper = addressMapper;
	}

	@Override
	public AddressDTO save(AddressDTO addressDTO) {
		log.info("Request to save():{}", addressDTO);
		return addressMapper.toDto(addressRepository.save(addressMapper.toEntity(addressDTO)));
	}

	@Override
	public AddressDTO update(AddressDTO addressDTO) {
		log.info("Request to update():{}", addressDTO);
		return addressMapper.toDto(addressRepository.saveAndFlush(addressMapper.toEntity(addressDTO)));
	}

	@Override
	public List<AddressDTO> findAll() {
		log.info("Request to findAll()");
		return addressRepository.findAll().stream().map(addressMapper::toDto)
				.collect(Collectors.toCollection(LinkedList::new));
	}

	@Override
	public Optional<Address> findById(Long id) {
		log.info("Request to findById()");
		return addressRepository.findById(id);
	}

	@Override
	public void delete(Long id) {
		log.info("Request to delete()");
		addressRepository.deleteById(id);

	}

	@Override
	public AddressDTO findByIdClient(Long idClient) {
		log.info("Request to findByIdClient(): {}", idClient);
		return addressMapper.toDto(addressRepository.findByIdClient(idClient));
	}

}
