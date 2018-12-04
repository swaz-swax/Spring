package com.capg.employee.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.capg.employee.dto.Employee;
import com.capg.employee.exception.EmployeeException;
import com.capg.employee.service.EmployeeServiceImpl;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeServiceImpl employeeService;
	
	@RequestMapping("/")
	
	public ModelAndView showIndex(){
		ModelAndView mv=new ModelAndView("index");
		
		
		try {
			List<Employee> employees;
			employees= employeeService.getEmployees();
			System.out.println(employees);
			mv.addObject("employees",employees);
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
		return mv;
	}
	
	
/*	@RequestMapping("/addEmployee")
	public String addEmployee(Model model)
	{
		model.addAttribute("employee", new Employee());
		return "add";
	}*/
	@RequestMapping("/addEmployee")
	public String showAdd(Model model)
	{
		model.addAttribute("employee", new Employee());
		return "add";
	}
	
	@RequestMapping("/add")
	public ModelAndView addEmployee(@Valid @ModelAttribute Employee employee, BindingResult result)
	{
		ModelAndView mv=null;
		
		if(result.hasErrors())
		{
			mv=new ModelAndView("add");
			mv.addObject("employee",employee);
		}
		else
		{
			//for store into the database
		}
		return mv;
	}
	/*String showIndex()
	{
		return "index";
	}
*/
}
