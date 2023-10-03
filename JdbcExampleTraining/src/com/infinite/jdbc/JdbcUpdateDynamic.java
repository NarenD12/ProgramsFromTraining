package com.infinite.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcUpdateDynamic {
	public static void main(String[] args) {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection on=DriverManager.getConnection("jdbc:mysql://localhost:3306/training","root","narennaren");	//Establishing Connection
			Statement stat=on.createStatement();		//Creating Statement
			
			Scanner idno=new Scanner(System.in);				//Scanner for idno
			System.out.println("Enter your Full Name");
			String insertidno= idno.nextLine();
			
			Scanner fname=new Scanner(System.in);				//Scanner for FullName
			System.out.println("Enter your Full Name");
			String insertName= fname.nextLine().toString();
			idno.close();
			fname.close();
			stat.executeUpdate("Update employee set idno="+(insertidno)+" where fullname="+"'"+(insertName)+"'");//Update Query
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
