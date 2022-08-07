<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color:yellow;">
<h1>Hi <%=session.getAttribute("userid")%></h1>
<h1>Welcome to Home Page</h1>
<a href="products.jsp">Products</a> 
<a href="logout">Logout</a>
<hr>
<p style="color:green;">
 This website contains all the product list
</p>
</body>
</html>