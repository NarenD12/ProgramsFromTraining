package com.infinite.dao;

import com.infinite.beans.Login;
//Interface which consists of the methods
public interface IRegisterLogin {

	public int login(Login log);
	public int register(Login log);
	
}
