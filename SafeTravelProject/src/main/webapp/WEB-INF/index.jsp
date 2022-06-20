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
<title>Read Share</title>
</head>
<body>
<h1 style="color:blue;">Save Travels</h1>
<table class="table table-striped table-bordered">
    <thead>
        <tr>
            <th>Expense</th>
            <th>Vendor</th>
            <th>Amount</th>
            <th>Actions</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach var="expense" items="${expenses}">
                <tr>
                <td><c:out value="${expense.name}"></c:out></td>
                <td><c:out value="${expense.vendor}"></c:out></td>
                <td><c:out value="${expense.amount}"></c:out></td>
                <td><a href="/edit/${expense.id}" style="color:blue;">Edit</a>
                        <form action="/delete/${expense.id}" method="POST">
                        <input type="hidden" name="_method" value="delete" />
                        <input type="submit" value="Delete"></td>
                        </form>
            </tr>
        </c:forEach>
    </tbody>
</table>
<br>
<div>
<h1 style="color:blue;">Add an Expense:</h1>
<form:form action="/expenses" method="post" modelAttribute="expense">
<div>
        <form:label path="name">Expense Name: </form:label><br />
        <form:errors path="name" class="text-danger"/>
        <form:input style="width:275px;" path="name"/>
    </div>

    <div>
        <form:label path="vendor">Vendor: </form:label><br />
        <form:errors path="vendor" class="text-danger"/>
        <form:input style="width:275px;" path="vendor"/>
    </div>

    <div>
        <form:label path="amount">Amount: </form:label><br />
        <form:errors path="amount" class="text-danger"/>
        <form:input style="width:275px;" type="double" path="amount"/>
    </div>

    <div>
        <form:label path="description">Description: </form:label><br />
        <form:errors path="description" class="text-danger"/>
        <form:textarea style="width:275px;" rows="4" path="description"/>
    </div>

    <div>
        <input type="submit" value="Submit"/>
    </div>



</form:form>
</div>
</body>
</html>