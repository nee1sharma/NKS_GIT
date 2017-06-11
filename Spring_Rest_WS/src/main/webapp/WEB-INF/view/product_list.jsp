<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<link href="../mystyle.css" type="text/css" rel="stylesheet">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product list</title>
</head>
<body>
	<form method="GET">
		<table border="2" align="center" width="700px">
			<tr id="tableMainRow">
				<th colspan="2">Products Catalog</th>
			</tr>
			<c:forEach items="${product_list.getProductList()}" var="list">
				<tr>
					<th>Product ID</th>
					<td>${list.id}</td>
				</tr>

				<tr>
					<th>Product Info</th>
					<td><c:out value="${list.info.manufacturer }" /> &nbsp;
						${list.name}</td>
				</tr>

			</c:forEach>

		</table>
	</form>
</body>
</html>