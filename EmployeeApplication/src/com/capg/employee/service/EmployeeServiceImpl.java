package com.capg.employee.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.employee.dao.EmployeeDAOImpl;
import com.capg.employee.dto.Employee;
import com.capg.employee.exception.EmployeeException;

@Transactional
@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	EmployeeDAOImpl employeeDAO;
	
	@Override
	public List<Employee> getEmployees() throws EmployeeException {
		
		return employeeDAO.getEmployees();
	}

}
