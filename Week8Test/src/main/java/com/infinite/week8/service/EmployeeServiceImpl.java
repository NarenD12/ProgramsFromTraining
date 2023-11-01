package com.infinite.week8.service;
//Class for implementing the initialized method
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infinite.week8.model.Employee;
import com.infinite.week8.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository empRepo;

	@Override
	public List<Employee> getAllEmployees() {
		return empRepo.findAll();
	}

	@Override
	public Employee saveEmployee(Employee emp) {
		return empRepo.save(emp);
	}	
}
