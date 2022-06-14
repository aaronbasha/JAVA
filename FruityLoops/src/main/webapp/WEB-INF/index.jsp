<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Fruit Loops</title>
</head>
<body>
	<div class="container">
		<div class="main">
			<h1>Fruit Store</h1>
			<table class="table table-striped" style="width: 50%; margin:auto;">
			<tr>
			<th>Name</th>
			<th>Price</th>
			</tr>	
			<c:forEach var="fruit" items="${fruits}">
			<tr>	
		    	<td><c:out value="${fruit.name}"/></td>
		    	<td><c:out value="${fruit.price}"/></td>
			</tr>
			</c:forEach>
			</table>
		</div>
	</div>
</body>
</html>