<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Add Trainee</title>
<link rel="stylesheet" href="style.css">
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous">
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>

	<form action="register" method="post">
		<div>
			<label>Trainee Id</label> <input type="number" name=traineeId>
		</div>
		<div>
			<label>Trainee Name</label> <input type="text" name=traineeName>
		</div>
		<div>
			<label>Date Joined</label> <input type="date" name=joinDate>
		</div>

		<button type="submit">Add Trainee</button>


	</form>



</body>
</html>