<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<h1>Mobile Store</h1>
	<form action="/login" method="post">
		<h2>Please sign in</h2>
		<input type="text" name="username" required="required"
			placeholder="UserName"><br /> <input type="password"
			name="password" required="required" placeholder="Password"><br />
		<button type="submit">Login</button>
	</form>
</body>
</html>