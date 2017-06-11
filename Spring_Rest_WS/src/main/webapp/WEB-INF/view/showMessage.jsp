<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta charset="utf-8">
<title>Product confirmation</title>
<%-- <link href="<c:url value='./../resources/css/product.css' />" rel="stylesheet"> --%>
<link href="<c:url value='./../resources/css/boostrap.css' />" rel="stylesheet">
</head>
<body>
  <DIV>
    <c:import url="./../../navigation.jsp"></c:import>
  </DIV>
  <DIV>
    <DIV class="error message">
      <h2>${error_message}</h2>
    </DIV>
    <DIV class="success message">
      <h2>${success_message}</h2>
    </DIV>
    <DIV class="success options">
      <A href="add_product">Add more Products</A><A href="homepage">I am done with adding Products</A>
    </DIV>
  </DIV>
</body>
</html>
