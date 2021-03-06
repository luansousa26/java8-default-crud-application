package com.luan.java8defaultcrudapplication.service;
import java.util.List;
import java.util.Optional;

import com.luan.java8defaultcrudapplication.domain.User;
import com.luan.java8defaultcrudapplication.service.dto.UserDTO;

public interface UserService {

	UserDTO save (UserDTO userDTO);
	
	List<UserDTO> findAll();
	
	Optional<User> findById(Long idUser);
	
	UserDTO update(UserDTO userDTO);
	
	void delete(Long id);
	
	List<UserDTO> findByName(String name);
}
