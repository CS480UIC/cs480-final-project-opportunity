<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Create Company</title>
    
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
  <h1>Create Company</h1>
<form action="<c:url value='/CompanyServletCreate'/>" method="post">
	Company ID:<input type="text" name="company_id" value="${form.company_id}"/>
	<span style="color: red; font-weight: 900">${errors.company_id }</span>
	<br/>
	Company Name：<input type="text" name="name" value="${form.name }"/>
	<span style="color: red; font-weight: 900">${errors.name }</span>
	<br/>
	Address：<input type="text" name="comp_address" value="${form.comp_address}"/>
	<span style="color: red; font-weight: 900">${errors.comp_address }</span>
	<br/>
	Industry：<input type="text" name="industry" value="${form.industry }"/>
	<span style="color: red; font-weight: 900">${errors.industry }</span>
	<br/>
	Company Review	：<input type="text" name="review" value="${form.review }"/>
	<span style="color: red; font-weight: 900">${errors.review }</span>
	<br/>
	<input type="submit" value="Create Company"/>
</form>
  </body>
</html>
