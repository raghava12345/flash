//Servlet1.java
package com.nareshit.servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Servlet1 extends HttpServlet 
{
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException 
	{

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		//Obtaining RequestDispatcher object
		RequestDispatcher rd = request.getRequestDispatcher("./s2");
		
		System.out.println("1");
		out.println("1<BR>");
		
		request.setAttribute("name", "Hari");
		
		//rd.forward(request, response);
		//rd.include(request, response);
		response.sendRedirect("./s2");
		
		out.println("2<BR>");
		System.out.println("2");
	}
}
