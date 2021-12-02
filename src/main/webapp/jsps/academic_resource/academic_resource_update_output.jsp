<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Delete Entity</title>
    
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
<h1>the values below</h1>
<form action="<c:url value='/Entity1ServletUpdate'/>" method="post">
		<input type="hidden" name="method" value="update"/>
		<input type="hidden" name="academicId" value="${academic_resource.academicId }"/>
		<input type="hidden" name="userId" value="${academic_resource.user_id }"/>
	Title：<input type="text" name="title" value="${form.title }"/>
	<span style="color: red; font-weight: 900">${errors.title }</span>
	<br/>
	Payment Cost ：<input type="text" name="paymentCost" value="${form.payment_cost }"/>
	<span style="color: red; font-weight: 900">${errors.payment_cost }</span>
	<br/>
	Academic Subject ：<input type="text" name="acdaSubject" value="${form.acad_subject }"/>
	<span style="color: red; font-weight: 900">${errors.acad_subject }</span>
	<br/>
	Academic Description	：<input type="text" name="academicDescription" value="${form.academic_description }"/>
	<span style="color: red; font-weight: 900">${errors.academic_description }</span>
	<br/>
	Academic Location	：<input type="text" name="acadLocation" value="${form.acda_location }"/>
	<span style="color: red; font-weight: 900">${errors.acda_location }</span>
	<br/>
	<input type="submit" value="Entity1"/>
</form>

</body>
</html>
