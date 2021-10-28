<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Read Health Resources </title>
    
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
  <h1>Read Health Resources </h1>
<p style="color: red; font-weight: 900">${msg }</p>
<form action="<c:url value='/Entity1ServletRead'/>" method="post">
	<input type="hidden" name="method" value="regist"/>
	Health Resources ID:<input type="text" name="Id" value="${form.username}"/>
	<span style="color: red; font-weight: 900">${errors.username }</span>
	<br/>
	Health Resources Contact：<input type="text" name="contact" value="${form.password }"/>
	<span style="color: red; font-weight: 900">${errors.password }</span>
	<br/>
	Health Resources Type<input type="text" name="healthType" value="${form.email}"/>
	<span style="color: red; font-weight: 900">${errors.email }</span>
	<br/>
	Health Resources Location: <input type="text" name="location" value="${form.email }"/>
	<span style="color: red; font-weight: 900">${errors.email }</span>
	<br/>
	Health Resources Description	：<input type="text" name="serviceDescription" value="${form.email}"/>
	<span style="color: red; font-weight: 900">${errors.email}</span>
	<br/>
	Health Resources Payment	：<input type="text" name="serviceDescription" value="${form.email}"/>
	<span style="color: red; font-weight: 900">${errors.email}</span>
	<br/>
	<input type="submit" value="Read Health Resources"/>
</form>
  </body>
</html>
