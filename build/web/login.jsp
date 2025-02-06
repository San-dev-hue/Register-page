 <%-- 
    Document   : login
    Created on : 3 Feb 2025, 3:24:54 pm
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
        <h1>Login</h1>
        <form  method="POST" action="Login">
            <input type="text" placeholder="Enter the email id" name="email1" /> <br> 
            <input type="text" placeholder="Enter the password" name="pass1" /> <br>
            <input type="submit" value="login"/>
            
        </form>
    </body>
</html>
