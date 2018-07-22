package com.luan.java8defaultcrudapplication.service.impl;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.luan.java8defaultcrudapplication.repository.UserRepository;
import com.luan.java8defaultcrudapplication.service.UserService;
import com.luan.java8defaultcrudapplication.service.dto.UserDTO;
import com.luan.java8defaultcrudapplication.service.mapper.UserMapper;

@Service
@Component
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;

	UserMapper userMapper;
	
	private UserServiceImpl(UserMapper userMapper) {
		this.userMapper = userMapper;
	}
	
	@Override
	public UserDTO save(UserDTO userDTO) {
		return userMapper.toDto(userRepository.save(userMapper.toEntity(userDTO)));
	}

	@Override
	public List<UserDTO> findAll() {
		return userRepository.findAll()
				.stream()
				.map(userMapper :: toDto)
				.collect(Collectors.toCollection(LinkedList :: new));
	}

	@Override
	public UserDTO findOne(Long idUser) {
		return userMapper.toDto(userRepository.findById(idUser));
	}

	@Override
	public UserDTO update(UserDTO userDTO) {
		return userMapper.toDto(userRepository.save(userMapper.toEntity(userDTO)));
	}

	@Override
	public void delete(Long id) {
		userRepository.deleteById(id);
	}

}
