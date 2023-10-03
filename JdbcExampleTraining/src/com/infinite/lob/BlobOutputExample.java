package com.infinite.lob;

import java.io.FileOutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class BlobOutputExample {

	public static void main(String[] args) {
		
		Connection con=null;
		try{
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/training","root","narennaren");
		PreparedStatement ps=con.prepareStatement("select * from imgtable");  
		ResultSet rs=ps.executeQuery();  
		if(rs.next()){//now on 1st row  
		Blob b=rs.getBlob(2);//2 means 2nd column data  
		byte barr[]=b.getBytes(1,(int)b.length());//1 means first image  
		FileOutputStream fout=new FileOutputStream("D:\\images\\output.jpg");  
		fout.write(barr);  
		System.out.println("Record Displayed");
		fout.close();
		}
		}
		catch(SQLException e1){
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