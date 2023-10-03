package com.infinite.servletTest;
//Check Eligibilty of the Voter with Age
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class VoteInsert
 */
public class VoteInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VoteInsert() {
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
		int a;
		//Scanner sc=new Scanner(System.in);
		try{
			a=Integer.valueOf(request.getParameter("age"));		//Getting the Age 
			if(a>=18)
			{
				response.sendRedirect("InsertDetails.html");	//If Eligible then move to InsertDetails.html
			}
			else{
				response.sendRedirect("Failure.html");			//If not Eligible then move to Failure.html
			}
		}
		catch(Exception e1){
			System.out.println(e1);
		}
		finally{
			try{
//				sc.close();
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
	}

}
