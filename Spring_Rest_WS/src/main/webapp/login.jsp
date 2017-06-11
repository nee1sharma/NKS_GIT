<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
  pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet"
  type="text/css">

</head>
<body>
  <div id="cdiv_container">
    <p>
      <LABEL id="login_error">${error} </LABEL>
    </p>
    <form id="login" name='loginForm' action="<c:url value='/user/homepage'/>"
      method="post">
      <h1>Login</h1>
      <p>
        <label for="userId" data-icon="u">Your user name</label> <input
          type="text" id="userId" name="userId" required="required" min="4"
          placeholder="youruserid" pattern="[A-Za-z0-9].{4,}"
          title="Special characters not allowed in user id." />
      </p>
      <p>
        <label for="pass" data-icon="p">Your password</label> <input
          type="password" id="pass" name="password" required="required"
          placeholder="Pa$$w0rd" pattern="[A-Za-z0-9].{8,}"
          title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters" />
      </p>
      <p class="signin button">
        <input type="submit" value="Login">
      </p>
    </form>
  </div>
  <jsp:include page="index.jsp"></jsp:include>
</body>
</html>