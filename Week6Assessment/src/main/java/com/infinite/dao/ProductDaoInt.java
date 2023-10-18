package com.infinite.dao;
//Interface where we initialize our methods
import java.util.List;

import com.infinite.pojo.Product;

public interface ProductDaoInt {

	public List<Product> getProductList();
	public void saveProduct(Product product);
	public Product getProduct(int id);
	public void deleteProduct(int id);
}
