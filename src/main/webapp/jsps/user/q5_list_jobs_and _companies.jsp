<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

</head>
<body>
	<h3 align="center"> Jobs and Companies </h3>
	<table border="1" width="70%" align="center">
	<tr>
		<th>position title</th>
		<th>job description</th>
		<th>salary</th>
		<th>name</th>
		<th>industry</th>
		<th>review</th>
	</tr>
<c:forEach items="${JobCoList}" var="jobCo">
	<tr>
		<td>${jobCo.position_title}</td>
		<td>${jobCo.job_description}</td>
		<td>${jobCo.salary}</td>
		<td>${jobCo.name}</td>
		<td>${jobCo.industry}</td>
		<td>${jobCo.review}</td>
	</tr>
</c:forEach>
</table>
</body>
</html>
