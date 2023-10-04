/**
 * 
 */
package com.infinite.pharma;
//Class to Insert the medicine details
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
public class InsertMeds {


	@RequestMapping("/Insert")
	public String insertion(){
		return "insert";
	}

	@RequestMapping("/InsertDetails")
	public String Insertion(HttpServletRequest request,HttpServletResponse response){
		Connection con=null;
		try{
			DataSource ds=DBConnection.getDataSource();			//Connection to the Database
			con=ds.getConnection();
			String Modelno=request.getParameter("codeno");
			String Name=request.getParameter("name");
			String yr=request.getParameter("expiry");
			Integer Cost=Integer.valueOf(request.getParameter("cost"));
			Integer quantity=Integer.valueOf(request.getParameter("quantity"));
			PreparedStatement ps=con.prepareStatement("insert into pharma values(?,?,?,?,?)");	//SQL Statement
			ps.setString(1,Modelno);			
			ps.setString(2, Name);
			ps.setString(3, yr);
			ps.setInt(4, Cost);
			ps.setInt(5, quantity);
			int status=ps.executeUpdate();			//Executing the SQL Statement
			if(status==1){
				return "SuccessIns";	
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

