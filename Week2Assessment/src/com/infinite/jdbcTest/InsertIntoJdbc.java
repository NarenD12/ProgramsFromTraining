package com.infinite.jdbcTest;
//JDBC Program for Inserting the data into a Database 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertIntoJdbc {
	
	public static void main(String[] args) {
		Connection con=null;
		Scanner sc=new Scanner(System.in);		//Initialize the Scanner
try{
		con=ConToDB.initiliazeDatabase();		//calling initializeDatabase() which has all the Connection Details
		
		PreparedStatement ps=con.prepareStatement("insert into Company values(?,?,?,?,?)");//SQL Statement for insert
		System.out.println("Enter Name of the Company");
		ps.setString(1, sc.next());		//Inserting into the 1st Column with Scanner
		
		System.out.println("Enter the Address of Company");
		ps.setString(2,sc.next());		//Insert into 2nd Column
		
		System.out.println("Enter the Country");
		ps.setString(3, sc.next());		//Insert into 3rd Column
		
		System.out.println("Enter the Number of Employees");
		ps.setInt(4, sc.nextInt());		//Insert into 4th Column the integer
		
		System.out.println("Enter the Status of Company(Active or Inactive)");
		ps.setString(5, sc.next());		//Insert into 5th Column 
		
		int status=ps.executeUpdate();	//Execute the Query and store the value, 1 for successful 
		if(status == 1){
			System.out.println("Record Inserted");
		}
		else{
			System.out.println("Record Insertion Failed");
		}
	}
			catch(SQLException e){
				System.out.println(e);
	
			}catch(ClassNotFoundException e1){
				System.out.println(e1);
				
			}finally{
				try{
					con.close();			//Close the Connection
					sc.close();				//Close the Scanner 
				}
				catch(Exception e){
					System.out.println(e);
				}
			}
		}
	}
