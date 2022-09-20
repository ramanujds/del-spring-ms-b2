<%@page import="com.del.tarineeapp.model.Trainee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Trainee Details</title>
<link rel="stylesheet" href="style.css">
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous">
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>

	<h2>Trainee Details</h2>

	<%
	List<Trainee> trainees = (List<Trainee>) request.getAttribute("trainees");
	%>
	<table class="table table-dark">
		<thead>
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Date Joined</th>
				<th colspan="2">Delete/Update</th>
			</tr>
		</thead>

		<tbody>
		<%
			for (Trainee t : trainees) {
				out.println("<tr>");
				out.println("<td>"+t.getTraineeId()+"</td>");
				out.println("<td>"+t.getTraineeName()+"</td>");
				out.println("<td>"+t.getJoinDate()+"</td>");
				out.println("<td><form onsubmit='return deleteTrainee()' action=delete method=get><input type=hidden name=traineeId value='"+t.getTraineeId()+
						"'><button class='btn btn-danger' type=submit>Delete</button></form></td>"); 
				
				
				out.println("<td><form action=update method=get><input type=hidden name=traineeId value='"+t.getTraineeId()+
								"'><button class='btn btn-primary' type=submit>Update</button></form></td>"); 
				
				out.println("</tr>");
			}
		%>
		</tbody>

	</table>

	

</body>
<script type="text/javascript">

function deleteTrainee() {
	
	return confirm("Sure to delete?");
}
</script>
</html>