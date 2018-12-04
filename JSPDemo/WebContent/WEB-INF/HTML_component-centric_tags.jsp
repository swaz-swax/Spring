<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>HTML-Bean JSP file</title>
</head>
<%-- <jsp:useBean id="clock" scope="page" ></jsp:useBean>
 --%>
<body>
	<h1>Hello World(HTML)</h1>
	<p>Today is: <jsp:getProperty property="date" name="clock"/>
</body>
</html>