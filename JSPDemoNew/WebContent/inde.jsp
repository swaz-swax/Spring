<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:set var="company" value="Capg"/>
<c:out value="${company }"/>
<hr>
<%-- <c:remove var="company"/> --%>
<!-- switch case -->

<c:set var="day" value="1"/>
	<c:choose>
		<c:when test="${day eq 1 }">Monday</c:when>
		<c:when test="${day==2 }">tuesday</c:when>
		<c:when test="${day==3 }">wednesday</c:when>
		<c:when test="${day==4 }">thursday</c:when>
		<c:otherwise>no day</c:otherwise>
	</c:choose>
	
	<hr>
	<c:set var="countries" value="India China US UK Canada"/>
	<c:forTokens items="${countries }" delims=" " var="country"/>
	<c:out value="${country }"/>
	<hr>
	<table border="1">
	<tr>
	<th>User Id</th>
	<th>Name</th>
	<th>Age</th>
	</tr>
	<c:forEach items="${users}" var="user">
	<tr>
	<td>${user.userId }</td>
	<td>${user.name }</td>
	<td>${user.age }</td>
	</tr>
	</c:forEach>
	</table>
	
	<c:import url="myjsp.jsp">
	<c:param name="name" value="Swajhj"/> 
	<c:param name="city" value="Delhi"/> 
	</c:import>
	
	<%-- <c:redirect url="myjsp.jsp">
	<c:param name="name" value="Swajhj"/> 
	<c:param name="city" value="Delhi"/> 
	</c:redirect>
	
	<c:url var="myUrl" value="myjsp.jsp">
	<c:param name="name" value="Amit"/> 
	<c:param name="city" value="chennai"/> 
	</c:url>
	<c:redirect url="${myurl }"/> --%>
	<hr>
	<c:catch var="myException">
	<%
	int res=10/0;
	%>
	</c:catch>
	
	
	<c:if test="${myException != null }">
	Type of Exception =${myException }
	<br>
	Message: ${myException.message}
	</c:if>
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
</body>
</html>