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
<p style="color: red; font-weight: 900">${msg }</p>
<form action="<c:url value='/tutoring_serviceServletDelete'/>" method="post">
	<input type="hidden" name="method" value="delete"/>
	<input type="hidden" name="serviceId" value="${tutoring_service.serviceId }"/>
	<input type="hidden" name="userId" value="${tutoring_service.userId }"/>
	Service ID    :<input type="text" name="serviceId" value="${tutoring_service.serviceId }" disabled/>
	<br/>
	User ID    :<input type="text" name="userId" value="${tutoring_service.userId }" disabled/>
	<br/>
	Service Name：<input type="text" name="serviceName" value="${tutoring_service.service_name }" disabled/>
	<br/>
	Address	：<input type="text" name="address" value="${tutoring_service.address }" disabled/>
	<br/>
	Total Tutors	：<input type="text" name="totalTutors" value="${tutoring_service.total_tutors }" disabled/>
	<br/>
	Operation Hours	：<input type="text" name="operationHours" value="${tutoring_service.operation_hours }" disabled/>
	<br/>
	Contact Info	：<input type="text" name="contactInfo" value="${tutoring_service.contact_info }" disabled/>
	<br/>
	<input type="submit" value="Delete Tutoring Service"/>
</form>

</body>
</html>
