package com.conveniencestore.serviceImpl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.conveniencestore.dao.IndexDAO;
import com.conveniencestore.service.IndexService;

@Service
public class IndexServiceImpl implements IndexService {
	
	@Inject
	private IndexDAO dao;
	
	@Override
	public List testList() throws Exception {
		return dao.testList();
	}

}
