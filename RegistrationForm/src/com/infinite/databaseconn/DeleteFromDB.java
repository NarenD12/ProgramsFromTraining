package com.infinite.databaseconn;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeleteFromDB
 */
public class DeleteFromDB extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteFromDB() {
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
		ServletConfig cg= getServletConfig();
		String url=cg.getInitParameter("url");
		String user=cg.getInitParameter("username");
		String pass=cg.getInitParameter("password");
		Connection conn=null;
		Scanner sc= new Scanner(System.in);
			try{
				Class.forName(cg.getInitParameter("mysql"));
				conn =DriverManager.getConnection(url,user,pass);
				System.out.println("Connection Established");
				PreparedStatement ps= conn.prepareStatement("Delete from example1 where idno=(?)");
				ps.setInt(1,Integer.valueOf(request.getParameter("idno")));
				int status=ps.executeUpdate();
				if(status==1){	
					System.out.println("Record Deleted");
					response.sendRedirect("SuccessMsg.html");
			}else{
				System.out.println("Deletion Failed");
				response.sendRedirect("FailureMsg.html");
			}
	}catch(SQLException e){
				System.out.println(e);
			}catch(ClassNotFoundException e1){
				System.out.println(e1);
			}finally{
				try{
				conn.close();
				sc.close();
				}catch(Exception e){
					System.out.println(e);
			}
		}		
	}
}
