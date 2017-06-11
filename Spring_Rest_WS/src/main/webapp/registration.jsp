<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet" type="text/css">
</head>
<header></header>
<body>
<div class="cdiv_container">
<form id="register" action="user/register" autocomplete="on" method="post">
	<h1> Sign up </h1>
	<p> 
        <label class="uname" for="usernamesignup" data-icon="u">Your username</label>
        <input name="userName" id="usernamesignup" required="required" type="text"  placeholder="mysuperusername690">
    </p>
	<p> 
        <label class="youmail" for="emailsignup" data-icon="e"> Your email</label>
        <input name="emailId" id="emailsignup" required="required" type="email" placeholder="mysupermail@mail.com"> 
    </p>

	<p class="signin button"> 
		<input type="submit" value="Sign up"> 
	</p>
</form>
</div>
<A href="login.jsp">Login</A>
</body>
<footer>
</footer>
</html>