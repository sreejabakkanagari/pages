package com.capgemini.ForgotPassword.service;

import java.util.Optional;

import com.capgemini.ForgotPassword.bean.Customer;

public interface CustomerService {

	
	public String getCustomerById(String username);
	public void find(String email);
}
