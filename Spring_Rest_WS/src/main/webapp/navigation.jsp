<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
  pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet" type="text/css">
<LINK href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet" type="text/css">

<%
	String user_id = (String) session.getAttribute("session_userId");
	if (null == user_id) {
		user_id = "Anonymous";
	}
%>

<STYLE type="text/css">
.modle-container {
	width: 300px;
	height: 100px;
	border: 2px steelblue solid;
	margin-left: 400px;
	margin-top: 200px;
	/* padding: 10px; */
}

.main_modle .message {
	margin-top: 10px;
	margin-bottom: 10px;
}

.main_modle .message p {
	font-size: .8em;
	padding: 5px;
	padding-left: 10px;
}

.main_modle .title span {
	font-weight: 800;
	font-size: 1em;
}

.main_modle .title {
	border-bottom: 2px steelblue solid;
	padding: 2px;
	padding-left: 10px;
}

.buttons #Yes {
	margin: 10px;
	border: 1px;
}

.buttons #No {
	margin-left: 110px;
	border: 1px;
}
</STYLE>

<SCRIPT type="text/javascript">
	var a=${product_list_response.totalProducts};
	var previousPageNumber=0;
	var nextPageNumber=Math.ceil(a/4 )- previousPageNumber;

	alert("Next page :"+nextPageNumber);
	document.getElementById("previous").innerHTML = "NO..";

	function showNumber(){
		document.getElementById("previous").innerHTML ="Hello world";
		document.getElementById("next").innerHTML +=nextPageNumber;
	}
	
</SCRIPT>
</head>
<body onload="">


  <nav class="navbar navbar-inverse" id="top_nav">
    <div class="container-fluid">
      <div class="navbar-header">
        <a class="navbar-brand" href="#">WebSiteName</a>

      </div>
      <ul class="nav navbar-nav">
        <li class="active"><a href="homepage">Home</a></li>
        <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Page
            1 <span class="caret"></span>
        </a>
          <ul class="dropdown-menu">
            <li><a href="#">Page 1-1</a></li>
            <li><a href="#">Page 1-2</a></li>
            <li><a href="#">Page 1-3</a></li>
          </ul></li>
        <li><a href="#">Page 2</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li class="userclass"><A href="#">Welcome<SPAN
            style="font-weight: bold; font-size: 1.2em;"
          > <%=user_id%>!
          </SPAN></A>
        <li>
        <li><a href="#"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
        <li><a href="./user/logout"><span class="glyphicon glyphicon-log-in"></span>
            Logout</a></li>
      </ul>
    </div>
  </nav>



<!--   <DIV class="modle-container">
    <DIV class="main_modle">
      <DIV class="title">
        <SPAN>Message title</SPAN>
      </DIV>
      <DIV class="message">
        <P>Alert Message Goes Here..........</P>
      </DIV>
      <DIV class="buttons">
        <SPAN><BUTTON id="Yes">Yes</BUTTON>
          <BUTTON id="No">No</BUTTON></SPAN>
      </DIV>
    </DIV>
  </DIV> 


  <DIV id="sliding_drawer" style="width: 300px; height: 340px; border: 2px red solid; margin-left: 10px;">
    <DIV class="sliding_content" style="height: 300px; background-color: lime;" ></DIV>
    <DIV class="slinding_buttons" style="background-color:#2199E3;">
      <BUTTON id="previous" style="margin-left: 20px;">Previous </BUTTON>
      <BUTTON id="next" style="margin-left:60px; " onclick="showNumber()">Next </BUTTON> 
    </DIV>
  </DIV>-->

</body>
</html>