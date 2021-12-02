<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="">
    
    <title>body</title>
    
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
    <h1>Queries</h1>
    <br>
    <a href="<c:url value='/findAll'/>" target="body">Please list all the user in the table</a>&nbsp;&nbsp;
    <br>
 	<a href="<c:url value='/findJobs'/>" target="body">Please list all the jobs with insurance benefits and salary larger than $70,000</a>&nbsp;&nbsp;
 	<br>
 	<a href="<c:url value='/findAll'/>" target="body">Please list all the scholarships with reward greater than $3,000 and have a deadline on 11/11/2021</a>&nbsp;&nbsp;
    <br>
 	<a href="<c:url value='/findTutor'/>" target="body">Please list all the tutors for grade levels higher than 9 and a fee less than $30</a>&nbsp;&nbsp;
 	<br>
 	<a href="<c:url value='/findJobsAndCo'/>" target="body">Please list all the jobs and companies</a>&nbsp;&nbsp;
 	<br>
 	<a href="<c:url value='/findTutorService'/>" target="body">Please list all the tutors and tutoring services</a>&nbsp;&nbsp;
 	<br>
 	<a href="<c:url value='/findAll'/>" target="body">Please list all the users and legal services</a>&nbsp;&nbsp;
 	<br>
 	<a href="<c:url value='/findAll'/>" target="body">Please list all the users linked to scholarships</a>&nbsp;&nbsp;
 	<br>
 	<a href="<c:url value='/findTotalTutors'/>" target="body">Please list the number of tutors per subject</a>&nbsp;&nbsp;
  </body>
</html>
