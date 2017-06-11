<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta charset="utf-8">
<title>Welcome</title>
</head>
<body>
  <DIV class="head_lines">${head_lines }</DIV>
  <%--   <c:url value="/showMessage.html" var="messageUrl" />
  <a href="${messageUrl}">Click to enter</a> --%>
  <DIV class="">
    <a href="login.jsp">Login</a><BR /> <A href="registration.jsp">Register</A><BR /> <A
      href="add_product.jsp">Add new product</A><BR /> <A href="rs/products">View All Products</A><BR />
  </DIV>
</body>
</html>
