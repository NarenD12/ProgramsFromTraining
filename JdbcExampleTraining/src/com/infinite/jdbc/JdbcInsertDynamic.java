package com.infinite.jdbc;
//Program to insert into table values dynamically 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcInsertDynamic {
public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection on=DriverManager.getConnection("jdbc:mysql://localhost:3306/training","root","narennaren");	//Establishing Connection
			Statement stat=on.createStatement();
			
			Scanner ins=new Scanner(System.in);				//Scanner for FullName
			System.out.println("Enter your Full Name");
			String insertName= ins.nextLine();
															//Scanner for IdNo
			System.out.println("Enter your idno");				
			String insertIdNo=ins.nextLine();
															//Scanner for Department
			System.out.println("Enter your Department");
			String insertDept=ins.nextLine();
			ins.close();
										//Running the SQL query 
			stat.executeUpdate("insert into example values("+"'"+(insertName)+"'"+","+(insertIdNo)+","+"'"+(insertDept)+"')");
			System.out.println("Inserted into Table");
			on.close();
		
		}catch(SQLException e1){
		System.out.println(e1);
		}catch(ClassNotFoundException e) {
			System.out.println(e);
		}		
	}
}
