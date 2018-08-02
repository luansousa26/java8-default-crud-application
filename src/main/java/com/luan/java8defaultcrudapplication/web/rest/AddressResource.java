package com.luan.java8defaultcrudapplication.web.rest;

import java.net.URISyntaxException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luan.java8defaultcrudapplication.service.AddressService;
import com.luan.java8defaultcrudapplication.service.dto.AddressDTO;

@RestController
@RequestMapping("/address")
public class AddressResource {
	
	private AddressService addressService;

    @PostMapping()	
	public ResponseEntity<AddressDTO> save(@RequestBody AddressDTO addressDTO) throws URISyntaxException {
		return ResponseEntity.ok().body(addressService.save(addressDTO));
	}
}
