package com.miranda.blog.converter;

import org.springframework.stereotype.Component;

import com.miranda.blog.entity.User;
import com.miranda.blog.payloads.UserDTO;

@Component
public class UserConverter implements UtilConverter<User, UserDTO> {

	@Override
	public UserDTO toDTO(User entity) {
		if (entity == null)
			return null;
		UserDTO dto = new UserDTO();
		dto.setId(dto.getId());
		dto.setName(dto.getName());
		dto.setEmail(dto.getEmail());
		dto.setAbout(dto.getEmail());
		dto.setPassword(dto.getPassword());
		return dto;
	}

	@Override
	public User toEntity(UserDTO dto) {
		if (dto == null)
			return null;
		User user = new User();
		user.setId(dto.getId());
		user.setName(dto.getName());
		user.setEmail(dto.getEmail());
		user.setAbout(dto.getEmail());
		user.setPassword(dto.getPassword());
		return user;
	}

}
