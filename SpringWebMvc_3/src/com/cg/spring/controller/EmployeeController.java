package com.cg.spring.controller;





import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cg.spring.dto.Employee;
import com.cg.spring.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping(value="/showall", method=RequestMethod.GET)
	public ModelAndView getAllEmployees() {
		
		List<Employee> list = employeeService.showEmployee();
		
		return new ModelAndView("show","emps",list);
		
	}
	
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public String myEmployee(@ModelAttribute("emp") Employee emp, Map<String,Object> model)
	{
		model.put("emp", emp);
		return "add_employee" ;
	}
	
	@RequestMapping(value="/addemployee",method=RequestMethod.POST)
	public String addEmployee(@Valid@ModelAttribute("emp") Employee emp, BindingResult result,Map<String,Object> model)
	{
		if(result.hasErrors())
		{
			return "add_employee";
		}
		
		
		employeeService.addEmployee(emp);
		return "redirect:/showall";
		
	}
	
	@RequestMapping(value="/delete",method=RequestMethod.GET)
	public String notMyEmployee(@ModelAttribute("emp") Employee emp, Map<String,Object> model)
	{
		
		return "delete_employee" ;
	}
	
	@RequestMapping(value="/deleteemployee",method=RequestMethod.POST)
	public String deleteEmployee(@Valid@ModelAttribute("emp") Employee emp, BindingResult result,Map<String,Object> model)
	{
		if(result.hasErrors())
		{
			return "delete_employee";
		}
		
		int id = emp.getId();
		employeeService.deleteEmployee(id);
		return "redirect:/showall";
		
	}
	
	@RequestMapping(value="/update",method=RequestMethod.GET)
	public String updateMyEmployee(@ModelAttribute("emp") Employee emp, Map<String,Object> model)
	{
		
		return "update_employee1" ;
	}
	/*
	@RequestMapping(value="/showall", method=RequestMethod.GET)
	public ModelAndView getEmployee(@ModelAttribute("emp") Employee emp) {
		
		Employee employee = employeeService.searchEmployee(emp.getId());
		
		return new ModelAndView("update_employee2","empu",employee);
		
	}*/
	
	@RequestMapping(value="/updateemployee1",method=RequestMethod.POST)
	public String searchEmployee(@Valid@ModelAttribute("emp") Employee emp, BindingResult result, Map<String,Object> model)
	{
		int id=emp.getId();
		 employeeService.searchEmployee(id);
		 return "update_employee2";
	}
	
	@RequestMapping(value="/updateemployee2",method=RequestMethod.POST)
	public String updateteEmployee(@Valid@ModelAttribute("emp") Employee emp, BindingResult result, Map<String,Object> model)
	{
		if(result.hasErrors())
		{
			return "update_employee2";
		}
		
		employeeService.updateEmployee(emp);
		return "redirect:/showall";
		
	}
	
	
}
