<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display</title>
<style>
table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
	font-weight: bold;
	text-align: center;
}
.button2 {border-radius: 4px;}

.button {
  background-color: #4CAF50; /* Green */
  border: none;
  color: white;
  padding: 10px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;
}
.button1 {
  background-color: red; /* Green */
  border: none;
  color: white;
  padding: 10px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;
}
</style>
</head>
<body>
	<table>
		<tr>
			<th>Teacher Id</th>
			<th>Teacher Timing</th>
			<th>Teacher Name</th>
			<th>Teacher Email</th>
			
		</tr>
		<c:forEach var="teacher" items="${teacherData}">
			<tr>
				<td>${teacher.getTeacherId()}</td>
				<td>${teacher.getBatchTime()}</td>
				<td>${teacher.getTeacherName()}</td>
				<td>${teacher.getTeacherEmail()}</td>
				<td><a href="deleteTeacher?teacherId=${teacher.getTeacherId()}"><button class="button1 button2">Delete</button></a></td>
				<td><a href="updateTeacher?teacherId=${teacher.getTeacherId()}"><button class="button button2">Update</button></a></td>
			</tr>
		</c:forEach>
	</table>
	<br><br>
	
	<a href="back">Back</a>
</body>
</html>