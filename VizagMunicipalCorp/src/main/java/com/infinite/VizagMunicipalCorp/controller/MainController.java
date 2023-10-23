package com.infinite.VizagMunicipalCorp.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.infinite.VizagMunicipalCorp.model.User;
import com.infinite.VizagMunicipalCorp.service.UserServiceImpl;

//Controller for both Login and Registration
@Controller
public class MainController {

	@Autowired
	UserServiceImpl service;

	private static final Logger log = Logger.getLogger(MainController.class);

	@RequestMapping(value = "/", method = RequestMethod.GET, headers = "Accept=application/json")
	public String goToHomePage() {
		return "redirect:/registerpage";
	}

	// Go to registration page
	@RequestMapping(value = "/registerpage", method = RequestMethod.GET)
	public String RegisterFormPage(Model model) {
		model.addAttribute("user", new User());
		return "Register";
	}

	// After register is successful redirect to login
	@RequestMapping(value = "/registerForm", method = RequestMethod.POST)
	public String register(@ModelAttribute("user") User user) {
		service.registerUser(user);
		log.info("Register Successful");
		return "redirect:/Loginpage";
	}
	
	@RequestMapping(value = "/Loginpage", method = RequestMethod.GET)
	public String LoginFormPage(Model model) {
		model.addAttribute("user", new User());
		return "Login";
	}

	// Login validation and redirect to Home if successful
	@RequestMapping(value = "/loginForm", method = RequestMethod.POST)
	public ModelAndView login(@RequestParam("name") String name, @RequestParam("password") String password, User user) {
		ModelAndView mv = new ModelAndView();
		List<String> a = service.loginUser(user);
		if (a.isEmpty()) {
			mv.addObject("msg", "Invalid Username or Password");
			mv.setViewName("login");
		} else {
			log.info("Login Successful");
			service.loginUser(user);
			mv.addObject("msg", name);
			mv.setViewName("Home");
		}
		return mv;
	}
}
