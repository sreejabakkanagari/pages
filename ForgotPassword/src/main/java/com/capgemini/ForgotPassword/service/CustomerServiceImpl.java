package com.capgemini.ForgotPassword.service;

import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.capgemini.ForgotPassword.bean.Customer;
import com.capgemini.ForgotPassword.repo.CustomerRepo;

@Service
public class CustomerServiceImpl implements CustomerService{

	private JavaMailSender javaMailSender;
	
	@Autowired
	private CustomerRepo repo;
	
	@Autowired
	@PersistenceContext
	EntityManager entity;
	
	public String getCustomerById(String username){
		
		Optional<Customer> 
		list = repo.findById(username);
		return list.get().getUsername();
		
	}

	@Override
	public void find(String uName){
		
		
		try {
		
		Optional<Customer> list = repo.findById(uName);
		
		String password = list.get().getPassword();
		System.out.println(password);
		SimpleMailMessage mail = new SimpleMailMessage();
		mail.setTo(list.get().getEmail());
		System.out.println(list.get().getEmail());
		mail.setFrom("udykmr13@gmail.com");
		mail.setSubject("Your password");
		mail.setText("Here is your password: "+password+"!!!!!!!!");
		javaMailSender.send(mail);
		}catch(MailException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
