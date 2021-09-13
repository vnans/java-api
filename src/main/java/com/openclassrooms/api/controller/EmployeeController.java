package com.openclassrooms.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.openclassrooms.api.model.Employees;
import com.openclassrooms.api.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService ;
	
		/**
	    * Read - Get all employees
	    * @return - An Iterable object of Employee full filled
	    */
	@GetMapping("/employees")
	public Iterable<Employees> GetEmployee(){
		
		return employeeService.GetEmployee();
	}
	
	

}
