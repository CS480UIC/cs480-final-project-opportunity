<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Delete Company</title>
    
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
  <h1>Delete Company</h1>
<p style="color: red; font-weight: 900">${msg }</p>
<form action="<c:url value='/JobOpportunityServletDelete'/>" method="post">
	<input type="hidden" name="method" value="delete"/>
	<input type="hidden" name="jobID" value="${job.jobID}" />
	<input type="hidden" name="userID" value="${job.userID}" />
	
	Company ID:<input type="text" name="companyID" value="${job.companyID}" disabled/>
	<br/>
	Position Title ：<input type="text" name="positionTitle" value="${job.positionTitle }" disabled/>
	<br/>
	Salary：<input type="text" name="salary" value="${job.salary}" disabled/>
	<br/>
	Job Description：<input type="text" name="jobDescription" value="${job.jobDescription }" disabled/>
	<br/>
	Benefits Description ：<input type="text" name="benefitDescription" value="${job.benefitDescription }" disabled/>
	<br/>
	Application Link ：<input type="text" name="applicationInfo" value="${job.applicationInfo }" disabled/>
	<br/>
	
	<input type="submit" value="Delete Company"/>
</form>

</body>
</html>
