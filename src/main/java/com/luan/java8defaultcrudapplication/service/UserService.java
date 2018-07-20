package com.luan.java8defaultcrudapplication.service;
import java.util.List;

import com.luan.java8defaultcrudapplication.service.dto.UserDTO;

public interface UserService {

	UserDTO save (UserDTO userDTO);
	
	List<UserDTO> findAll();
	
	UserDTO findOne(Long idUser);
	
	UserDTO update(UserDTO userDTO);
	
	void delete(Long id);
}