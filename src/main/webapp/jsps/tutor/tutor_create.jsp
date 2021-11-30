<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Create Tutor</title>
    
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
  <h1>Create Tutor</h1>
<form action="<c:url value='/TutorServletCreate'/>" method="post">
	Tutor ID    :<input type="text" name="tutorId" value="${form.tutor_id }"/>
	<span style="color: red; font-weight: 900">${errors.tutor_id }</span>
	<br/>
	Full Name：<input type="text" name="fullname" value="${form.full_name }"/>
	<span style="color: red; font-weight: 900">${errors.full_name }</span>
	<br/>
	Grade Level	：<input type="text" name="gradeLevel" value="${form.grade_level }"/>
	<span style="color: red; font-weight: 900">${errors.grade_level }</span>
	<br/>
	Subject	：<input type="text" name="subject" value="${form.subject }"/>
	<span style="color: red; font-weight: 900">${errors.subject }</span>
	<br/>
	Fee	：<input type="text" name="fee" value="${form.fee }"/>
	<span style="color: red; font-weight: 900">${errors.fee }</span>
	<br/>
	Service ID	：<input type="text" name="serviceId" value="${form.service_id }"/>
	<span style="color: red; font-weight: 900">${errors.service_id }</span>
	<br/>
	Phone Number	：<input type="text" name="phoneNumber" value="${form.phone_number }"/>
	<span style="color: red; font-weight: 900">${errors.phone_number }</span>
	<br/>
	Tutor Hours	：<input type="text" name="tutorHours" value="${form.tutor_hours }"/>
	<span style="color: red; font-weight: 900">${errors.tutor_hours }</span>
	<br/>
	<input type="submit" value="Create Tutor"/>
</form>
  </body>
</html>
