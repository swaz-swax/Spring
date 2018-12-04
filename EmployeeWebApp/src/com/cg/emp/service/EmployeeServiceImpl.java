package com.cg.emp.service;

import java.util.List;

import com.cg.emp.dao.EmployeeDAOImpl;
import com.cg.emp.dao.IEmployeeDAO;
import com.cg.emp.dto.Employee;
import com.cg.emp.exception.EmployeeException;

public class EmployeeServiceImpl implements IEmployeeService {
 IEmployeeDAO employeeDAO=new EmployeeDAOImpl();
	@Override
	public List<Employee> getEmployees() throws EmployeeException {
		// TODO Auto-generated method stub
		return employeeDAO.getEmployees();
	}

}
