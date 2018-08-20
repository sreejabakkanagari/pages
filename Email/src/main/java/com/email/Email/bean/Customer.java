package com.email.Email.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {

	
	public Customer(int id, String email, String username, String password, boolean status) {
		super();
		this.id = id;
		this.email = email;
		this.username = username;
		this.password = password;
		this.status = status;
	}

	@Id
	@Column(name="c_id")
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="c_email")
	private String email;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name="c_username")
	private String username;
	
	@Column(name="c_password")
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

	
	

	public Customer()
	{
		
	}
}
