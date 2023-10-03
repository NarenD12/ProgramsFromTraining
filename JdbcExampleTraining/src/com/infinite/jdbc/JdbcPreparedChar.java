package com.infinite.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

//Program to insert only a single char into the database 
public class JdbcPreparedChar {
public static void main(String[] args) {
	Connection on=null;
	Scanner sc=new Scanner(System.in);
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		on = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "narennaren"); // Establishing Connection
		PreparedStatement ps=on.prepareStatement("insert into employee values(?,null,null)");
		System.out.println("Enter only single Character");
		ps.setString(1,sc.next());
		String a= sc.next();
//		System.out.println("Enter Idno");		//Insert Idno
//		ps.setInt(2, sc.nextInt());
//		System.out.println("Enter Department Name");	//Insert Deptname	
//		ps.setString(3, sc.next());
//		int status=ps.executeUpdate();
//		if(status==1){
		if(a.length()==1)
			{
			int status=ps.executeUpdate();
			if(status==1){
				System.out.println("Record Inserted");
			}
		else{
				System.out.println("Please Provide Single Character");
			}
		}else
			System.out.println("Operation Failed");
		sc.close();
	}catch (SQLException e1){
		System.out.println(e1);
	}catch(ClassNotFoundException e){
		System.out.println(e);
	}finally{
		try{
			on.close();	
		}catch(Exception e){
			System.out.println(e);
			}
		}	
	}
}
