<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add product</title>
<link href="./../resources/css/product.css" rel="stylesheet">
</head>
<body>
<DIV class="verify product">
<DIV class="table_subject">Verify product details</DIV>

  <FORM action="./product" method="POST">
    <DIV class="verify_product">
      <TABLE>
        <TBODY>
          <TR>
            <TD>Product ID</TD>
            <TD><INPUT type="text" name="id" maxlength="10" value="${product.id }"></TD>
          </TR>
          <TR>
            <TD>Product Name</TD>
            <TD><INPUT type="text" name="name" maxlength="50" value="${product.name }"></TD>
          </TR>
          <TR>
          <TR>
            <TD>Price</TD>
            <TD><INPUT type="number" name="price" min="1" max="99999" value="${product.price }"></TD>
          </TR>
          <TR>
            <TD>Quantity</TD>
            <TD><INPUT type="number" name="quantity" min="1" max="100" value="${product.quantity }"></TD>
          </TR>
          <TR>
            <TD>Discount</TD>
            <TD><INPUT type="number" name="discount" min="0" max="100" value="${product.discount }"></TD>
          </TR>
          <TR>
            <TD>Batch Number</TD>
            <TD><INPUT type="text" name="info.batchNumber" maxlength="10" value="${product.info.batchNumber }"></TD>
          </TR>
          <TR>
            <TD>Manufacturer</TD>
            <TD><INPUT type="text" name="info.manufacturer" maxlength="50" value="${product.info.manufacturer }"></TD>
          </TR>
          <TR>
            <TD>Product Type</TD>
            <TD><INPUT type="text" name="info.type" maxlength="20" value="${product.info.type }"></TD>
          </TR>
          <TR>
            <TD>Net Content</TD>
            <TD><INPUT type="number" name="info.netContents" min="0" max="999" value="${product.info.netContents }"></TD>
          </TR>
          <TR>
            <TD>Description</TD>
            <TD><INPUT type="text" name="info.description" maxlength="50" value="${product.info.description }"></TD>
          </TR>
          <TR>
            <TD>Manufacturing Date</TD>
            <TD><INPUT type="date" name="info.mfgDate" value="${product.info.mfgDate }"></TD>
          </TR>
          <TR>
            <TD>Expiry Date</TD>
            <TD><INPUT type="date" name="info.expiryDate" value="${product.info.expiryDate }"></TD>
          </TR>
        </TBODY>
      </TABLE>
    </DIV>
    <DIV class="buttons area"><INPUT class="button submit" type="submit" value="Add product">
    <INPUT class="button back" type="button" value="Back">
    </DIV>
  </FORM>
</DIV>
</body>
</html>