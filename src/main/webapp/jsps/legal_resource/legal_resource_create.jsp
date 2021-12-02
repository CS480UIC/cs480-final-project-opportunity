<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Create Legal Resource</title>
    
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
  <h1>Create Legal Resource</h1>
<form action="<c:url value='Legal_resourceServletCreate'/>" method="post">
	Legal ID :<input type="text" name="legalId" value="${form.legal_id }"/>
	<span style="color: red; font-weight: 900">${errors.legal_id }</span>
	<br/>
	Cost：<input type="text" name="cost" value="${form.cost }"/>
	<span style="color: red; font-weight: 900">${errors.cost }</span>
	<br/>
	Legal Description ：<input type="text" name="legalDescription" value="${form.legal_description }"/>
	<span style="color: red; font-weight: 900">${errors.legal_description }</span>
	<br/>
	Resource Location ：<input type="text" name="resourceLocation" value="${form.resource_location }"/>
	<span style="color: red; font-weight: 900">${errors.resource_location }</span>
	<br/>
	Resource Name	：<input type="text" name="resourceName" value="${form.resource_name }"/>
	<span style="color: red; font-weight: 900">${errors.resource_name }</span>
	<br/>
	Contact Information	：<input type="text" name="contactInformation" value="${form.contact_information }"/>
	<span style="color: red; font-weight: 900">${errors.contact_information }</span>
	<br/>
	<input type="submit" value="Create Academic Resource"/>
</form>
  </body>
</html>
