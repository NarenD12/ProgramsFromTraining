package com.infinite.dao;
//Implementation class for our Interface 
import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.infinite.pojo.Product;

public class ProductDaoImpl implements ProductDaoInt {

	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	//Method for Getting list
	@Override
	public List<Product> getProductList() {
		Session session = sessionFactory.getCurrentSession();
		CriteriaBuilder cb = session.getCriteriaBuilder();
		CriteriaQuery<Product> cq = cb.createQuery(Product.class);
		Root<Product> root = cq.from(Product.class);
		cq.select(root);
		Query query = session.createQuery(cq);
		return query.getResultList();
	}
	//Method for Inserting a product Details
	@Override
	public void saveProduct(Product product) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(product);
	}
	//Method for getting one product Details
	@Override
	public Product getProduct(int id) {
		Session session = sessionFactory.getCurrentSession();
		Product product = session.get(Product.class, id);
		return product;
	}
	//Method for Deleting a product Details
	@Override
	public void deleteProduct(int id) {
		Session session = sessionFactory.getCurrentSession();
		Product del = session.byId(Product.class).load(id);
		session.delete(del);
	}

}
