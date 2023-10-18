package com.infinite.controller;
//Controller for Deleting a product
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.infinite.dao.ProductDaoInt;

@Controller
public class DeleteController {

	@Autowired
	ProductDaoInt daoimpl;
	
	@GetMapping("/delete")
	public String deleteCustomer(@RequestParam("id")int id){
		daoimpl.deleteProduct(id);
		return "redirect:/list";
	}
}
