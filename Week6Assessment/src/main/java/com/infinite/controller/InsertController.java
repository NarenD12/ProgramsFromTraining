package com.infinite.controller;
//Controller for Inserting a product Detail
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.infinite.dao.ProductDaoInt;
import com.infinite.pojo.Product;

@Controller
public class InsertController {

	@Autowired
	private ProductDaoInt daoimpl;
	
	@GetMapping("/showForm")
	public String showForm(Model m){
		Product product=new Product();
		m.addAttribute("product",product);
		return "insertForm";
	}
	
	@PostMapping("/saveProduct")
	public String saveProduct(@ModelAttribute("product") Product product){
		daoimpl.saveProduct(product);
		return "redirect:/list";
	}
}
