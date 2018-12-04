package com.cg.rest.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.rest.dto.Employee;

@Service
public class EmployeeService {
List<Employee> employees=new ArrayList<Employee>(
		Arrays.asList(
				new Employee(1001, "Anil", "male", 23, 12000),
				new Employee(1002, "Tanil", "male", 21, 12000),
				new Employee(1003, "Pronil", "male", 33, 12000),
				new Employee(1004, "Anila", "female", 22, 12000)

				)
		);

public List<Employee> getEmployees(){
	return employees;
}

public Employee getEmployeeById(int id)
{
	return employees.stream().filter(e->e.getEmpId()==id).findFirst().get();
	
}

public void addEmployee(Employee emp)
{
	employees.add(emp);
}
public void updateEmployee(Employee emp, int id)
{
	for (int i=0;i<employees.size();i++) {
		Employee e=employees.get(i);
		if(e.getEmpId()==id)
		{
			employees.set(i,emp);
		}
		
	}
}
public void deleteEmployee(int id)
{
	employees.removeIf(e->e.getEmpId()==id);
}
}
