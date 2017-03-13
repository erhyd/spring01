<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8">
<title>page.jsp</title>
<!-- Code Assist -->
<c:if test="false">
	<link rel="stylesheet" href="../code_assist/animate.css">
	<link rel="stylesheet" href="../code_assist/bootstrap.css">
</c:if>

</head>
<body>
	<h1 class="animated bounceInRight">City Page pageNO=${page.paging.pageNo}</h1>
	<table class="table table-striped">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Population</th>
			<th>Country code</th>
		</tr>
		<c:forEach var="city" items="${page.citys}">
		<tr>
			<td>${city.id}</td>
			<td><a href="/city/item/${city.id}?pageNo=${page.paging.pageNo}">${city.name}</a></td>
			<td>${city.population}</td>
			<td>${city.countryCode}</td>
		</tr>
		</c:forEach>
	</table>
	
	<center>
	<a href="/city/page/1">First</a>
	<a href="/city/page/${page.paging.firstPage - 1}">Prev</a>
	<c:forEach var="i" begin="${page.paging.firstPage}" end="${page.paging.lastPage}">
		<a href="/city/page/${i}">${i}</a>
	</c:forEach>
	<a href="/city/page/${page.paging.lastPage + 1}">Next</a>
	<a href="/city/page/${page.paging.totalPage}">Last</a>
	</center>
</body>
</html>