/**
 * 
 */
package com.infinite.test;

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
public class Delete {
	Connection con=null;
	@RequestMapping("/DeleteDetails")
	public String Deletion(HttpServletRequest request,HttpServletResponse response){
		try{
			con=ConToDB.initializeDB();			//Connection to the Database
			String Modelno=request.getParameter("modelno");
			PreparedStatement ps=con.prepareStatement("delete from lenovo where ModelNo=?");	//SQL Statement
			ps.setString(1,Modelno);
			int status=ps.executeUpdate();			//Executing the SQL Statement
			if(status==1){
				return "delete1";
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
