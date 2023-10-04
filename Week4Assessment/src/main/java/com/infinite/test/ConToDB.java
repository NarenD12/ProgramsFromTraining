package com.infinite.test;
//Providing Connection to Database here
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConToDB {
	protected static Connection initializeDB() throws SQLException,ClassNotFoundException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/week4test","root","narennaren");
		return con;
	}
}
