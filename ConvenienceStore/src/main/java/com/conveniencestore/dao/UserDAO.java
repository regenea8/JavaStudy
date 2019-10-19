package com.conveniencestore.dao;

import java.util.List;
import java.util.Map;

import com.conveniencestore.dto.UserDTO;

public interface UserDAO {
	
	public int login(UserDTO userDto) throws Exception;

}
