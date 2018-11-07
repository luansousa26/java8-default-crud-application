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

import com.luan.java8defaultcrudapplication.domain.Client;
import com.luan.java8defaultcrudapplication.service.ClientService;
import com.luan.java8defaultcrudapplication.service.dto.ClientDTO;


@RestController
@RequestMapping("/clients")
public class ClientResource {
	
	@Autowired
	private ClientService clientService;
	
	@PostMapping()
	public ResponseEntity<ClientDTO> save(@RequestBody ClientDTO clientDTO) throws URISyntaxException {
		return ResponseEntity.ok().body(this.clientService.save(clientDTO));
	}
	
	@PutMapping()
	public ResponseEntity<ClientDTO> update(@RequestBody ClientDTO clientDTO) throws URISyntaxException{
		return ResponseEntity.ok().body(this.clientService.update(clientDTO));
	}
	
	@GetMapping()
	public ResponseEntity<List<ClientDTO>> findAll() throws URISyntaxException {
		return ResponseEntity.ok().body(this.clientService.findAll());
	}
	
	@GetMapping("/{clientId}")
     public ResponseEntity<Optional<Client>> findById(@PathVariable("clientId") Long clientId) throws URISyntaxException {
		return ResponseEntity.ok().body(this.clientService.findById(clientId));
	}
	
	@DeleteMapping("/{clientId}")
	public void delete(@PathVariable("clientId") Long clientId) {
		this.clientService.delete(clientId);
	}
	
	@GetMapping("/findByName/{name}")
	public ResponseEntity<List<ClientDTO>> findByName(@PathVariable("name") String name) throws URISyntaxException {
		return ResponseEntity.ok().body(clientService.findByName(name));
	}
	
	@GetMapping("/findByJob/{job}")
	public ResponseEntity<List<ClientDTO>> findByJob(@PathVariable("job") String job) throws URISyntaxException {
		return ResponseEntity.ok().body(clientService.findByJob(job));
	}
}
