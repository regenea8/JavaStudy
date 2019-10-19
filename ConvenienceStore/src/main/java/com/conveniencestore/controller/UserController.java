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
import com.conveniencestore.util.InternetProtocolUtil;


@Controller
@RequestMapping("/user")
public class UserController {

	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	@Inject
	private UserService service;
	
	/*
	@Resource(name = "imgUploadPath")
	private String uploadPath;
	*/
	
	@RequestMapping(value = "/loginform", method = { RequestMethod.GET, RequestMethod.POST})
	public void loginform(UserDTO userDto, Model model) throws Exception {
		
		logger.info("loginform userDto [{}]", userDto.toString());
		model.addAttribute("userId", userDto.getUserId());
		
	}
	
	@RequestMapping(value = "/login", method = { RequestMethod.GET, RequestMethod.POST})
	public String login(HttpSession session, HttpServletRequest request, UserDTO userDto) throws Exception {
		
		logger.info("login userDto [{}]", userDto.toString());
		
		int result = 0;
		
		try {
			result = service.login(userDto);
			logger.info("login loginCount [{}]", result);
		} catch (Exception exception) {
			exception.printStackTrace();
			logger.info("DB Exception [{}]", exception);
		}
		
		// 로그인 실패 
		if (result == 0) {
			return "redirect:/user/loginform?userId=" + userDto.getUserId();
		}
		
		// 로그인 성공, 세션을 사용한다.
		session = request.getSession();
		// 세션에 로그인에 성공한 사람을 저장한다.
		session.setAttribute("userId", userDto.getUserId());
		
		return "redirect:/";
	}
	
	@ResponseBody
	@RequestMapping(value = "/test", method = { RequestMethod.GET, RequestMethod.POST})
	public String download(HttpServletRequest request, TestVO vo) throws Exception {

		logger.info("-------------start download [Connect IP : " + InternetProtocolUtil.getClientIp(request) + "]");

		String result = "";
		
		try {
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		logger.info("---------------end download [Connect IP : " + InternetProtocolUtil.getClientIp(request) + "]");
		
		return result;
	}
}
