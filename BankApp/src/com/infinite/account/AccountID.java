package com.infinite.account;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AccountID
 */
public class AccountID extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AccountID() {
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
			HttpSession ses=request.getSession();
			conn=ConnectionToDB.initializeConn();
			PreparedStatement st=conn.prepareStatement("Select idno from account");
			ResultSet rs=st.executeQuery();
			response.getWriter().println("<pre><center> Your Account Idno: <center/><pre/>"+rs);
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
			}
			catch(Exception e1){
				System.out.println(e1);
			}
		}
		
	}

}
