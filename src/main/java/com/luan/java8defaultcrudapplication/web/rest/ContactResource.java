package com.luan.java8defaultcrudapplication.web.rest;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luan.java8defaultcrudapplication.domain.Contact;
import com.luan.java8defaultcrudapplication.service.ContactService;
import com.luan.java8defaultcrudapplication.service.dto.ContactDTO;


@RestController
@RequestMapping("/contacts")
public class ContactResource {
	
	@Autowired
	private ContactService contactService;

	
	@PostMapping()
	public ResponseEntity<ContactDTO> save(@RequestBody ContactDTO contactDTO) throws URISyntaxException {
		return ResponseEntity.ok().body(contactService.save(contactDTO));
	}
	
	@PutMapping()
	public ResponseEntity<ContactDTO> update(@RequestBody ContactDTO contactDTO) throws URISyntaxException {
		return ResponseEntity.ok().body(contactService.update(contactDTO));
	}
	
	@GetMapping()
	public ResponseEntity<List<ContactDTO>> findAll() throws URISyntaxException {
		return ResponseEntity.ok().body(contactService.findAll());
	}
	
	@GetMapping("/FindById/{idContact}")
	public ResponseEntity<Optional<Contact>> findById(@PathVariable("idContact") Long idContact) throws URISyntaxException {
		return ResponseEntity.ok().body(contactService.findById(idContact));
	}
	
	@DeleteMapping("/delete/{idContact}")
	public void delete(@PathVariable("idContact") Long idContact) {
		contactService.delete(idContact);
	}
}
