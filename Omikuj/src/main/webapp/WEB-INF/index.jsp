<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
	<div style="text-align:center;">
	<h1>Send an Omikuji!</h1>
	<form method="POST" action="/submit" class="form-horizontal">
		<label>Pick a number from 5 to 25:</label>
		<div>
		<input type="number" name="number" value="0"/>
		</div>
		<label>Enter the name of any city:</label>
		<div>
		<input type="text" name="city"/>
		</div>
		<label>Enter the name of any real person:</label>
		<div>
		<input type="text" name="name"/>
		</div>
		<label>Enter professional endeavor or hobby:</label>
		<div>
		<input type="text" name="endeavor"/>
		</div>
		<label>Enter any type of living thing:</label>
		<div>
		<input type="text" name="livingthing"/>
		</div>
		<label>Say something nice to someone:</label>
		<div>
		<textarea name="somethingnice" rows="4" cols="50"></textarea>
		</div>
		<label>Send and show a friend</label>
		<div>
		<button>Send</button>
		</div>
	</form>
	</div>

</body>
</html>