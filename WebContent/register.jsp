<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
</head>
<body>
    <form name="form" action="register" method="post">
        <table>
         <tr>
         <td>FirstName</td>
         <td><input type="text" name="first_name" /></td>
         </tr>
         <tr>
         <td>Last Name</td>
         <td><input type="text" name="last_name" /></td>
         </tr>
         <tr>
         <td>Email</td>
         <td><input type="text" name="email" /></td>
         </tr>
         <tr>
         <td>Username</td>
         <td><input type="text" name="username" /></td>
         </tr>
         <tr>
         <td>Password</td>
         <td><input type="password" name="password" /></td>
         </tr>
         
         <tr>
         <td><%=(request.getAttribute("Message") == null) ? ""
         : request.getAttribute("Message")%></td>
         </tr>
         <tr>
         <td></td>
         <td><input type="submit" value="Register"></input>
         
         </tr>
        </table>
    </form>
</body>
</html>

