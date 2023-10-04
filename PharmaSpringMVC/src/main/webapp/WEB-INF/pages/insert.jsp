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
<title>Insert Product Details</title>
</head>
<body>
	<pre>
<form action="InsertDetails" method="post">
<input type="text" name="codeno" placeholder="Enter Code No"><br>
<input type="text" name="name" placeholder="Enter Name of Medicine"><br>
Expiry Date<br><input type="Date" name="expiry"placeholder="Enter Date of Expiry"><br>
<input type="number" name="cost" placeholder="Enter Cost"><br>
<input type="number" name="quantity" placeholder="Enter Quantity"><br>
<input type="submit" value="Insert"><br>
<input type="reset">
</form>
</pre>
</body>
</html>