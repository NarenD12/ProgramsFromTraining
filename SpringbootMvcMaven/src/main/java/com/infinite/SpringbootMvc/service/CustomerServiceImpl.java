package com.infinite.SpringbootMvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.infinite.SpringbootMvc.model.Customer;
import com.infinite.SpringbootMvc.repository.CustomerDaoImpl;

@Service
public class CustomerServiceImpl implements ICustomerService{

	@Autowired
	CustomerDaoImpl daoimpl; 
	
	@Override
	@Transactional
	public List<Customer> getAllCustomers() {
		return daoimpl.getAllCustomers();
	}

	@Override
	@Transactional
	public Customer getCustomer(int id) {
		return daoimpl.getCustomer(id);
	}

	@Override
	@Transactional
	public void addCustomer(Customer customer) {
		daoimpl.addCustomer(customer);
	}

	@Override
	@Transactional
	public void updateCustomer(Customer customer) {
		daoimpl.updateCustomer(customer);
	}

	@Override
	@Transactional
	public void deleteCustomer(int id) {
		daoimpl.deleteCustomer(id);
	}

}
