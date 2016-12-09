<%@page import="fr.tbr.iamcore.datamodel.Identity"%>
<%@page import="java.util.Collection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link xmlns="http://www.w3.org/1999/xhtml" rel="stylesheet"
	href="css/bootstrap.min.css" />
</head>

<body>
	<div class="container">
       <h2 class="text-info">Session has ended please login</h2>
       <a href="search.jsp">&lt;&lt; back</a>
    </div>
    <div class="container">
		<h1 class="text-info"> </h1>
    </div>
    
    <div class="container">
	    <form class="form-horizontal" role="form" method="POST" action="Logout">
				<button type="submit" class="btn btn-primary">Login</button>
		</form>
	</div>
</body>
</html>