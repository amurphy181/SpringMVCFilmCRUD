<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Edit Film</title>
</head>
<body>

<h2>Edit Film</h2>
<h2>
	<h3>${film.id }</h3>
	<table>
		<tr> 
			<form:label path="title">Title:</form:label>
			<form:input path="title"><td>${film.title }</td></form:input>
		</tr>
		<tr>
			<form:label path="releaseYear">Release Year:</form:label>
			<form:input path="releaseYear"><td>${film.releaseYear }</td></form:input>
		</tr>
		<tr>
			
			<form:label path="rating">Rating:</form:label>
			<form:input path="rating"><td>${film.rating }</td></form:input>
		</tr>
		<tr>
			<form:label path="description">Description:</form:label>
			<form:input path="description"><td>${film.description }</td></form:input>
		</tr>
	</table>

</body>
</html>