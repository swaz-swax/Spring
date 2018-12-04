package com.cg.trg.demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class DemoServlet
 */
@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*User user=new User();
		user.setUserId(1);
		user.setName("Swarup");
		user.setAge(30);
		HttpSession session=request.getSession();
		session.setAttribute("user", user); //session specific- for one brwoser
		ServletContext context=request.getServletContext();
		context.setAttribute("user", user);*/
		/*
		String name1="Swarup";
		String name2="Swaru";
		String name3="Swar";
		PrintWriter out=response.getWriter();
		
		request.setAttribute("name", name1);
		getServletContext().setAttribute("name", name2);
		request.getSession().setAttribute("name", name3);
		RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);*/
		
		
		//PrintWriter out=response.getWriter();
		List<User> users=new ArrayList<User>();
		users.add(new User(1, "Sumi", 24));
		users.add(new User(2, "Tumi", 24));
		users.add(new User(3, "Mumi", 24));
		users.add(new User(4, "Zumi", 41));
		users.add(new User(5, "Lumi", 4));
		request.getSession().setAttribute("users", users);

		
		}

}
