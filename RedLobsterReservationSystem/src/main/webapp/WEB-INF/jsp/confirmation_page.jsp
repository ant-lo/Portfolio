<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Confirmed Guests</title>
</head>
<body>
	<h1 align="center">My Guest List</h1>
	<br />
	<table border="1" cellpadding="10">
		<tr>
			<th>Guest ID</th>
			<th>Name</th>
			<th>Guest Count</th>
			<th>Number</th>
			<th>Actions</th>
		</tr>
		<c:forEach var="people" items="${guests}">
			<tr>
				<td>${people.id}</td>
				<td>${people.name}</td>
				<td>${people.guestCount}</td>
				<td>${people.number}</td>
				<td><a href="/edit/ + ${people.id}">Edit</a> <a
					href="/delete/ + ${people.id}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
	<br>
	<br>
</body>

<p style="text-align: center;">
	<img
		src="https://upload.wikimedia.org/wikipedia/en/b/b1/Redlobster_logocopia.png"
		alt="Red Lobster">
</html>