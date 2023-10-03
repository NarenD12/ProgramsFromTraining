package com.infinite.servletTest;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Insertion
 */
public class Insertion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Insertion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// TODO Auto-generated method stub
		Connection conn=null;
		try{
		conn=ConnToDB.ConnectDatabase();	//Connect to Database 
		PreparedStatement ps=conn.prepareStatement("insert into vote values	(?,?,?)");	//SQL Statement 
	
		ps.setString(1, request.getParameter("name"));			//Getting the Details of voter 
		ps.setString(2, request.getParameter("address"));
		ps.setInt(3, Integer.valueOf(request.getParameter("age")));
		int status=ps.executeUpdate();				//Executing the Query
		if(status==1){
			response.sendRedirect("Success.html");		//After Execution move to Success.html
			}
		else{
			System.out.println("failed to insert");
			response.sendRedirect("Failure.html");		//If Fail then move to Failure.hmtl
			}
	}
	catch(SQLException e){
		System.out.println(e);
	}catch(Exception e1){
		System.out.println(e1);
	}finally{
		try{
			conn.close();
//			sc.close();
		}
		catch(Exception e1){
			System.out.println(e1);
			}
		}
	}
}
