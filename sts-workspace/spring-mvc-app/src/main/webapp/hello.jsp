<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<title>Hello-World</title>
</head>
<body>

<h1>Hello ${username}.. Welcome to Spring MVC</h1>

<h1>Hello <%=request.getAttribute("username")%>.. Welcome to Spring MVC</h1>

</body>
</html>