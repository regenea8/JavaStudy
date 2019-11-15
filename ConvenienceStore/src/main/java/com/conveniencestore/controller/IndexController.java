package com.conveniencestore.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.conveniencestore.dto.TestVO;
import com.conveniencestore.service.IndexService;


@Controller
@RequestMapping("/*")
public class IndexController {

	private static final Logger logger = LoggerFactory.getLogger(IndexController.class);

	@Inject
	private IndexService service;
	
	/*
	@Resource(name = "imgUploadPath")
	private String uploadPath;
	*/
	
	@RequestMapping(value = "/", method = { RequestMethod.GET, RequestMethod.POST})
	public String index() throws Exception {
		return "/index";
	}
	
	@ResponseBody
	@RequestMapping(value = "/test", method = { RequestMethod.GET, RequestMethod.POST})
	public String download(HttpServletRequest request, TestVO vo) throws Exception {

		String result = "";
		
		try {
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
}
