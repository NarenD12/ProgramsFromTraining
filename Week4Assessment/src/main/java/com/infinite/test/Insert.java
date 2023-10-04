package com.infinite.test;
//Inserting into the Database
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author narend
 *
 */
@Controller
public class Insert {
	Connection con=null;
		
		@RequestMapping("/")
		public String display(){
			return "index";
		}
	
	@RequestMapping("/InsertDetails")
	public String Insertion(HttpServletRequest request,HttpServletResponse response){
		try{
			con=ConToDB.initializeDB();			//Connection to the Database
			String Modelno=request.getParameter("modelno");
			String Name=request.getParameter("nameofmodel");
			String yr=request.getParameter("year");
			Integer Cost=Integer.valueOf(request.getParameter("cost"));
			PreparedStatement ps=con.prepareStatement("insert into lenovo values(?,?,?,?)");	//SQL Statement
			ps.setString(1,Modelno);
			ps.setString(2, Name);
			ps.setString(3, yr);
			ps.setInt(4, Cost);
			int status=ps.executeUpdate();			//Executing the SQL Statement
			if(status==1){
				return "insert1";
			}
			else{
				return "failure";
			}
		}
		catch(SQLException e){
			
			e.printStackTrace();
		}
		catch(ClassNotFoundException e1){
			e1.printStackTrace();
		}
		finally{
			try{
				con.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		return "failure";
	}
}
