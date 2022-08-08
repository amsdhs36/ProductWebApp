<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="Com.to.data.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="products.jsp">Back to previous page </a>
<br>
<br>

<table border="1" >
          <tr>
          <th>Product ID</th>
          <th>Product Name</th>
          <th>Product Description</th>
          <th>Price</th>
          </tr>  
          <% product pdata=(product)session.getAttribute("pdata");%>    	          	           
          <tr>
             <td><%=pdata.getP_id() %></td>
              <td><%=pdata.getPname() %></td>
               <td><%=pdata.getP_desc() %></td>
                <td><%=pdata.getPrice()%></td>
             
          </tr>
        
       </table>
</body>
</html>