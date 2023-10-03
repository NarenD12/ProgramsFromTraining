package com.infinite.account;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionToDB {
	
	public static Connection initializeConn() throws SQLException,ClassNotFoundException{
		
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/bank";
		String user="root";
		String pass="narennaren";
		
		Class.forName(driver);
		Connection conn=DriverManager.getConnection(url,user,pass);
		
		return conn;
	}
}
