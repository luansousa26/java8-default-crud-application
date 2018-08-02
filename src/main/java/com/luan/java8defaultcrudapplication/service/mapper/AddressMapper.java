package com.luan.java8defaultcrudapplication.service.mapper;

import java.util.Optional;
import org.mapstruct.Mapper;

import com.luan.java8defaultcrudapplication.domain.Address;
import com.luan.java8defaultcrudapplication.service.dto.AddressDTO;
@Mapper(componentModel = "spring", uses = {AddressMapper.class})
public interface AddressMapper extends EntityMapper<AddressDTO, Address> {
	
		
	AddressDTO toDto(Address address);
	Address toEntity(AddressDTO addressDTO);
	AddressDTO toDto(Optional<Address> address);
	Address toEntity(Optional<AddressDTO> addressDTO);

		default Address fromId(Long id) {
	        if (id == null) {
	            return null;
	        }
	        Address address = new Address();
	        address.setId(id);
			return address;
		}

}
