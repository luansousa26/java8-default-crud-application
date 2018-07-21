package com.luan.java8defaultcrudapplication.web.rest;
import java.net.URISyntaxException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luan.java8defaultcrudapplication.service.UserService;
import com.luan.java8defaultcrudapplication.service.dto.UserDTO;

@RestController
@RequestMapping("/users")
public class UserResource {
	
	private final UserService userService;
    
	private UserResource(UserService userService) {
		this.userService = userService;
	}
	
	@PostMapping()
	public ResponseEntity<UserDTO> save(@RequestBody UserDTO userDTO) throws URISyntaxException {
		return ResponseEntity.ok().body(userService.save(userDTO));
	}
}
