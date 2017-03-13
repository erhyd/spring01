<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8">
<title>item.jsp</title>
<!-- code_assist -->
<c:if test="false">
	<link rel="stylesheet" href="../code_assist/animate.css">
	<link rel="stylesheet" href="../code_assist/bootstrap.css">
</c:if>
</head>
<body>
${error}<br>
<h1 class="animated bounceInLeft">${country.code}&nbsp;${country.name}</h1>
<table class="table table-striped">
<tr>
	<th>City id</th>
	<th>Name</th>
	<th>Population</th>
</tr>
<c:forEach var="city" items="${country.citys}">
<tr>
	<td>${city.id}</td>
	<td>${city.name}</td>
	<td>${city.population}</td>
</tr>
</c:forEach>
</table>

<hr>
${country}
</body>
</html>