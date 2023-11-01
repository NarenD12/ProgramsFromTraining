package com.infinite.week8.service;
//Service interface with a user created method
import java.util.List;

import com.infinite.week8.model.Employee;

public interface EmployeeService {

	Employee saveEmployee(Employee emp);
	List<Employee> getAllEmployees();
}
