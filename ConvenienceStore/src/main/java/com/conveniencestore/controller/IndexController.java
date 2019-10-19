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
import com.conveniencestore.service.IndexService;
import com.conveniencestore.util.InternetProtocolUtil;


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
	public String index(HttpSession session, HttpServletRequest request, Model model) throws Exception {
		
		// 세션을 사용한다는 의미
		session = request.getSession();
		String userId = (String) session.getAttribute("userId");
		model.addAttribute("userId", userId);
		
		return "/index";
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
