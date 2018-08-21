package com.capgemini.ForgotPassword.Controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.ForgotPassword.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	CustomerService service;
	
	@RequestMapping("/getpassword")
	public String sendPassword(@RequestParam String username)
	{
		String uName = service.getCustomerById(username);
		System.out.println(uName);
		service.find(uName);
		
		return "An email has been sent";
	}
	
	
}
