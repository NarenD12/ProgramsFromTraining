package com.infinite.walletweb;

 

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 

/**
* Servlet implementation class Compare
*/
public class ComparisonDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ComparisonDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

 

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if (request.getParameter("username").equals("chawan123")){
			if (request.getParameter("pin").equals("2001")){
			response.sendRedirect("Firstpage.html");}
			else{
				response.sendRedirect("Fail.html");}
			
		}
		else if (request.getParameter("username").equals("naren123"))
		{
			if (request.getParameter("pin").equals("2002")){
			response.sendRedirect("Firstpage.html");}
			else{
				response.sendRedirect("Fail.html");}
			}
			
		else if (request.getParameter("username").equals("bunny"))
		{
			if (request.getParameter("pin").equals("2003")){
			response.sendRedirect("Firstpage.html");}
			else{
				response.sendRedirect("Fail.html");}
		}
		else if (request.getParameter("username").equals("shiva123"))
		{
			if (request.getParameter("pin").equals("2003")){
			response.sendRedirect("Firstpage.html");}
			else{
				response.sendRedirect("Fail.html");}
			
		}
		else if (request.getParameter("username").equals("sai234"))
		{
			if (request.getParameter("pin").equals("2004")){
			response.sendRedirect("Firstpage.html");}
			else{
				response.sendRedirect("Fail.html");}
		}
		}
	
 

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

 

}