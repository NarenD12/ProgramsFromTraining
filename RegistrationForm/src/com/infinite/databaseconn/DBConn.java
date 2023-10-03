package com.infinite.databaseconn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConn {
	protected static Connection initializeDatabase() throws SQLException, ClassNotFoundException{
		
		String dbDriver = "com.mysql.cj.jdbc.Driver";
		String dbUrl = "jdbc:mysql://localhost:3306/training";
		
		String dbname="root";
		String dbpassword="narennaren";

		Class.forName(dbDriver);
		Connection con=DriverManager.getConnection(dbUrl,dbname,dbpassword);
		
		return con;
	}
}
