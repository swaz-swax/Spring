package com.cg.trg.demo;

public class User {
private Integer userId;
private String name;
private Integer age;
public User() {
	// TODO Auto-generated constructor stub
}
public Integer getUserId() {
	return userId;
}
public void setUserId(Integer userId) {
	this.userId = userId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Integer getAge() {
	return age;
}
public void setAge(Integer age) {
	this.age = age;
}
public User(Integer userId, String name, Integer age) {
	super();
	this.userId = userId;
	this.name = name;
	this.age = age;
}
}
