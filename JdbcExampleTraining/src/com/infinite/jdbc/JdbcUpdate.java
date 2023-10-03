package com.infinite.jdbc;
//update row in table
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUpdate {

	public static void main(String[] args) {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection on=DriverManager.getConnection("jdbc:mysql://localhost:3306/training","root","narennaren");	//Establishing Connection
			Statement stat=on.createStatement();		//Creating Statement
			stat.executeUpdate("Update employee set idno=103 where fullname='Connor'");//Update Query
			System.out.println("Updated row from employee table");
			on.close();
		}		
		catch(SQLException e1){
			System.out.println(e1);
		}catch(ClassNotFoundException e){
			System.out.println(e);
		}
	}
}