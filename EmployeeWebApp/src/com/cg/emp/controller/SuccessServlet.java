package com.cg.emp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.emp.dto.Employee;


@WebServlet("/SuccessServlet")
public class SuccessServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		List<Employee> empList=(List<Employee>) request.getAttribute("employees");
		out.println("<table border=1 bgcolor='yellow'>");
		out.println("<tr bgcolor='cyan'>");
		out.println("<th>Employee Id</th><th>Employee Name</th>");
		out.println("<th>Gender</th><th>Age</th><th>Salary</th></tr>");
		for (Employee employee : empList) {
			out.println("<tr>");
			out.println("<td bgcolor='yellow'>"+employee.getId()+"</td>");
			out.println("<td bgcolor='green'>"+employee.getName()+"</td>");
			out.println("<td bgcolor='orange'>"+employee.getGender()+"</td>");
			out.println("<td bgcolor='red'>"+employee.getAge()+"</td>");
			out.println("<td bgcolor='grey'>"+employee.getSalary()+"</td>");
			out.println("</tr>");
		}
		out.println("</table>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
