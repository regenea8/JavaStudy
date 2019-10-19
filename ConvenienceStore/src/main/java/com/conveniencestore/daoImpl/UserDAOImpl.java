package com.conveniencestore.daoImpl;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.conveniencestore.dao.UserDAO;
import com.conveniencestore.dto.UserDTO;

@Repository
public class UserDAOImpl implements UserDAO {
	
	@Inject
	private SqlSession session;

	private static String namespace = "com.conveniencestore.UserMapper";
	
	@Override
	public int login(UserDTO userDto) throws Exception {
		return session.selectOne(namespace + ".login", userDto);
	}
}
