<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Trainee Details</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<h2>Trainee Details</h2>

<p>Trainee ID : ${trainee.traineeId}</p>
<p>Trainee Name : ${trainee.traineeName}</p>
<p>Date Joined : ${trainee.joinDate}</p>

</body>
</html>