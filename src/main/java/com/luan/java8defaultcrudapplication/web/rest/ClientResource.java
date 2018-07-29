package com.luan.java8defaultcrudapplication.web.rest;
import java.net.URISyntaxException;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luan.java8defaultcrudapplication.service.ClientService;
import com.luan.java8defaultcrudapplication.service.dto.ClientDTO;


@RestController
@RequestMapping("/clients")
public class ClientResource {

	private final ClientService clientService;
	
	private ClientResource(ClientService clientService) {
		this.clientService = clientService;
	}
	
	@PostMapping()
	public ResponseEntity<ClientDTO> save(@RequestBody ClientDTO clientDTO) throws URISyntaxException {
		return ResponseEntity.ok().body(this.clientService.save(clientDTO));
	}
	
	@PutMapping()
	public ResponseEntity<ClientDTO> update(@RequestBody ClientDTO clientDTO) throws URISyntaxException{
		return ResponseEntity.ok().body(this.clientService.update(clientDTO));
	}
}
