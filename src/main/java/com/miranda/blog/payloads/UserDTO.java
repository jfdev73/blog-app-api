package com.miranda.blog.payloads;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class UserDTO {

	private Long id;
	
	private String name;
	
	private String email;
	
	private String password;
	
	private String about;
}
