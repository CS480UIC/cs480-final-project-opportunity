<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Read Tutor Output</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<meta http-equiv="content-type" content="text/html;charset=utf-8">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <h1>Read Tutor Output</h1>
<p style="color: red; font-weight: 900">${msg }</p>
<form>
	Tutor ID    :<input type="text" name="tutorId" value="${tutor.tutor_id }" disabled/>
	<br/>
	Full Name：<input type="text" name="fullName" value="${tutor.full_name }" disabled/>
	<br/>
	Grade Level	：<input type="text" name="gradelevel" value="${tutor.grade_level }" disabled/>
	<br/>
	Subject	：<input type="text" name="subject" value="${tutor.subject }" disabled/>
	<br/>
	Fee	：<input type="text" name="fee" value="${tutor.fee }" disabled/>
	<br/>
	Service ID	：<input type="text" name="serviceId" value="${tutor.service_id }" disabled/>
	<br/>
	Phone Number	：<input type="text" name="phoneNumber" value="${tutor.phone_number }" disabled/>
	<br/>
	Tutor Hours	：<input type="text" name="tutorHours" value="${tutor.tutor_hours }" disabled/>
	<br/>
</form>

<button onclick="window.location.href='<c:url value='/jsps/main.jsp'/>'">Continue</button>
</body>
</html>
