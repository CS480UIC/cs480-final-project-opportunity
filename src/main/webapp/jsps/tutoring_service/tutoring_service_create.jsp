<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Create Tutoring Service</title>
    
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
  <h1>Create Tutoring Service</h1>
<form action="<c:url value='/tutoring_serviceServletCreate'/>" method="post">
	Service ID    :<input type="text" name="serviceId" value="${form.serviceId }"/>
	<span style="color: red; font-weight: 900">${errors.serviceId }</span>
	<br/>
	User ID    :<input type="text" name="userId" value="${form.userId }"/>
	<span style="color: red; font-weight: 900">${errors.userId }</span>
	<br/>
	Service Name：<input type="text" name="serviceName" value="${form.service_name }"/>
	<span style="color: red; font-weight: 900">${errors.service_name }</span>
	<br/>
	Address	：<input type="text" name="address" value="${form.address }"/>
	<span style="color: red; font-weight: 900">${errors.address }</span>
	<br/>
	Total Tutors	：<input type="text" name="totalTutors" value="${form.total_tutors }"/>
	<span style="color: red; font-weight: 900">${errors.total_tutors }</span>
	<br/>
	Operation Hours	：<input type="text" name="operationHours" value="${form.operation_hours }"/>
	<span style="color: red; font-weight: 900">${errors.operation_hours }</span>
	<br/>
	Contact Info	：<input type="text" name="contactInfo" value="${form.contact_info }"/>
	<span style="color: red; font-weight: 900">${errors.contact_info }</span>
	<br/>
	<input type="submit" value="Create Tutoring Service"/>
</form>
  </body>
</html>
