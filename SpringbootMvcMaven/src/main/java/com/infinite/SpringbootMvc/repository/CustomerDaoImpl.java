package com.infinite.SpringbootMvc.repository;

import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.infinite.SpringbootMvc.model.Customer;

@Repository
public class CustomerDaoImpl implements ICustomerDao {
	
	@Autowired
	private SessionFactory sfactory;

	public void setSfactory(SessionFactory sfactory) {
		this.sfactory = sfactory;
	}

	@Override
	public List<Customer> getAllCustomers() {
		Session session=this.sfactory.getCurrentSession();
		List<Customer> ls=session.createQuery("from Customer").list();
		return ls;
	}

	@Override
	public Customer getCustomer(int id) {
		Session session=this.sfactory.getCurrentSession();
		Customer customer = (Customer) session.get(Customer.class, id);
		return customer;
	}

	@Override
	public Customer addCustomer(Customer customer) {
		Session session=this.sfactory.getCurrentSession();
		session.save(customer);
		return customer;
	}

	@Override
	public void updateCustomer(Customer customer) {
		Session session=this.sfactory.getCurrentSession();
		Hibernate.initialize(customer);
		session.update(customer);
	}

	@Override
	public void deleteCustomer(int id) {
		Session session = this.sfactory.getCurrentSession();
		Customer p = (Customer) session.load(Customer.class, new Integer(id));
		if (null != p) {
			session.delete(p);
		}
	}
}
