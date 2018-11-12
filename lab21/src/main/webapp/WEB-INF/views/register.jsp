<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Coffee Shop</title>
</head>
<body>
<h1>We made it to the Register page</h1>
<form action="formresults" onsubmit="return validateInfo();">
	First Name:<input id="firstname" type="text" name="firstname">
	Last Name:<input id="lastname" type="text" name="lastname">
	<br/>
	email:        <input id="email" name="email">
	<br>
	Phone number: <input id="phone" type="text" name="phone">
	<br>
	Password:      <input id="password" type="text" name="password">
	<input type="submit" value="Register">
	</form>
</body>
</html>