package com.capg.employee.dao;

import java.util.List;

import com.capg.employee.dto.Employee;
import com.capg.employee.exception.EmployeeException;

public interface IEmployeeDao {
 List<Employee> getEmployees() throws EmployeeException;
 
 
 
}
