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
<form action="<c:url value='/Entity1ServletDelete'/>" method="post">
	<input type="hidden" name="method" value="delete"/>
		<input type="hidden" name="username" value="${entity1.username }"/>
	Company ID:<input type="text" name="companyId" value="${form.username}" disabled/>
	<br/>
	Company Name：<input type="text" name="companyName" value="${form.password}" disabled/>
	<br/>
	Address：<input type="text" name="address" value="${form.email}" disabled/>
	<br/>
	Industry：<input type="text" name="industry" value="${form.email }" disabled/>
	<br/>
	Company Review	：<input type="text" name="review" value="${form.email }" disabled/>
	<br/>
	<input type="submit" value="Delete Company"/>
</form>

</body>
</html>
