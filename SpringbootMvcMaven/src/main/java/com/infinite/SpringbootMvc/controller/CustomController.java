package com.infinite.SpringbootMvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.infinite.SpringbootMvc.model.Customer;
import com.infinite.SpringbootMvc.service.CustomerServiceImpl;

@Controller
public class CustomController {

	@Autowired
	CustomerServiceImpl servimpl;

	@RequestMapping(value = "/", method = RequestMethod.GET, headers = "Accept=application/json")
	public String goToHomePage() {
		return "redirect:/getAllCustomers";
	}

	@RequestMapping(value="/getAllCustomers",method=RequestMethod.GET)
	public String getAllCustomers(Model model){
		model.addAttribute("customer",new Customer());
		model.addAttribute("listofcustomers",servimpl.getAllCustomers());
		return "customerDetails";
	}
	
	@RequestMapping(value="addCustomer",method=RequestMethod.POST)
	public String addCustomer(@ModelAttribute("customer")Customer customer){
		servimpl.addCustomer(customer);
		return "redirect:/getAllCustomers";
	}
	@RequestMapping(value="/deleteCustomer/{id}")
	public String deleteCustomer(@PathVariable("id") int id){
		servimpl.deleteCustomer(id);
		return "redirect:/getAllCustomers";
	}
	@RequestMapping(value="/updateCustomer/{id}")
	public String updateCustomer(@PathVariable("id") int id, Model model){
		model.addAttribute("customer", servimpl.getCustomer(id));
        model.addAttribute("listofcustomers", servimpl.getAllCustomers());
        return "customerDetails";
	}
	
//	@RequestMapping(value = "/updateCustomer/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
//	public String updateCustomer(@PathVariable("id") int id,Model model) {
//		model.addAttribute("customer", this.customerService.getCustomer(id));
//		model.addAttribute("listOfCustomers", this.customerService.getAllCustomers());
//		return "customerDetails";
//	}
}
