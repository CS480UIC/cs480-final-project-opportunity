<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

</head>
<body>
	<h3 align="center"> Jobs </h3>
	<table border="1" width="70%" align="center">
	<tr>
		<th>position title</th>
		<th>job description</th>
		<th>salary</th>
	</tr>
<c:forEach items="${JobList}" var="job">
	<tr>
		<td>${job.position_title}</td>
		<td>${job.job_description}</td>
		<td>${job.salary}</td>
	</tr>
</c:forEach>
</table>
</body>
</html>
