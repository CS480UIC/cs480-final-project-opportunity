<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

</head>
<body>
	<h3 align="center"> Number of Tutors </h3>
	<table border="1" width="70%" align="center">
	<tr>
		<th>subject</th>
		<th>total tutors</th>
	</tr>
<c:forEach items="${TutorList}" var="tutor">
	<tr>
		<td>${tutor.subject}</td>
		<td>${tutor.totalTutors}</td>
	</tr>
</c:forEach>
</table>
</body>
</html>
