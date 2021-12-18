<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Read Job Opportunity</title>
    
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
  <h1>Read Job Opportunity</h1>
<p style="color: red; font-weight: 900">${msg }</p>
<form action="<c:url value='/JobOpportunityServletRead'/>" method="post">
	<input type="hidden" name="method" value="regist"/>
	
	Job ID:<input type="text" name="jobID" value="${form.jobID}"/>
	<span style="color: red; font-weight: 900">${errors.jobID }</span>
	<br/>
	User ID:<input type="text" name="userID" value="${form.userID}"/>
	<span style="color: red; font-weight: 900">${errors.userID }</span>
	<br/>
	<input type="submit" value="Read Job Opportunity"/>
</form>
  </body>
</html>
