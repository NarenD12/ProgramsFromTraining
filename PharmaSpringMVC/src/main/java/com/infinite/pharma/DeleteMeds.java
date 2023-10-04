/**
 * 
 */
package com.infinite.pharma;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author narend
 *
 */
@Controller
public class DeleteMeds {

	@RequestMapping("/Delete")
	public String deletion(){
		return "delete";
	}


	@RequestMapping("/DeleteDetails")
	public String Deletion(HttpServletRequest request,HttpServletResponse response){
		Connection con=null;
		try{
			DataSource ds=DBConnection.getDataSource();			//Connection to the Database
			con=ds.getConnection();		//Connection to the Database
			String codeno=request.getParameter("codeno");
			PreparedStatement ps=con.prepareStatement("delete from pharma where CodeNo=?");	//SQL Statement
			ps.setString(1,codeno);
			int status=ps.executeUpdate();			//Executing the SQL Statement
			if(status==1){
				return "SuccessDel";
			}
			else{
				return "failure";
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		finally{
			try{
				con.rollback();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		return "failure";	
	}

}

