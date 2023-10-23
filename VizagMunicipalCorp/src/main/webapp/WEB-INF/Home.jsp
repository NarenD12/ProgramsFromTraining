<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<Style>
body{
text-align:center;
}
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
</Style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
</head>
<body>
<h3>Welcome to Vizag Municipal Corporation ${msg}.</h3>
<img src="http://vmrda.gov.in/slides/19.jpg" width=200px height=200px>
<h3> About Us </h3>
<p>Visakhapatnam Urban Development Authority was constituted on 17th June 1978, under AP Urban Areas (Development) Act, 1975 with its jurisdiction extending over Visakhapatnam Municipal Corporation and four municipal towns namely Vizianagaram, Bheemunipatnam, Gajuwaka and Anakapalli including 287 villages in 178 Gram Panchayats, comprising an area of 1721 sq.km. Its function was
<br>
1.To regulate and enforce the development as per the plans,<br>
2.To formulate and implement projects for housing infrastructure and<br>
3.To coordinate various developmental projects for implementation of the Master Plan proposals.<br>
</p>
<form action="/registercomplaint" method="post">
<input type="submit" value="Register Complaint" class="blue-button"><br><br>
<textarea id="complaint" name="complaint" rows="4" cols="50">
</textarea>
</form><br><br>

<a href="/logout"><input type="button" value="Logout" class="blue-button"></a>
</body>
</html>