package com.infinite.VizagMunicipalCorp.service;
import java.util.List;

//Service implementation class for initialized methods
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.infinite.VizagMunicipalCorp.model.User;
import com.infinite.VizagMunicipalCorp.repository.UserDaoImpl;

@Service
public class UserServiceImpl implements IUserService {
	
	@Autowired
	UserDaoImpl daoimpl;
	
	@Override
	@Transactional
	public void registerUser(User user) {
		daoimpl.registerUser(user);
	}

	@Override
	@Transactional
	public List<String> loginUser(User user) {
		return daoimpl.loginUser(user);
	}
}
