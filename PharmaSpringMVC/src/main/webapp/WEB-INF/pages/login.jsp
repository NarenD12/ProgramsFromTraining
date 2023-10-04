<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="com.infinite.pharma.DBConnection"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<Style>
body {
	text-align: center;
}
</Style>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert or Delete</title>
</head>
<body>

	<%
		Connection con = null;
		response.setContentType("text/html");
		PrintWriter ou = response.getWriter();
		DataSource datasource = DBConnection.getDataSource();
		con = datasource.getConnection();
		PreparedStatement ps = con.prepareStatement("Select DISTINCT(Name) from pharma");
		ResultSet rs = ps.executeQuery();
		out.println("<html><body>Displaying Available Medicines<br><br></body></html");
		while (rs.next()) {
			out.println("<html><body>" + rs.getString(1) + "<br></body></html>");
		}
	%>
	<br>
	<a href="Insert"><input type="button"
		value="Insert Medicine Details"></a>
	<br>
	<a href="Delete"><input type="button"
		value="Delete Medicine Details"></a>
</body>
</html>