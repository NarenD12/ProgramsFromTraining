package com.infinite.pharma;
//Class to Validate Login of user 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginPage {

	@RequestMapping("/LoginPage")
	public String login(HttpServletRequest request,HttpServletResponse response){
		Connection con=null;
		String user=request.getParameter("username");
		String pass=request.getParameter("password");
		PreparedStatement ps=null;
		ResultSet rs=null;
		try{
			DataSource datasource=DBConnection.getDataSource();		//Connection to DB
			con=datasource.getConnection();				//Connection to DB
			ps=con.prepareStatement("Select * from login where username=?");  //SQL Statement
			ps.setString(1, user);
			rs=ps.executeQuery();			//Executing SQL Statement
			while(rs.next()){
				if(rs.getString(1).equals(user)){
					if(rs.getString(2).equals(pass)){	
						return "login";
					}
					else{
						return "invalid";
					}
				}
				else{
					return "invalid";
				}
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				con.rollback();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		return "invalid";
	}
}
