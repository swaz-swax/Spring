package com.cg.emp.dao;

import java.util.List;

import com.cg.emp.dto.Employee;
import com.cg.emp.exception.EmployeeException;


public interface IEmployeeDAO {
List<Employee> getEmployees() throws EmployeeException;
}
