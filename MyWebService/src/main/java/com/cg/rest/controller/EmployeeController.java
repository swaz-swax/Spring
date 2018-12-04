package com.cg.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.rest.dto.Employee;
import com.cg.rest.service.EmployeeService;

@RestController
@RequestMapping("/rest")
public class EmployeeController {

	@Autowired
	EmployeeService service;
	
	@RequestMapping("/hi")
	public String sayHello() {
		return "hey, there!!";
	}
	
	@RequestMapping("/employees")
	public List<Employee> getEmployees(){
		return service.getEmployees();
	}
	
	@RequestMapping("employees/{foo}") //{id} is variable
	public Employee getEmployeeById(@PathVariable("foo") int id) // if both {..} and parameter name is same then we dont need to specify that in path variable
	{
		return service.getEmployeeById(id);
		
	}
	@RequestMapping(method=RequestMethod.POST, value="/employees")
	public void addEmployee(@RequestBody Employee emp)
	{
		service.addEmployee(emp);
	}
	@RequestMapping(method=RequestMethod.PUT, value="employees/{id}")
	public void updateEmployee(@RequestBody Employee emp, @PathVariable int id) {
		service.updateEmployee(emp,id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="employees/{id}")
	public void deleteEmployee(@PathVariable int id) {
		service.deleteEmployee(id);
	}

}
