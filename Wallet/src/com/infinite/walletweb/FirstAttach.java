package com.infinite.walletweb;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstAttach
 */
public class FirstAttach extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstAttach() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("select").equals("1")){
			response.sendRedirect("Deposit.html");
			}
	    else if(request.getParameter("select").equals("2")){
			response.sendRedirect("Withdraw.html");
			}
	   else if(request.getParameter("select").equals("3"))
	               {
					response.sendRedirect("Showbalance.html");
					}
	   else if(request.getParameter("select").equals("4"))
	   {
					response.sendRedirect("FundTransfer.html");
					}
		
	}}