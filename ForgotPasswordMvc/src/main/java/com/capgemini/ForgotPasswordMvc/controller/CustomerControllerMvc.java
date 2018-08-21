package com.capgemini.ForgotPasswordMvc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.capgemini.ForgotPasswordMvc.bean.Customer;


@RestController
public class CustomerControllerMvc {
	@RequestMapping("/getpassword")
	public Customer getproduct(@RequestParam String username)
	{
		RestTemplate rt = new RestTemplate();
		Customer c = rt.getForObject("http://localhost:9903/sendemail?username="+username, Customer.class);
		return c;
	}
	
	
}
