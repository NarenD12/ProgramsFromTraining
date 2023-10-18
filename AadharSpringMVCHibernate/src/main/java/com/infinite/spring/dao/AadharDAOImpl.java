package com.infinite.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.infinite.spring.pojo.Aadhar;

@Repository
public class AadharDAOImpl implements AadharDAO {

	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void addAadhar(Aadhar a) {
		Session session=this.sessionFactory.getCurrentSession();
		session.persist(a);
	}

	@Override
	public void updateAadhar(Aadhar a) {

		Session session=this.sessionFactory.getCurrentSession();
		session.update(a);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Aadhar> listAadhar() {
		// TODO Auto-generated method stub
		Session session=this.sessionFactory.getCurrentSession();
		List<Aadhar> ls=session.createQuery("from Aadhar").list();
		for(Aadhar a:ls){
			System.out.println("Aadhar List:"+a);
		}
		return ls;
	}

	@Override
	public Aadhar getAadharById(int id) {
		Session session=this.sessionFactory.getCurrentSession();
		Aadhar a=(Aadhar) session.load(Aadhar.class, new Integer(id));
		return a;
	}

	@Override
	public void removeAadhar(int id) {
		Session session=this.sessionFactory.getCurrentSession();
		Aadhar a=(Aadhar) session.load(Aadhar.class, new Integer(id));
		if(null !=a){
			session.delete(a);
		}
	}
}
