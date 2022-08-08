<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br>${emessage}
<a href="home.jsp">Back to home page </a>
<h1>Welcome to products page</h1>
                 
  <form action="productData" method="post" >  
        Product ID:<input type="text" name="p_id"/><br/><br/>  
        <input type="submit" value="Get Details"/>
   </form>
      <table border="1" >
      <tr>   
      <th>Product ID</th>
      <th>Product Name</th>
      </tr>
      <tr>
             <td>101</td>
             <td>Apple</td>
      </tr>
      <tr>
             <td>102</td>
             <td>Orange</td>
      </tr>
      <tr>
             <td>103</td>
             <td>Banana</td>
      </tr>
      <tr>
             <td>104</td>
             <td>Kiwi</td>
      </tr>
      <tr>
             <td>105</td>
             <td>Papaya</td>
      </tr>
    </table>
      
      
      
</body>
</body>
</html>