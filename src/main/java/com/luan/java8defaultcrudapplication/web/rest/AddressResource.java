package com.luan.java8defaultcrudapplication.web.rest;

import java.net.URISyntaxException;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
    
    @PutMapping()
    public ResponseEntity<AddressDTO> update(@RequestBody AddressDTO addressDTO) throws URISyntaxException {
    	return ResponseEntity.ok().body(addressService.update(addressDTO));
    }
    
    @GetMapping()
    public ResponseEntity<List<AddressDTO>> findAll() throws URISyntaxException {
    	return ResponseEntity.ok().body(addressService.findAll());
    }
}
