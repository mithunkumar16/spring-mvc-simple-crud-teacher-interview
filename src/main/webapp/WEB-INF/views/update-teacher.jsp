<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Teacher Update</title>
</head>
<body>
	<c:form action="updatesTeacher" modelAttribute="updateteacher">
		<c:label path="teacherId">Teacher Id </c:label>
		<c:input path="teacherId" placeholder="Enter techer id" />
		<br>
		<br>

		<c:label path="teacherName">Teacher Name</c:label>
		<c:input path="teacherName" placeholder="Enter techer name" />
		<br>
		<br>

		<c:label path="teacherEmail">Teacher Email</c:label>
		<c:input path="teacherEmail" placeholder="Enter techer email" />
		<br>
		<br>

		<c:button type="submit">Update</c:button>

		<button>
			<a href="back">Back</a>
		</button>
	</c:form>

</body>
</html>