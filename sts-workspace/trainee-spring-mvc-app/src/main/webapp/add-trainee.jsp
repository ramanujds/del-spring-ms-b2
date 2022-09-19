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

	<form action="register" method="post" class="from-group">
	<div class="row">
		<div class="col-lg-2">
			<label>Trainee Id</label>
			</div>
			<div class="col-lg-10"> <input type="number" name=traineeId class="form-control">
		</div>
		</div>
		<div class="row">
		<div class="col-lg-2">
			<label>Trainee Name</label> 
			</div>
			<div class="col-lg-10">
			<input type="text" name=traineeName class="form-control">
		</div>
		</div>
		<div class="row">
		<div class="col-lg-2">
			<label>Date Joined</label></div>
			<div class="col-lg-10">
			 <input type="date" name=joinDate class="form-control">
			 
		</div>
		</div>

		<button class="btn btn-primary" type="submit">Add Trainee</button>


	</form>



</body>
</html>