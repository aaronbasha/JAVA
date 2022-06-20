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
<title>Edit My Task</title>
</head>
<body>
    <div class="container">
        <h1 style="color:green;">Edit Expense</h1>
        <u><a href="/">Go Back</a></u>
        <form:form method="POST" action="/edit/${expenseObj.id}" modelAttribute="expenseObj">
            <input type="hidden" name="_method" value="put">
            <p>
                Expense Name:
                <form:input type="text" path="name" />
            </p>
               <p style="color:red;"><form:errors path="name"/></p>
            <p></p>
            <p>
                Vendor:
                <form:input type="text" path="vendor" />
            </p>
            <p style="color:red;"><form:errors path="vendor"/></p>
            <p>
                Expense Description:
                <form:input type="text" path="description" />
            </p>
            <p style="color:red;"><form:errors path="description"/></p>
            <p>
                Amount Spent:
                <form:input type="amount" path="amount" />
            </p>
            <p style="color:red;"><form:errors path="amount"/> </p>
            <input type="submit" value="Submit"/>
        </form:form>
    </div>
</body>
</html>