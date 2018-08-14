package com.cg.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.spring.dao.EmployeeDao;
import com.cg.spring.dto.Employee;

@Service("employeeservice")
@Transactional
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeDao employeeDao;
	
	public void addEmployee(Employee e) {
		
	employeeDao.addEmployee(e);	
	}

	public List<Employee> showEmployee() {
		
		return employeeDao.showEmployee();
	}

	public void deleteEmployee(int id) {
		
		employeeDao.deleteEmployee(id);
		
	}
	
	public Employee searchEmployee(int id) {
		
		return employeeDao.searchEmployee(id);

	}


	public void updateEmployee(Employee e) {
		
		employeeDao.updateEmployee(e);
	}

	
	
	

}
