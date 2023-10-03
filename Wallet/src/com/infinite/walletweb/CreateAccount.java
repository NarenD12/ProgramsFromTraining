package com.infinite.walletweb;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

//import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CreateAccount extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateAccount() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Connection on=null;
		try{
			//ServletConfig cg = getServletConfig();
			Class.forName("com.mysql.jdbc.Driver");
			on = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "mysql123@");
			//Statement st=on.createStatement();
			//Scanner s=new Scanner(System.in);
			PreparedStatement ps=on.prepareStatement("Insert into wallet values(?,?,?,?);");
			ps.setString(1,request.getParameter("username"));
			ps.setInt(2,Integer.valueOf(request.getParameter("pin")));
			ps.setInt(3,Integer.valueOf(request.getParameter("Account_id")));
			ps.setInt(4,Integer.valueOf(request.getParameter("balance")));
		
			ps.executeUpdate();
			ps.close();
			response.sendRedirect("Combine.jsp");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			try{
				on.close();
			}
			catch(Exception e1)
			{
				System.out.println(e1);
			}
		}
	}

}