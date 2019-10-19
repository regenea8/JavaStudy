package com.conveniencestore.service;

import java.util.List;

import com.conveniencestore.dto.UserDTO;

public interface UserService {
	
	public int login(UserDTO userDto) throws Exception;
}
