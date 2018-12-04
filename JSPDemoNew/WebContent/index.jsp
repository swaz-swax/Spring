<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" errorPage="error.jsp"%>
<%@ page import="com.cg.trg.demo.User"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 
	<%-- <%!int prod(int a, int b) {
		return a * b;
	}%>

	hidden comment in html but shown in servlet 
	<!-- output comment in html -->
	<%
		int i = 90;
		int j = 20;
		int m = 10 / 0;
		int c = i + j;
	%>
	Result in outside the block :
	<%=c%>
	<%
		for (int k = 1; k < 11; k++) {
	%>
	value of k=
	<%=k%>
	<%
		}
	%> 
 --%>
	<br>
	<br>
	<br>
	<br>
	<%-- <h1>Welcome User</h1>
	<%
		//User user = (User) session.getAttribute("user");
		User user = (User) application.getAttribute("user");
	%>
	<table border="1">
		<tr>
			<th>User Id</th>
			<th>User name</th>
			<th>Age</th>
		</tr>
		<tr>
			<td><%=user.getUserId()%></td>
			<td><%=user.getName()%></td>
			<td><%=user.getAge()%></td>
		</tr>

	</table> --%>
	<h1>Welcome to index.jsp file</h1>
	<%-- <jsp:useBean id="user" class="com.cg.trg.demo.User"/>
	<jsp:setProperty property="userId" name="user" param="id"/>
	<jsp:setProperty property="name" name="user" param="name"/> --%>
	<%-- userId: ${param.userId } --%>
	name: ${name }
	
	
	

</body>
</html>