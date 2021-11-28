package com.springbasic.app.ws.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.springbasic.app.ws.shared.dto.UserDto;

public interface UserService extends UserDetailsService{
	UserDto createUser(UserDto userDto);
}
