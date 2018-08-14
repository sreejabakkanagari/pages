package com.cg.spring.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="employee")
public class Employee {
	
	@Id
	@Column(name="emp_id")
	@NotNull(message="id is required")
	private int id;
	@Column(name="emp_name")
	@NotNull(message="name is required")
	private String name;
	@Column(name="emp_sal")
	private double salary;
	
	public Employee() 
	{
		
	}
	
	public Employee(int id, String name, double salary) 
	{
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}
