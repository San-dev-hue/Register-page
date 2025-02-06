<%-- 
    Document   : profile
    Created on : 3 Feb 2025, 3:25:44 pm
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<jsp:useBean id="session_emp" class="program.com.Employee" scope="session"></jsp:useBean>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Welcome: <jsp:getProperty name="session_emp" property="name"></jsp:getProperty></h1>
    <a href="Logout">Logout</a>
    </body>
</html>
