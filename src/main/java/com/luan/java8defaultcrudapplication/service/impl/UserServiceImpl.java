package com.luan.java8defaultcrudapplication.service.impl;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.luan.java8defaultcrudapplication.domain.User;
import com.luan.java8defaultcrudapplication.repository.UserRepository;
import com.luan.java8defaultcrudapplication.service.UserService;
import com.luan.java8defaultcrudapplication.service.dto.UserDTO;
import com.luan.java8defaultcrudapplication.service.mapper.UserMapper;

@Service
@Component
public class UserServiceImpl implements UserService{
	
	private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);
	@Autowired
	UserRepository userRepository;

	UserMapper userMapper;
	
	private UserServiceImpl(UserMapper userMapper) {
		this.userMapper = userMapper;
	}
	
	@Override
	public UserDTO save(UserDTO userDTO) {
		log.info("Request to save(): {}", userDTO);
		userDTO.setAlterationDate(LocalDate.now());
		return userMapper.toDto(userRepository.saveAndFlush(userMapper.toEntity(userDTO)));
	}

	@Override
	public List<UserDTO> findAll() {
		log.info("Request to findAll()");
		return userRepository.findAll()
				.stream()
				.map(userMapper :: toDto)
				.collect(Collectors.toCollection(LinkedList :: new));
	}

	@Override
	public Optional<User> findById(Long idUser) {
		log.info("Request to findById(): {}", idUser);
		return userRepository.findById(idUser);
	}

	@Override
	public UserDTO update(UserDTO userDTO) {
		log.info("Request to update(): {}", userDTO);
		userDTO.setAlterationDate(LocalDate.now());
		return userMapper.toDto(userRepository.save(userMapper.toEntity(userDTO)));
	}

	@Override
	public void delete(Long id) {
		log.info("Request to delete(): {}", id);
		userRepository.deleteById(id);
	}

	@Override
	public List<UserDTO> findByName(String name) {
		log.info("Request to findByName(): {}", name);
		return userRepository.findBynameContainingIgnoreCase(name)
				.stream()
				.map(userMapper :: toDto)
				.collect(Collectors.toCollection(LinkedList :: new));
	}

}
