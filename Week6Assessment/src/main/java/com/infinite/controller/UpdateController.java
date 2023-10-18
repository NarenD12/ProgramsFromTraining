package com.infinite.controller;
//Controller for updating a products details
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.infinite.dao.ProductDaoInt;
import com.infinite.pojo.Product;

@Controller
public class UpdateController {
	
	@Autowired
	ProductDaoInt daoimpl;

	@PostMapping("/updateForm")
	public String showUpdateForm(@RequestParam("id")int id,Model m){
		Product product=daoimpl.getProduct(id);
		m.addAttribute("product",product);
		return "insertForm";
	}
}
