package com.cg.emp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.cg.emp.exception.EmployeeException;


public class DBUtil {

	public static Connection getConnection() throws EmployeeException
	{
		String url="jdbc:mysql://localhost:3306/training";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection(url,"root","root");
		} catch (ClassNotFoundException e) {
			throw new EmployeeException(e.getMessage());
		} catch (SQLException e) {
			throw new EmployeeException(e.getMessage());
			}
		
		
		
	}
}
