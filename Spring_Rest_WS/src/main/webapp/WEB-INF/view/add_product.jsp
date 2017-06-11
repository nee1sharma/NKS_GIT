<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add product</title>
<link href="./../resources/css/product.css" rel="stylesheet">
</head>
<body>
<DIV class="addform product">
<DIV class="table_subject">Add product details</DIV>
  <FORM action="./verifyProduct" method="POST">
    <DIV class="add_product">
      <TABLE>
        <TBODY>
          <TR>
            <TD>Product ID</TD>
            <TD><INPUT type="text" name="id" maxlength="10"></TD>
          </TR>
          <TR>
            <TD>Product Name</TD>
            <TD><INPUT type="text" name="name" maxlength="50"></TD>
          </TR>
          <TR>
          <TR>
            <TD>Price</TD>
            <TD><INPUT type="number" name="price" min="1" max="99999"></TD>
          </TR>
          <TR>
            <TD>Quantity</TD>
            <TD><INPUT type="number" name="quantity" min="1" max="100"></TD>
          </TR>
          <TR>
            <TD>Discount</TD>
            <TD><INPUT type="number" name="discount" min="0" max="100"></TD>
          </TR>
          <TR>
            <TD>Batch Number</TD>
            <TD><INPUT type="text" name="info.batchNumber" maxlength="10"></TD>
          </TR>
          <TR>
            <TD>Manufacturer</TD>
            <TD><INPUT type="text" name="info.manufacturer" maxlength="50"></TD>
          </TR>
          <TR>
            <TD>Product Type</TD>
            <TD><INPUT type="text" name="info.type" maxlength="20"></TD>
          </TR>
          <TR>
            <TD>Net Content</TD>
            <TD><INPUT type="number" name="info.netContents" min="0" max="999"></TD>
          </TR>
          <TR>
            <TD>Description</TD>
            <TD><INPUT type="text" name="info.description" maxlength="50"></TD>
          </TR>
          <TR>
            <TD>Manufacturing Date</TD>
            <TD><INPUT type="date" name="info.mfgDate"></TD>
          </TR>
          <TR>
            <TD>Expiry Date</TD>
            <TD><INPUT type="date" name="info.expiryDate" ></TD>
          </TR>
        </TBODY>
        <TR>
        </TR>
      </TABLE>
    </DIV>
    <DIV class="buttons area"><INPUT class="button submit" type="submit" value="Confirm">
    <INPUT class="button back" type="button" value="Back" onclick="location.href='homepage'">
    </DIV>
  </FORM>
</DIV>
</body>
</html>