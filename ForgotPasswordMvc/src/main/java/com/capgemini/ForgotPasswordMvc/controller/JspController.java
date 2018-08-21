package com.capgemini.ForgotPasswordMvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JspController {

	
	@RequestMapping("/index")
	public String showCustomerByIdPage()
	{
		return "index";
	}
	
}
