package com.infinite.walletweb;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class FundTransferfile extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection on = null;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FundTransferfile() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		int bal = Integer.parseInt(request.getParameter("amount"));
		int newbal = 0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			on = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "mysql123@");
			PreparedStatement ps = on.prepareStatement("select balance from wallet where username=?");
			ps.setString(1,request.getParameter("username1"));
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				int availablebal = rs.getInt("balance");
				newbal = availablebal - bal;
				PreparedStatement ps2 = on.prepareStatement("update wallet set balance = ? where username=?");
				ps2.setInt(1, newbal);
				ps2.setString(2,request.getParameter("username1")); 
				ps2.executeUpdate();
				ps2.close();
			}

 

			ps = on.prepareStatement("select balance from wallet where username=?");
			ps.setString(1,request.getParameter("username2"));
			ResultSet rs1 = ps.executeQuery();
			if (rs1.next()) {
				int balance = rs1.getInt("balance");
				newbal = balance + bal;
				PreparedStatement ps4 = on.prepareStatement("update wallet set balance=? where username=?");
				ps4.setInt(1, newbal);
				ps4.setString(2,request.getParameter("username2"));
				ps4.executeUpdate();
				ps4.close();
			}
			ps.close();
			response.sendRedirect("Success.html");

 

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IllegalStateException e) {
			System.out.println(e);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				on.close();
				System.out.println("Connection closed");
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

 

}