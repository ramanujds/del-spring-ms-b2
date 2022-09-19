<%@page import="com.del.tarineeapp.model.Trainee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Trainee Details</title>
</head>
<body>

<h2>Trainee Details</h2>

<% List<Trainee> trainees = (List<Trainee>)request.getAttribute("trainees");  %>

<%
for(Trainee t:trainees){
	out.println(t);
}


%>

</body>
</html>