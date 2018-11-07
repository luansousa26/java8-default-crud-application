package com.luan.java8defaultcrudapplication.service.mapper;
import org.mapstruct.Mapper;

import com.luan.java8defaultcrudapplication.domain.Client;
import com.luan.java8defaultcrudapplication.service.dto.ClientDTO;

@Mapper(componentModel = "spring")
public interface ClientMapper extends EntityMapper<ClientDTO, Client> {
	
		
	ClientDTO toDto(Client client);
	Client toEntity(ClientDTO clientDTO);

		default Client fromId(Long id) {
	        if (id == null) {
	            return null;
	        }
	        Client client = new Client();
	        client.setId(id);
			return client;
		}

}
