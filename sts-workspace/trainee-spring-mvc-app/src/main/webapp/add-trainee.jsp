<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Add Trainee</title>
</head>
<body>

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