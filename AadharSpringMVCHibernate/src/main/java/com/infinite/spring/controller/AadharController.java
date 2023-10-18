package com.infinite.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.infinite.spring.pojo.Aadhar;
import com.infinite.spring.service.AadharService;

@Controller
public class AadharController {

	private AadharService aadharService;
	
	@Autowired(required=true)
	@Qualifier(value="aadharService")
	public void setAadharService(AadharService aadharService) {
		this.aadharService = aadharService;
	}
	
	@RequestMapping(value="/aadhar",method=RequestMethod.GET)
	public String listPersons(Model m){
		m.addAttribute("aadhar",new Aadhar());
		m.addAttribute("listaadhars",this.aadharService.listAadhar());
		return "aadhar";
	}
	
	@RequestMapping(value= "/aadhar/add", method = RequestMethod.POST)
	public String addAadhar(@ModelAttribute("aadhar") Aadhar a){
		
		if(a.getId() == 0){
			//new person, add it
			this.aadharService.addAadhar(a);
		}else{
			//existing person, call update
			this.aadharService.updateAadhar(a);
		}
		
		return "redirect:/aadhar";
		
	}
	
	@RequestMapping("/remove/{id}")
    public String removePerson(@PathVariable("id") int id){
		
        this.aadharService.removeAadhar(id);;
        return "redirect:/aadhar";
    }
	
	 @RequestMapping("/edit/{id}")
	    public String editPerson(@PathVariable("id") int id, Model model){
	        model.addAttribute("aadhar", this.aadharService.getAadharById(id));
	        model.addAttribute("listaadhars", this.aadharService.listAadhar());
	        return "aadhar";
	    }
		
}
