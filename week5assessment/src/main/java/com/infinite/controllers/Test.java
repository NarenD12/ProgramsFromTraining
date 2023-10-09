/**
 * 
 */
package com.infinite.controllers;
//Controller to redirect to jsp pages
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.infinite.beans.Login;
import com.infinite.dao.LoginDaoImpl;

/**
 * @author narend
 *
 */
@Controller
public class Test {
	
	@Autowired
	LoginDaoImpl dao;
	
	//For Registration form
	@RequestMapping(value="/registerForm")
	public String registerForm(Model m){
		m.addAttribute("command",new Login());
		return "registerform";
	}
	//Values entered in form will come here
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public String register(@ModelAttribute("log")Login log){
		int status=dao.register(log);
		if(status==0){
			return "failure";
		}else{
			return "welcome";
		}
	}
	//For Login Form
	@RequestMapping(value="/loginForm")
	public String loginForm(Model m){
		m.addAttribute("command",new Login());
		return "loginform";
	}
	//Values entered in form will come here
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(@ModelAttribute("log")Login log){
		int status=dao.login(log);
		if(status==0){
			return "failure";
		}else{
			return "welcome";
		}
	}
}
