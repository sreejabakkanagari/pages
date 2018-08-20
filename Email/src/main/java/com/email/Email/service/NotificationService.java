package com.email.Email.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.email.Email.bean.Customer;
import com.email.Email.repo.CustomerRepo;

@Service
public class NotificationService {

	private JavaMailSender javaMailSender;
	@Autowired
	private CustomerRepo repo;
	
	@Autowired
	public NotificationService(JavaMailSender javaMailSender)
	{
		this.javaMailSender=javaMailSender;
	}
	
	public void Notification(Optional<Customer> customer) throws MailException
	{
		SimpleMailMessage mail = new SimpleMailMessage();
		mail.setTo(customer.get().getEmail());
		mail.setFrom("udykmr13@gmail.com");
		mail.setSubject("Coupons and promos");
		mail.setText("Here are the exciting offers!!!!!!!!");
		javaMailSender.send(mail);
	}
	public Optional<Customer> getCustomer(int id)
	{
		return repo.findById(id);
	}
}
