package com.infinite.VizagMunicipalCorp.controller;
//Controller for Logout with invalidate()
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LogoutController {
	
	private static final Logger log=Logger.getLogger(LogoutController.class);

	@RequestMapping(value="/logout",method=RequestMethod.GET)
    public String logout(HttpServletRequest request){
        request.getSession().invalidate();
        log.info("Logged Out");
        return "redirect:/Loginpage";
       
    }
}