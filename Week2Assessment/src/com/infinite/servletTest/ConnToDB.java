package com.infinite.servletTest;
//Connection to Database in this class
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnToDB {
	
	protected static Connection ConnectDatabase() throws SQLException,ClassNotFoundException{
		
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/training";
		String user="root";
		String password="narennaren";
		
		Class.forName(driver);		
		Connection conn=DriverManager.getConnection(url,user,password);			//Takes the value from Strings above
		
		return conn;		
	}
}