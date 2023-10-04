package com.infinite.Login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginMvc {
	Connection con=null;
	
		@RequestMapping("/")
		public String display(){
			return "index";
		}
			@RequestMapping("/login")
			public String login(HttpServletRequest request,HttpServletResponse response){
			try{
				Class.forName("com.mysql.cj.jdbc.Driver");
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/training","root","narennaren");
				String user=request.getParameter("username");
				String pass=request.getParameter("password");
				PreparedStatement ps=con.prepareStatement("select * from login where username=?");
				ps.setString(1, user);
				ResultSet rs=ps.executeQuery();
				while(rs.next()){
				if(rs.getString(1).equals(user)){
					if(rs.getString(2).equals(pass)){	
						return "login1";
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
				System.out.println(e);
			}
			catch(Exception e1){
				System.out.println(e1);
			}
			return "invalid";			
		}
	}
