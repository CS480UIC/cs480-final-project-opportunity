<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

</head>
<body>
	<h3 align="center"> Scholarships </h3>
	<table border="1" width="70%" align="center">
	<tr>
		<th>scholarship id</th>
		<th>user id</th>
		<th>award name</th>
		<th>description</th>
		<th>requirement</th>
		<th>reward amount</th>
		<th>deadline</th>
	</tr>
<c:forEach items="${ScholarshipList}" var="scholarship">
	<tr>
		<td>${scholarship.scholarship_id}</td>
		<td>${scholarship.user_id}</td>
		<td>${scholarship.award_name}</td>
		<td>${scholarship.description}</td>
		<td>${scholarship.requirement}</td>
		<td>${scholarship.reward_amount}</td>
		<td>${scholarship.deadline}</td>
	</tr>
</c:forEach>
</table>
</body>
</html>
