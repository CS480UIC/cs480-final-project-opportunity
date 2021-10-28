<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Update Job Opportunity</title>
    
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
  <h1>Update Job Opportunity</h1>
<form action="<c:url value='/Entity1ServletUpdate'/>" method="post">
	<input type="hidden" name="method" value="search"/>
	Update Job ID:<input type="text" name="jobId" value="${form.username}"/>
	<span style="color: red; font-weight: 900">${errors.username }</span>
	<br/>
	Update Company Name:<input type="text" name="companyName" value="${form.username}"/>
	<span style="color: red; font-weight: 900">${errors.username }</span>
	<br/>
	Update Position Title ：<input type="text" name="positionTitle" value="${form.password }"/>
	<span style="color: red; font-weight: 900">${errors.password }</span>
	<br/>
	Update Salary：<input type="text" name="salary" value="${form.email}"/>
	<span style="color: red; font-weight: 900">${errors.email }</span>
	<br/>
	Update Job Description：<input type="text" name="jobDescription" value="${form.email }"/>
	<span style="color: red; font-weight: 900">${errors.email }</span>
	<br/>
	Update Benefits Description ：<input type="text" name="benefits" value="${form.email }"/>
	<span style="color: red; font-weight: 900">${errors.email }</span>
	<br/>
	Update Application Link ：<input type="text" name="application" value="${form.email }"/>
	<span style="color: red; font-weight: 900">${errors.email }</span>
	<br/>
	<input type="submit" value="Update Job Opportunity"/>
</form>
  </body>
</html>