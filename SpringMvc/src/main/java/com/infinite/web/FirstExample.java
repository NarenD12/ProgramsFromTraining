package com.infinite.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstExample {
	@RequestMapping("/infinite")
	public String display() {
		return "index";
	}
}
