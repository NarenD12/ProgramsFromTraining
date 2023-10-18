package com.infinite.controller;
//Controller for listing product details
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.infinite.dao.ProductDaoInt;
import com.infinite.pojo.Product;

@Controller
public class ListController {

	@Autowired
	ProductDaoInt daoimpl;
	
	@GetMapping("/list")
	public String listProduct(Model m){
		List<Product> product=daoimpl.getProductList();
		m.addAttribute("product",product);
		return "ListProduct";
	}
}
