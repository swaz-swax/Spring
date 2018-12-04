package com.cg.emp.service;

import java.util.List;

import com.cg.emp.dto.Employee;
import com.cg.emp.exception.EmployeeException;

public interface IEmployeeService {
	List<Employee> getEmployees() throws EmployeeException;
}
