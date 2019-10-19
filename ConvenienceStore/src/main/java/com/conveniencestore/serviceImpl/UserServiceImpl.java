package com.conveniencestore.serviceImpl;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.conveniencestore.dao.UserDAO;
import com.conveniencestore.dto.UserDTO;
import com.conveniencestore.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Inject
	private UserDAO dao;
	
	@Override
	public int login(UserDTO userDto) throws Exception {
		return dao.login(userDto);
	}

}
