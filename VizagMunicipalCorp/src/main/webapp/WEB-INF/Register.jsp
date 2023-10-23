<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<Style>
.blue-button {
	background: #25A6E1;
	filter: progid: DXImageTransform.Microsoft.gradient( startColorstr='#25A6E1',
		endColorstr='#188BC0', GradientType=0);
	padding: 3px 5px;
	color: #fff;
	font-family: 'Helvetica Neue', sans-serif;
	font-size: 12px;
	border-radius: 2px;
	-moz-border-radius: 2px;
	-webkit-border-radius: 4px;
	border: 1px solid #1A87B9
}
table {
	font-family: "Helvetica Neue", Helvetica, sans-serif;
	width: 50%;
}
th {
	background: SteelBlue;
	color: white;
}
</Style>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Register</title>
</head>
<body>
	<form:form method="post" modelAttribute="user"
		action="${pageContext.request.contextPath}/registerForm">
		<table>
			<tr>
				<th colspan="2">Register User</th>
			</tr>
			<tr>
				<form:hidden path="id" />
				<td><form:label path="name">Full Name</form:label></td>
				<td><form:input path="name" size="30" maxlength="30"></form:input></td>
			</tr>
			<tr>
				<td><form:label path="password">Password</form:label></td>
				<td><form:input type="password" path="password" size="30" maxlength="30"></form:input></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Register" class="blue-button" /></td>
			</tr>
		</table>
	</form:form>
	<a href="/Loginpage"><input type="button" class="blue-button" value="Go to Login Page"></a>
</body>
</html>