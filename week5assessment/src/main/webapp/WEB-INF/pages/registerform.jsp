<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<Style>
body{text-align:center;}
label{text-align:right;}
</Style>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="register" method="post">
<pre>
<label>Full Name	</label><input type="text" name="fname" placeholder="Enter Full Name"><br><br>
<label>Email	  </label><input type="email" name="email" placeholder="Enter Email"><br><br>
<label>Password		</label><input type="password" name="password" placeholder="Enter Password"><br><br>
<label>Birthday		</label><input type="date" name="birthday" placeholder="Enter Birthday"><br><br>
<label>Gender		</label><input type="radio" name="Male">Male <input type="radio" name="female">Female<br><br>
<label>   
Profession :  
</label>   
<select>  
<option value="Developer">Developer</option>  
<option value="Team Lead">Team Lead</option>  
<option value="Manager">Manager</option>    
</select><br><br>
<label>Marriage</label><input type="checkbox" name="marry"><br><br>
<label>Note</label><textarea cols="80" rows="5" value="note"></textarea><br><br>
<input type="submit" value="Register">
</pre>
</form>
</body>
</html>