package com.capg.employee.service;

import java.util.List;

import com.capg.employee.dto.Employee;
import com.capg.employee.exception.EmployeeException;

public interface IEmployeeService {
	List<Employee> getEmployees() throws EmployeeException;
}
