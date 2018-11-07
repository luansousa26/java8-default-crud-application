package com.luan.java8defaultcrudapplication.service.mapper;

import org.mapstruct.Mapper;

import com.luan.java8defaultcrudapplication.domain.Contact;
import com.luan.java8defaultcrudapplication.service.dto.ContactDTO;

@Mapper(componentModel = "spring")
public interface ContactMapper extends EntityMapper<ContactDTO, Contact> {
	
		
	ContactDTO toDto(Contact Contact);
	Contact toEntity(ContactDTO ContactDTO);

		default Contact fromId(Long id) {
	        if (id == null) {
	            return null;
	        }
	        Contact contact = new Contact();
	        contact.setId(id);
			return contact;
		}

}
