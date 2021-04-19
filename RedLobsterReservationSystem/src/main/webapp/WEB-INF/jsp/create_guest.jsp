<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Guest</title>
</head>
<body>
	<h1 align="center">My Guest List</h1>
	<br />

	<form:form action="confirmation_page" method="POST"
		modelAttribute="guests">  
         
        Name: <form:input path="name" />
		<br>
		<br>  
        Guest Count: <form:input path="guestCount" />
		<br>
		<br>  
        Number: <form:input path="number" />
		<br>
		<br>
		<input type="submit" value="Submit" />
		<br>
		<br>
	</form:form>
</body>
<p style="text-align: center;">
	<img
		src="https://upload.wikimedia.org/wikipedia/en/b/b1/Redlobster_logocopia.png"
		alt="Red Lobster">
</html>