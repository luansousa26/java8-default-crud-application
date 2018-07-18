package com.luan.java8defaultcrudapplication.service.mapper;

import com.luan.java8defaultcrudapplication.domain.User;
import com.luan.java8defaultcrudapplication.service.dto.UserDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper extends EntityMapper<UserDTO, User> {
	
	UserDTO toDTO(User user);
	User toEntity(UserDTO userDTO);
	
	default User fromId(Long id) {
        if (id == null) {
            return null;
        }
        User user = new User();
        user.setId(id);
		return user;
	}
	

}
