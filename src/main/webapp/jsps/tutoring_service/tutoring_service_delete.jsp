<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Delete Tutoring Service</title>
    
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
  <h1>Delete Tutoring Service</h1>
<form action="<c:url value='/tutoring_serviceServletDelete'/>" method="post">
	<input type="hidden" name="method" value="search"/>
	Delete Service ID  :<input type="text" name="service_id" value="${form.serviceId }"/>
	<span style="color: red; font-weight: 900">${errors.serviceId }</span>
	<br/>
	Delete User ID  :<input type="text" name="user_id" value="${form.userId }"/>
	<span style="color: red; font-weight: 900">${errors.userId }</span>
	<br/>
	<input type="submit" value="Delete Tutoring Service"/>
</form>
  </body>
</html>
