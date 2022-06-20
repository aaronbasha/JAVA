<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<title><c:out value="${expense.expense}"/>Show Expense</title>
</head>
<body>
    <div class="container">
        <h1>Expense Details</h1>
        <a href="/">Go Back</a>
        <h2>Expense Name: <c:out value="${expense.expense}"/></h2>
        <h3>Expense Description: <c:out value="${expense.description}"/></h3>
        <h3>Vendor: <c:out value="${expense.vendor}"/></h3>
        <h3>Amount Spent: $<c:out value="${expense.amount}"/></h3>
    </div>
</body>
</html>