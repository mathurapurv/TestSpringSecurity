package com.apress.pss.terrormovies.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/login")
public class LoginController {

	
	@RequestMapping(method = RequestMethod.GET, value = "")
	@ResponseBody
	public String hello() {
		System.out.println("hello");
		return "helo";
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/custom_login")
	public String showLogin() {
		System.out.println("Going for login !!");
		return "login";
	}
	
	
}
