package com.cg.rest.dto;

public class Employee {
	
	
	private int empId;
	private String name;
	private String gender;
	private int age; 
	private double salary;
	
	
	public Employee() {
		
	}



	public Employee(int empId, String name, String gender, int age, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.salary = salary;
	}



	public int getEmpId() {
		return empId;
	}


	public String getName() {
		return name;
	}


	public String getGender() {
		return gender;
	}


	public int getAge() {
		return age;
	}


	public double getSalary() {
		return salary;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	
	

}