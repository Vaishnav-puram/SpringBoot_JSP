<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Employee list :</h3>
	<%-- 	<h4>${requestScope.emp_list}</h4> --%>
	<form>
		<table>
			<tr>
				<th>First Name<th>
				<th>Last Name<th>
				<th>Email<th>
				<th>Joining Date<th>
				<th>Employment Type<th>
			</tr>
			<c:forEach var="emp" items="${requestScope.emp_list}">
			<tr>
					<td>${emp.firstName}</td>
					<td>${emp.lastName}</td>
					<td>${emp.email}</td>
					<td>${emp.joinDate}</td>
					<td>${emp.empType}</td>
			</tr>
			</c:forEach>
		
		</table>
	</form>
</body>
</html>