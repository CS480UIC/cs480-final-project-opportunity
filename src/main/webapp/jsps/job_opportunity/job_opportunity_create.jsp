<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Create Job Opportunity</title>
    
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
  <h1>Create Job Opportunity</h1>
<form action="<c:url value='/JobOpportunityServletCreate'/>" method="post">

	Job ID:<input type="text" name="jobID" value="${form.jobID}"/>
	<span style="color: red; font-weight: 900">${errors.jobID }</span>
	<br/>
	User ID:<input type="text" name="userID" value="${form.userID}"/>
	<span style="color: red; font-weight: 900">${errors.userID }</span>
	<br/>
	Company ID:<input type="text" name="companyID" value="${form.companyID}"/>
	<span style="color: red; font-weight: 900">${errors.companyID }</span>
	<br/>
	Position Title ：<input type="text" name="positionTitle" value="${form.positionTitle }"/>
	<span style="color: red; font-weight: 900">${errors.positionTitle }</span>
	<br/>
	Salary：<input type="text" name="salary" value="${form.salary}"/>
	<span style="color: red; font-weight: 900">${errors.salary }</span>
	<br/>
	Job Description：<input type="text" name="jobDescription" value="${form.jobDescription }"/>
	<span style="color: red; font-weight: 900">${errors.jobDescription }</span>
	<br/>
	Benefits Description ：<input type="text" name="benefitDescription" value="${form.benefitDescription }"/>
	<span style="color: red; font-weight: 900">${errors.benefitDescription }</span>
	<br/>
	Application Link ：<input type="text" name="applicationInfo" value="${form.applicationInfo }"/>
	<span style="color: red; font-weight: 900">${errors.applicationInfo }</span>
	<br/>
	<input type="submit" value="Create Job Opportunity"/>
</form>
  </body>
</html>
