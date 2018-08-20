package com.email.Email.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.email.Email.bean.Customer;

@Repository
public interface CustomerRepo extends CrudRepository<Customer, Integer>{

	
	
}
