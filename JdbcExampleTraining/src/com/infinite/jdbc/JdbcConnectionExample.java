package com.infinite.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author narend
 *
 */
public class JdbcConnectionExample {

	public static void main(String[] args) {
		Connection on=null;
		try {
			Class.forName(args[0]);			//Loading the driver
			on=DriverManager.getConnection("jdbc:mysql://localhost:3306/training","root","narennaren");	//Establishing Connection
			System.out.println("Connection Established");
			Statement stat=on.createStatement();		//Creating Statement
			ResultSet st=stat.executeQuery("select * from employee");  //Execute Statement
			while(st.next()){
				System.out.print(st.getString(1)+" ");
				System.out.print(st.getString(2)+" ");
				System.out.println(st.getString(3));
			}
			on.close();
		
		}catch (SQLException e1) {
			System.out.println(e1);
			
		}catch (ClassNotFoundException e) {
			System.out.println(e);
		}
	}
}
