package com.infinite.databaseconn;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ConnToDB
 */
public class ConnToDB extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConnToDB() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		Connection con=null;
		Scanner sc= new Scanner(System.in);
			try{
				con=DBConn.initializeDatabase(); //Connect to DBConn to connect into DB

				System.out.println("Connection Established");
				PreparedStatement ps= con.prepareStatement("insert into example1 values(?,?,?)"); //SQL query to insert
				
				System.out.println("Enter Idno");							//Insert Idno
				ps.setInt(1,Integer.valueOf(request.getParameter("idno")));
				
				System.out.println("Enter Username");						//Insert Username
				ps.setString(2,request.getParameter("username"));
				
				System.out.println("Enter Address");						//Insert Address
				ps.setString(3,request.getParameter("address"));
				
				int status= ps.executeUpdate();
				if(status==1){
					System.out.println("Record Inserted");
					response.sendRedirect("SuccessMsg.html");
				}
				else{
					System.out.println("Record Insertion Failed");
					response.sendRedirect("FailureMsg.html");
				}
			}
			catch(SQLException e){
				System.out.println(e);
			}
			catch(ClassNotFoundException e1){
				System.out.println(e1);
			}
				finally {
		
		try {
			con.close();
			sc.close();
		} catch (Exception e) {
			System.out.println(e);
			}
		}
	}	
}
