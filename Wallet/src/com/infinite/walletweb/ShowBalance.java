package com.infinite.walletweb;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Showbalance
 */
public class ShowBalance extends HttpServlet {
	private static final long serialVersionUID = 1L;
       Connection on=null;
       PreparedStatement ps=null;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowBalance() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try{
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			//ServletConfig cg=getServletConfig();
			Class.forName("com.mysql.jdbc.Driver");
			on=DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "mysql123@");
			
			PreparedStatement ps=on.prepareStatement("select balance from wallet where Account_id=?");
			ps.setInt(1,Integer.valueOf(request.getParameter("Account_id")));
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				int bal = rs.getInt("balance");
				
				out.println("<html><body>");
				out.println("<h3>Available balance<h3>");
				out.println("<table border=1>"
							+ "<tr>" 
							+ "<td><b>"+bal+"</b></td>");
			}
			//ps.setString(1,request.geresulttParameter("username"));
			
			
		/*	ResultSet rs=ps.executeQuery("select balance from accounts where accountid=?");
			ps.setInt(1,Integer.valueOf(request.getParameter("accountid")));
			while(rs.next()){
			if(Integer.valueOf(request.getParameter("accountid")).equals(rs.getInt("accountid")))
			{
				//String name = rs.getString("username");
				int display = rs.getInt("balance");

				out.println("<tr>" + "<td>" + display + "</td>" + "</tr>");
			//}
			//}
*/			out.println("</table><form action="+"Firstpage.html"+"><input type="+"submit"+"></body></html>");
		
			out.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally{
			try{
				on.close();
				ps.close();
			}
			catch(Exception e1)
			{
				System.out.println(e1);
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}