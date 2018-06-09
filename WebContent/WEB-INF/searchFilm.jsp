<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Search Film</title>
</head>
<body>

	<h2>Search Film stub</h2>
	<form:form action="searchFilm.do" method="POST" modelAttribute="film">
		<form:label path="filmId">Film ID:</form:label>
		<form:input path="filmId" />

		<input type="submit" value="filmID" />
	</form:form>
</body>
</html>