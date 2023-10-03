package com.infinite.jdbc;
//Delete row from employee table
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDelete {

	public static void main(String[] args) {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection on=DriverManager.getConnection("jdbc:mysql://localhost:3306/training","root","narennaren");	//Establishing Connection
			Statement stat=on.createStatement();		//Creating Statement
			stat.executeUpdate("Delete from employee where fullname='b'");//Delete Query 
			System.out.println("Deleted row from employee table");
			on.close();
		}		
		catch(SQLException e1){
			System.out.println(e1);
		}catch(ClassNotFoundException e){
			System.out.println(e);
		}
	}
}


