<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1" >
       <tr>
          <th>Product id</th>
          <th>Product Name</th>
          <th>Product Description</th>
          <th>Price</th>
       </tr>
       <c:forEach items="${requestScope.productList}" var="list" >
          <tr>
             <td>${list.p_id}</td>
             <td>${list.pname}</td>
             <td>${list.p_desc}</td> 
             <td>${list.price}</td>
          </tr>
       </c:forEach>
      
       </table> 
</body>
</html>