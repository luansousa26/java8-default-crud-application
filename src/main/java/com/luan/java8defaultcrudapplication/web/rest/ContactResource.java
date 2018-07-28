package com.luan.java8defaultcrudapplication.web.rest;
import java.net.URISyntaxException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.luan.java8defaultcrudapplication.service.ContactService;
import com.luan.java8defaultcrudapplication.service.dto.ContactDTO;

import io.swagger.annotations.Api;

@RestController
@Api("/contact")
public class ContactResource {
    
private final ContactService contactService;
    
	private ContactResource(ContactService contactService) {
		this.contactService = contactService;
	}
	
	@PostMapping()
	public ResponseEntity<ContactDTO> save(@RequestBody ContactDTO contactDTO) throws URISyntaxException {
		return ResponseEntity.ok().body(contactService.save(contactDTO));
	}
}
