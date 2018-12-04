<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Welcome to Spring Demo</h1>
	<hr>
	<h2>Employee Management System</h2>
<form action="addEmployee">
<input type="submit" value="Add Employee"/> 
</form>
<hr>
	<table border="1">
		<tr>
			<th>Employee Id</th>
			<th>Employee name</th>
			<th>Employee gender</th>
			<th>Employee age</th>
			<th>Employee salary</th>
		</tr>


		<c:forEach items="${employees }" var="employee">
			<tr>
				<td>${employee.empId }</td>
				<td>${employee.name }</td>
				<td>${employee.gender }</td>
				<td>${employee.age }</td>
				<td>${employee.salary }</td>
			</tr>

		</c:forEach>
	</table>
</body>
</html>