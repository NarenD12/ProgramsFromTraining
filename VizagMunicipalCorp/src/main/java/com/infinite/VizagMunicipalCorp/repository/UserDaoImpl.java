package com.infinite.VizagMunicipalCorp.repository;
//Implementation of methods initialized in Interface

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.infinite.VizagMunicipalCorp.model.User;

@Repository
public class UserDaoImpl implements IUserDao {

	@Autowired
	private SessionFactory sfactory;
	//Register User
	@Override
	public void registerUser(User user) {
		Session sess = this.sfactory.getCurrentSession();
		sess.save(user);
	}
	//Login User
	@Override
	public List<String> loginUser(User user) {
		Session sess = this.sfactory.getCurrentSession();
		List<String> ls=sess.createQuery("from User where Name='" + user.getName() + "' AND Password='" + user.getPassword() + "'").list();
		return ls;
	}
}
