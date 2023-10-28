package com.infinite.swagger;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@RequestMapping(value="/api/hello",method=RequestMethod.GET)
	public String hello() {
		return "Welcome to Infinite";
	}
}
