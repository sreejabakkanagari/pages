package com.cg.spring.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cg.spring.dto.Employee;

@Repository("employeedao")
public class EmployeeDaoImpl implements EmployeeDao{
	
	@PersistenceContext
	EntityManager entityManager;
	
	
	public void addEmployee(Employee e) {
		entityManager.persist(e);
	}


	public List<Employee> showEmployee() {
		
		List<Employee> list = new ArrayList<Employee>();
		Query q = entityManager.createQuery("from Employee");
		list = q.getResultList();
		return list;
	}

	
	public void deleteEmployee(int id) {
	
		Query q = entityManager.createQuery("from Employee where emp_id=:id");
		q.setParameter("id", id);
		Employee employee = (Employee) q.getSingleResult();
		entityManager.remove(employee);
		
	}
	

	public Employee searchEmployee(int id) {
		
		Query q = entityManager.createQuery("from Employee where emp_id=:id");
		q.setParameter("id", id);
		Employee employee = (Employee) q.getSingleResult();
		
		return employee;
		
	}


	public void updateEmployee(Employee e) {
		
		entityManager.merge(e);
		
	}

	

	

}
