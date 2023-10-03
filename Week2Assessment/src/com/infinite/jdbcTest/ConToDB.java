package com.infinite.jdbcTest;
//Connection to Database	
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConToDB {

	protected static Connection initiliazeDatabase() throws SQLException,ClassNotFoundException{
		
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/training";
		String user="root";
		String password="narennaren";
		
		Class.forName(driver);
		Connection con=DriverManager.getConnection(url,user,password);		//Get the String from above
		
		return con;		
	}
}
