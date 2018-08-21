package com.capgemini.ForgotPassword.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
	
	@Id
	
	private String username;
	
	
	@Override
	public String toString() {
		return "Customer [username=" + username + ", email=" + email + ", id=" + id + ", password=" + password
				+ ", status=" + status + "]";
	}




	private String email;
	
	
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	
	
	private String password;
	
	@Column(name="c_vstatus",columnDefinition="tinyint(1) default 0")
	private boolean status;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	
	
	public Customer(int id, String email, String username, String password, boolean status) {
		super();
		this.id = id;
		this.email = email;
		this.username = username;
		this.password = password;
		this.status = status;
	}

	public Customer()
	{
		
	}

}
