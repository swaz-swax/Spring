package com.cg.trg.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Displayservlet
 */
@WebServlet("/Displayservlet")
public class Displayservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
	
		ServletContext context=request.getServletContext();
		User u=(User) context.getAttribute("user");
		out.println("user: "+u.getUserId());
		out.println("name: "+u.getName());
		
	}

}
