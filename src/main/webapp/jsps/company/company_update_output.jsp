<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Update Company</title>
    
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
  <h1>Update Company</h1>
<p style="color: red; font-weight: 900">${msg }</p>
<form>
	Company ID:<input type="text" name="company_id" value="${company.company_id}" disabled/>
	<br/>
	Company Name：<input type="text" name="name" value="${company.name}" disabled/>
	<br/>
	Address：<input type="text" name=comp_address value="${company.comp_address}" disabled/>
	<br/>
	Industry：<input type="text" name="industry" value="${company.industry}" disabled/>
	<br/>
	Company Review	：<input type="text" name="review" value="${company.review}" disabled/>
	<br/>
</form>
<h1>Update the values below</h1>
<form action="<c:url value='/CompanyServletUpdate'/>" method="post">
	<input type="hidden" name="method" value="update"/> 
	<input type="hidden" name="company_id" value="${company.company_id}"/>
	
	Company Name：<input type="text" name="name" value="${form.name}" />
	<br/>
	Address：<input type="text" name=comp_address value="${form.comp_address}" />
	<br/>
	Industry：<input type="text" name="industry" value="${form.industry}" />
	<br/>
	Company Review	：<input type="text" name="review" value="${form.review}" />
	<br/>
	<br/>
	<input type="submit" value="Update Company"/>
</form>

</body>
</html>
