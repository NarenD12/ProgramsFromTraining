/**
 * 
 */
package com.infinite.dao;

//Implementation of methods in interface
import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.PlatformTransactionManager;

import com.infinite.beans.Login;
//import com.infinite.dbconn.HikariDBConn;

/**
 * @author narend
 *
 */
public class LoginDaoImpl implements IRegisterLogin {
	
	//initializing jdbc template 
	private JdbcTemplate jdbc;
	private DataSource dataSource;
	private PlatformTransactionManager transactionManager;
	
	//calling the datasource
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		jdbc=new JdbcTemplate(dataSource);
	}

	public void setTransactionManager(PlatformTransactionManager transactionManager) {
		this.transactionManager = transactionManager;
	}
//method for Login
	@Override
	public int login(Login log) {
		String sql="select * from register where fname=?";
		return jdbc.update(sql, log.getFname());
	}
//method for Registration
	@Override
	public int register(Login log) {
		// TODO Auto-generated method stub
		String sql="insert into register(fname,email,password,birthday,gender,profession,marry,note) values(?,?,?,?,?,?,?,?)";
		return jdbc.update(sql,log.getFname(),log.getEmail(),log.getPassword(),log.getBirthday(),log.getGender(),log.getProfession(),log.getMarry(),log.getNote());
	}

}
