package com.infinite.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.infinite.model.Employee;
import com.infinite.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	@Autowired
	EmployeeService empService;
	
	@RequestMapping(value="/employees", method=RequestMethod.POST)
	public Employee createEmployee(@RequestBody Employee emp) {
		System.out.println("Create Employee");
	    return empService.createEmployee(emp);
	}

	@RequestMapping(value = "/employees", method = RequestMethod.GET)
	public List<Employee> readEmployees() {
		System.out.println("Read Employee");	
		return empService.getEmployees();
	}
}
