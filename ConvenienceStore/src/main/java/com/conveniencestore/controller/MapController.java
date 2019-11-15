package com.conveniencestore.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.conveniencestore.dto.TestVO;
import com.conveniencestore.dto.UserDTO;
import com.conveniencestore.service.UserService;


@Controller
@RequestMapping("/map")
public class MapController {

	private static final Logger logger = LoggerFactory.getLogger(MapController.class);

	@Inject
	private UserService service;

	@RequestMapping(value = "/", method = { RequestMethod.GET, RequestMethod.POST})
	public String index() throws Exception {
		return "map/daumMap";
	}
	
}
