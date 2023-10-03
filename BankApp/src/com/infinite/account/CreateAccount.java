package com.infinite.account;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CreateAccount
 */
public class CreateAccount extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateAccount() {
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
				conn=ConnectionToDB.initializeConn();
				PreparedStatement ps=conn.prepareStatement("insert into account(Name) value(?)");
				ps.setString(1, request.getParameter("name"));
				int status=ps.executeUpdate();
				if(status==1){
					response.sendRedirect("DepositWithdraw.html");
				}
				else{
					response.sendRedirect("Failure.html");
				}
		}
			catch(SQLException e){
				System.out.println(e);
			}
			catch(Exception e1){
				System.out.println(e1);
			}
			finally{
				try{
					conn.close();
			}catch(Exception e){
				System.out.println(e);
			}
		}
	}
}
