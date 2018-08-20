package com.email.Email.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.email.Email.bean.Customer;
import com.email.Email.service.NotificationService;



@RestController
public class EmailController {

	@Autowired
	private NotificationService notificationService;

	
	@RequestMapping("/success")
	public String signupsuccess(@RequestParam String c_id)
	{
		Optional<Customer> customer =
		notificationService.getCustomer(Integer.parseInt(c_id));
		try
		{
			notificationService.Notification(customer);
		}
		catch(MailException e)
		{
			
		}
		return "success";
	}
}
