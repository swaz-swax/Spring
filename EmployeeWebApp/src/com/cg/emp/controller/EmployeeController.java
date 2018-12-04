package com.cg.emp.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.emp.dto.Employee;
import com.cg.emp.exception.EmployeeException;
import com.cg.emp.service.EmployeeServiceImpl;
import com.cg.emp.service.IEmployeeService;

@WebServlet("/EmployeeController")
public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	IEmployeeService service = new EmployeeServiceImpl();

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
 response
		try {
			List<Employee> empList;
			empList = service.getEmployees();
			RequestDispatcher rd = request
					.getRequestDispatcher("SuccessServlet");
			request.setAttribute("employees", empList);
			rd.forward(request, response);
		} catch (EmployeeException e) {
			RequestDispatcher rdDispatcher = request
					.getRequestDispatcher("ErrorServlet");
			request.setAttribute("error", e);
			rdDispatcher.forward(request, response);

		}

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

	}

}
