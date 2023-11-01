package com.infinite.week8.controller;
import java.util.List;

//RestController for showing all details of employee
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.infinite.week8.model.Employee;
import com.infinite.week8.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService empServ;
	
	@GetMapping("/")
	public ModelAndView allEmployees(Model m) {
		ModelAndView modelAndView = new ModelAndView();
		m.addAttribute("listEmployees",empServ.getAllEmployees());
		modelAndView.setViewName("EmpDetails.html");
		return modelAndView;
	}
	
	@GetMapping("/getEmp")
	public List<Employee> getEmployee(){
		return empServ.getAllEmployees();
	}
}
