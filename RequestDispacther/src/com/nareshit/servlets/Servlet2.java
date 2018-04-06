//Servlet2.java
package com.nareshit.servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Servlet2 extends HttpServlet 
{
	public void doGet(HttpServletRequest request, 
									HttpServletResponse response)
			throws ServletException, IOException 
	{

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String name	= (String)request.getAttribute("name");

		out.println(name+"<BR>");
		out.println("3<BR>");
		System.out.println("3");
	}
}


