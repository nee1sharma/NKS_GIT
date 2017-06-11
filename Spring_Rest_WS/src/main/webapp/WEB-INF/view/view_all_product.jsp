<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link href="./../resources/css/product.css" rel="stylesheet" type="text/css">
<LINK href="./../resources/css/style.css">
<SCRIPT type="text/javascript" src="<c:url value='/resources/js/jquery-2.2.0.min.js' />"></SCRIPT>
<SCRIPT>
	$(document).ready(function() {
		$('.div-product-row').click(function() {
			$('.div-product_info-row').slideToggle('slow');
		});
	});
	
	
	function clickMe(prodDIV){
		var pid=prodDIV.id;
		//alert(pid);
		window.location.href="./product?id="+pid;
	} 
</SCRIPT>
<link href="./../resources/css/style.css" rel="stylesheet" type="text/css">
<LINK href="./../resources/css/bootstrap.min.css" rel="stylesheet" type="text/css">

<meta charset="ISO-8859-1">
<title>View All products</title>
</head>
<body>
<jsp:include page="./../../navigation.jsp"/>
    
  <DIV class="nks-main">
  <div class="container-fluid nks-container">
    <div class="product_list">
       <c:forEach items="${product_list_response.productList}" var="p">
    
        <DIV class="product_area"  id="${p.id }" onclick="clickMe(this)">
          <div class="product_name nks-blue"><SPAN>${p.name }</SPAN></div>
          <DIV class="description">
            <DIV class="production_description">Price : ${p.price }</DIV>
            <DIV class="production_description">Discount : ${p.discount }%</DIV>
            <DIV class="production_description">Type : ${p.info.type }</DIV>
            <DIV class="production_description">Quantity : ${p.quantity }</DIV>
          </DIV>      
          <DIV class="manufacturer nks-green"><SPAN>From : ${p.info.manufacturer}</SPAN> </DIV>
        </DIV>
       </c:forEach> 
    </div>
  </div>
 </DIV>
  
  
</body>
</html>