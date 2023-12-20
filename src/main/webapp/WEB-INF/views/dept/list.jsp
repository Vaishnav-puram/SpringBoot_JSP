<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h5>Dept List : </h5>

<form action="emps/empList" method="get">
	<select name="id" id="candidates">
	<c:forEach var="dept" items="${requestScope.dept_list}">
		
  <option value="${dept.id}">${dept.name}</option>
	</c:forEach>
	</select>
	<button type="submit">View Employee</button>
</form>
</body>
</html>