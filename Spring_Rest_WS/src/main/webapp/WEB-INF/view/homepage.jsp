<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
  pageEncoding="ISO-8859-1"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
  
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>

<%
	String user_id = (String) session.getAttribute("session_userId");
	if (null == user_id) {
		user_id = "Anonymous";
	}
%>
</head>
<BODY>
<jsp:include page="./../../navigation.jsp"></jsp:include>
   
  <BR>
  <DIV>
    <A href="./../rs/add_product">Add new product</A><BR> <A href="./../rs/products">View
      All Products</A><BR> <BR>
  </DIV>
  <DIV id="div_product_by_id">
    <FORM action="./../rs/product">
      <INPUT type="text" title="productId" name="id"><BR> <INPUT type="submit"
        value="View product">
    </FORM>
  </DIV>
</BODY>
</html>