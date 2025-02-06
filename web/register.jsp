<%-- 
    Document   : register
    Created on : 3 Feb 2025, 3:26:06 pm
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Register</h1>
        <form  method="POST" action="Register">
        <input type="text" placeholder="Enter the email " name="email1"/> <br>
        <input type="text" placeholder="Enter the name" name="name1"/> <br>
        <input type="password" placeholder="Enter the password" name="pass1"/> <br>
        <input type="submit" value="Register"/> 
        </form>
    </body>
</html>
