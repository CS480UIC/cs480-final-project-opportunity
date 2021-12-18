<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

</head>
<body>
	<h3 align="center"> Tutors </h3>
	<table border="1" width="70%" align="center">
	<tr>
		<th>tutor id</th>
		<th>full name</th>
		<th>grade level</th>
		<th>subject</th>
		<th>fee</th>
		<th>service id</th>
		<th>phone number</th>
		<th>tutor hours</th>
	</tr>
<c:forEach items="${TutorList}" var="tutor">
	<tr>
		<td>${tutor.tutor_id}</td>
		<td>${tutor.full_name}</td>
		<td>${tutor.grade_level}</td>
		<td>${tutor.subject}</td>
		<td>${tutor.fee}</td>
		<td>${tutor.service_id}</td>
		<td>${tutor.phone_number}</td>
		<td>${tutor.tutor_hours}</td>
	</tr>
</c:forEach>
</table>
</body>
</html>
