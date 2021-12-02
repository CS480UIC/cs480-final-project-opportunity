<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Delete Legal Resource</title>
    
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
  <h1>Delete Legal Resource</h1>
<p style="color: red; font-weight: 900">${msg }</p>
<form action="<c:url value='/Legal_resourceServletDelete'/>" method="post">
	<input type="hidden" name="method" value="delete"/>
	<input type="hidden" name="legalId" value="${legal_resource.legal_id }"/>
	<input type="hidden" name="userId" value="${legal_resource.user_id }"/>
	Legal ID    :<input type="text" name="legalId" value="${legal_resource.legal_id }" disabled/>
	<br/>
	User ID    :<input type="text" name="userId" value="${legal_resource.user_id }" disabled/>
	<br/>
	Cost：<input type="text" name="serviceName" value="${legal_resource.cost }" disabled/>
	<br/>
	Legal Description	：<input type="text" name="legalDescription" value="${legal_resource.legal_description }" disabled/>
	<br/>
	Resource Location	：<input type="text" name="resourceLocation" value="${legal_resource.resource_location }" disabled/>
	<br/>
	Resource Name	：<input type="text" name="resourceName" value="${legal_resource.resource_name }" disabled/>
	<br/>
	Contact Information	：<input type="text" name="contactInformation" value="${legal_resource.contact_information }" disabled/>
	<br/>
	<input type="submit" value="Delete Legal Resource"/>
</form>

</body>
</html>
