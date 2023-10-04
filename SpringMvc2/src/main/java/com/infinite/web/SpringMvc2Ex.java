package com.infinite.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpringMvc2Ex {
	
	@RequestMapping("/create")
	public String create() {
		System.out.println("Passed create");
		return "index";
	}
	@RequestMapping("/delete")
	public String delete() {
		System.out.println("Passed delete");
		return "delete";
	}
}
