package com.capgemini.ForgotPassword.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.ForgotPassword.bean.Customer;

@Repository
public interface CustomerRepo extends CrudRepository<Customer, String>{

}
