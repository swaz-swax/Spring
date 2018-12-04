<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Add Employee</h1>
	<f:form method="post" action="add" modelAttribute="employee">
		<table>
			<tr>
				<td><f:label path="empId">Employee Id</f:label></td>
				<td><f:input path="empId" /></td>
				<td><f:errors path="empId" cssStyle="color:red" /></td>

			</tr>
			
			<tr>
				<td><f:label path="name">Employee Name</f:label></td>
				<td><f:input path="name" /></td>
				<td><f:errors path="name" cssStyle="color:red" /></td>

			</tr>
			<tr>
				<td><f:label path="gender">Employee Gender</f:label></td>
				<td><f:radiobutton path="gender"  value="Male"/></td>
				<td><f:radiobutton path="gender"  value="Female"/></td>
				<td><f:errors path="gender" cssStyle="color:red" /></td>

			</tr>
			
			<tr>
				<td><f:label path="age">Employee Age</f:label></td>
				<td><f:input path="age" /></td>
				<td><f:errors path="age" cssStyle="color:red" /></td>

			</tr>
			<tr>
				<td><f:label path="salary">Employee Name</f:label></td>
				<td><f:input path="salary" /></td>
				<td><f:errors path="salary" cssStyle="color:red" /></td>

			</tr>
			
<tr><td></td>
</tr>
		</table>
		<td><input type="submit" value="Add Employee"/></td>
	</f:form>
</body>
</html>