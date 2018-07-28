package com.luan.java8defaultcrudapplication.service.mapper;

import java.util.Optional;
import org.mapstruct.Mapper;

import com.luan.java8defaultcrudapplication.domain.Contact;
import com.luan.java8defaultcrudapplication.service.dto.ContactDTO;

@Mapper(componentModel = "spring")
public interface ContactMapper extends EntityMapper<ContactDTO, Contact> {
	
		
	ContactDTO toDto(Contact Contact);
	Contact toEntity(ContactDTO ContactDTO);
	ContactDTO toDto(Optional<Contact> Contact);
	Contact toEntity(Optional<ContactDTO> contactDTO);

		default Contact fromId(Long id) {
	        if (id == null) {
	            return null;
	        }
	        Contact user = new Contact();
	        user.setId(id);
			return user;
		}

}
