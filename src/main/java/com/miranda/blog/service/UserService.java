package com.miranda.blog.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.miranda.blog.converter.UserConverter;
import com.miranda.blog.entity.User;
import com.miranda.blog.payloads.UserDTO;
import com.miranda.blog.repository.UserRepository;

@Service
public class UserService implements GenericService<UserDTO, Long>{

	private UserRepository repository;
	private UserConverter converter;
	
	public UserService(UserRepository repository, UserConverter converter) {
		this.repository = repository;
		this.converter = converter;
	}
	
	@Override
	public UserDTO create(UserDTO dto) {
		User user = converter.toEntity(dto);
		
		User savedUser = repository.save(user);
		return converter.toDTO(savedUser);
	}

	@Override
	public UserDTO update(UserDTO t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDTO findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserDTO> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

}
