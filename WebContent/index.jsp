<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br>${message}
<br>${msg}

<h2>Please enter your login credential</h2>
<form action="loginpage" method="post" >  
Username:<input type="text" name="username"/><br/><br/>  
Password:<input type="password" name="password"/><br/><br/>  
<input type="submit" value="Login"/> 
<br> 
New User <a href="register.jsp">register here</a>
</form> 
</body>
</html>