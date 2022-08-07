<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body><script> 
function validate()
{ 
     var first_name = document.form.first_name.value;
     var email = document.form.email.value;
     var username = document.form.username.value; 
     var password = document.form.password.value;
     var last_name= document.form.last_name.value;
     
     if (first_name==null || first_name=="")
     { 
     alert("Name can't be blank"); 
     return false; 
     }
     else if (last_name==null || last_name=="")
     { 
     alert("Name can't be blank"); 
     return false; 
     }
     else if (email==null || email=="")
     { 
     alert("Email can't be blank"); 
     return false; 
     }
     else if (username==null || username=="")
     { 
     alert("Username can't be blank"); 
     return false; 
     }
     else if(password.length<6)
     { 
     alert("Password must be at least 6 characters long."); 
     return false; 
     } 
         } 
 } 
</script> 
</head>
<body>
    <form name="form" action="register" method="post" onsubmit="return validate()">
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

