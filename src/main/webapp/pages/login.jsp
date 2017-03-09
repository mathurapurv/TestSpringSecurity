<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>


<% if (request.getParameter("error") != null ){
        out.println("ERROR LOGIN");
    }
%>

    <form action="/j_spring_security_check"  method="post">
        Username : <input type="text" name="username_p"/><br/>
        Password : <input type="text" name="password_p"/><br/>
        <input type="submit"/>
    </form>



</body>
</html>