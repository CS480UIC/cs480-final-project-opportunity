<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

</head>
<body>
	<h3 align="center"> Academic and User Table </h3>
	<table border="1" width="70%" align="center">
	<tr>
		<th>academic_id</th>
		<th>user_id</th>
		<th>title</th>
		<th>payment_cost</th>
		<th>acad_subject</th>
		<th>academic_description</th>
		<th>acad_location</th>
	</tr>
<c:forEach items="${Academic_resourceList}" var="line">
	<tr>
		<td>${line.academic_id}</td>
		<td>${line.user_id}</td>
		<td>${line.title}</td>
		<td>${line.payment_cost}</td>
		<td>${line.acad_subject}</td>
		<td>${line.academic_description}</td>
		<td>${line.acad_location}</td>
	</tr>
</c:forEach>
</table>
</body>
</html>