<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Film Details</title>
</head>
<body>

	<h2>Film Details stub</h2>
	<h3>${film.title }</h3>
	<table>
		<tr>
			<td>${film.releaseYear }</td>
		</tr>
		<tr>
			<td>${film.rating }</td>
		</tr>
		<tr>
			<td>${film.description }</td>
		</tr>
	</table>
	
	<h3><a href="index.html">Send me to the main menu!</a></h3>

	

</body>
</html>