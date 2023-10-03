package com.infinite.lob;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public abstract class BlobInpuExample {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
	try{	
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/training","root","narennaren");	//Establishing Connection
		PreparedStatement ps=con.prepareStatement("insert into imgtable values(?,?)");  
		ps.setString(1,"sonoo");  

		FileInputStream fin=new FileInputStream("D:\\images\\imputs.png");  
		ps.setBinaryStream(2,fin,fin.available());  
		int i=ps.executeUpdate();  
		System.out.println(i+" records affected");
	}catch(SQLException e1){
		System.out.println(e1);
	}catch(Exception e){
		System.out.println(e);
	}
	 finally {
		try {
			con.close();
		} catch (Exception e) {
			System.out.println(e);
			}
	 	}
	}
}
