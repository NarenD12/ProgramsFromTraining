<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>
<head>
	<title>Aadhar Page</title>
	<style type="text/css">
		.tg  {border-collapse:collapse;border-spacing:0;border-color:#ccc;}
		.tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#fff;}
		.tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#f0f0f0;}
		.tg .tg-4eph{background-color:#f9f9f9}
	</style>
</head>
<body>
<h1>
	Add Aadhar
</h1>

<c:url var="addAction" value="/aadhar/add" ></c:url>

<form:form action="${addAction}" commandName="aadhar">
<table>
	<c:if test="${!empty aadhar.name}">
	<tr>
		<td>
			<form:label path="id">
				<spring:message text="ID"/>
			</form:label>
		</td>
		<td>
			<form:input path="id" readonly="true" size="8"  disabled="true" />
			<form:hidden path="id" />
		</td> 
	</tr>
	</c:if>
	<tr>
		<td>
			<form:label path="aadharid">
				<spring:message text="AadharID"/>
			</form:label>
		</td>
		<td>
			<form:input path="aadharid" />
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="name">
				<spring:message text="Name"/>
			</form:label>
		</td>
		<td>
			<form:input path="name" />
		</td>
	</tr>
	<tr>
		<td>
			<form:label path="paddress">
				<spring:message text="PermAddress"/>
			</form:label>
		</td>
		<td>
			<form:input path="paddress" />
		</td>
	</tr>
	<tr>
		<td colspan="2">
			<c:if test="${!empty aadhar.name}">
				<input type="submit"
					value="<spring:message text="Edit Aadhar"/>" />
			</c:if>
			<c:if test="${empty aadhar.name}">
				<input type="submit"
					value="<spring:message text="Add Aadhar"/>" />
			</c:if>
		</td>
	</tr>
</table>	
</form:form>
<br>
<h3>Aadhar List</h3>
<c:if test="${!empty listaadhars}">
	<table class="tg">
	<tr>
		<th width="120">ID</th>
		<th width="120">Aadhar ID</th>
		<th width="120">Name</th>
		<th width="120">Permanent Address</th>
		<th width="60">Edit</th>
		<th width="60">Delete</th>
	</tr>
	<c:forEach items="${listaadhars}" var="aadhar">
		<tr>
			<td>${aadhar.id}</td>
			<td>${aadhar.aadharid}</td>
			<td>${aadhar.name}</td>
			<td>${aadhar.paddress}</td>
			<td><a href="<c:url value='/edit/${aadhar.id}' />" >Edit</a></td>
			<td><a href="<c:url value='/remove/${aadhar.id}' />" >Delete</a></td>
		</tr>
	</c:forEach>
	</table>
</c:if>
</body>
</html>
