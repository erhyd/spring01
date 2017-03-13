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
<!-- Code Assist -->
<c:if test="false">
	<link rel="stylesheet" href="../code_assist/animate.css">
	<link rel="stylesheet" href="../code_assist/bootstrap.css">
</c:if>
</head>
<body>
	<H1>City Detail Info</H1>
	
	<table class="table table-striped">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>District</th>
			<th>Population</th>
		</tr>
		<tr>
			<td>${city.id}</td>
			<td>${city.name}</td>
			<td>${city.district}</td>
			<td>${city.population}</td> 
		</tr>
	</table>
	<hr>
	<table class="table table-striped"> <h1>Country Info</h1>
		<tr>
			<th>Country code</th>
			<th>Name</th>
			<th>Continent</th>
			<th>Capital</th>
		</tr>
		<tr>
			 <td>${city.country.code}</td>
			 <td>${city.country.name}</td>
			 <td>${city.country.continent}</td>
			 <td>${city.country.headOfState}</td>
		</tr>
		
	</table>
	<hr>
	<a href="/city/page/${param.pageNo}">이전 Page List로....</a>
</body>
</html>