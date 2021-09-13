package com.openclassrooms.api.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openclassrooms.api.model.Employees;
import com.openclassrooms.api.repository.EmployeeRepository;

import lombok.Data;

@Data
@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Optional<Employees> GetEmployee(final long id ){
		
		return employeeRepository.findById(id);
	}

	
	public Iterable<Employees> GetEmployee() {
		
		return employeeRepository.findAll();
	}
	
	public void deleteEmployee(final long id) {
		
		 employeeRepository.deleteById(id);
	}
	
	public Employees saveEmployee(Employees employee) {
		
		Employees saveEmployee =  employeeRepository.save(employee);
		return saveEmployee;
	}
	
	
	
}
