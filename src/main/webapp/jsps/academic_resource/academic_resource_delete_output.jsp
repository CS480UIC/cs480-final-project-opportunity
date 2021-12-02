<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Delete Academic Resource</title>
    
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
  <h1>Delete Academic Resource</h1>
<p style="color: red; font-weight: 900">${msg }</p>
<form action="<c:url value='/Academic_resourceServletDelete'/>" method="post">
	<input type="hidden" name="method" value="delete"/>
	<input type="hidden" name="legalId" value="${academic_resource.academic_id }"/>
	<input type="hidden" name="userId" value="${academic_resource.user_id }"/>
	Academic ID    :<input type="text" name="academicId" value="${academic_resource.academic_id }" disabled/>
	<br/>
	User ID    :<input type="text" name="userId" value="${academic_resource.user_id }" disabled/>
	<br/>
	Title   :<input type="text" name="title" value="${academic_resource.title }" disabled/>
	<br/>
	Payment Cost: <input type="text" name="paymentCost" value="${academic_resource.payment_cost }" disabled/>
	<br/>
	Academic Subject	:<input type="text" name="acdaSubject" value="${academic_resource.acad_subject }" disabled/>
	<br/>
	Academic Description	:<input type="text" name="academicDescription" value="${academic_resource.academic_description }" disabled/>
	<br/>
	Academic Location	:<input type="text" name="acadLocation" value="${academic_resource.acad_location }" disabled/>
	<br/>
	<input type="submit" value="Delete Entity1"/>
</form>

</body>
</html>
