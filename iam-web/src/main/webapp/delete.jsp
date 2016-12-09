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
       <h2 class="text-info">Identity Deletion</h2>
       <a href="search.jsp">&lt;&lt; back</a>
    </div>
    <form class="form-horizontal" role="form" method="POST" action="Delete">
    	<div class="form-group">
            <label for="Id" class="col-sm-2 control-label">ID</label>

            <div class="col-sm-10">
                <input name="Id" type="text" class="form-control" id="Id" placeholder="Id"/>
            </div>
        </div>
        <div class="form-group">
            <label for="firstNameModif" class="col-sm-2 control-label">First Name</label>

            <div class="col-sm-10">
                <input name="firstNameModif" type="text" class="form-control" id="firstNameModif" placeholder="First Name"/>
            </div>
        </div>
        <!--  
        <div class="form-group">
            <label for="lastNameModif" class="col-sm-2 control-label">Last Name</label>

            <div class="col-sm-10">
                <input name="lastNameModif" type="text" class="form-control" id="lastNameModif" placeholder="Last Name"/>
            </div>
        </div>
        -->
        
        <div class="form-group">
            <label for="emailModif" class="col-sm-2 control-label">Email</label>

            <div class="col-sm-10">
                <!-- <input name="emailModif" disabled="disabled" type="email" class="form-control" id="emailModif" placeholder="Email">--> 
                <input name="emailModif" type="email" class="form-control" id="emailModif" placeholder="Email">
            </div>
        </div>
        

		<!--
        <div class="form-group">
            <label for="dateModif" class="col-sm-2 control-label">Birth Date</label>

            <div class="col-sm-10">
                <input name="dateModif" type="date" class="form-control" id="dateModif" placeholder="Birth Date"/>
            </div>
        </div>
        -->
        
        <div class="form-group">
            <label for="uidModif" class="col-sm-2 control-label">UID</label>

            <div class="col-sm-10">
                <input name="uidModif" type="text" class="form-control" id="uidModif" placeholder="UID"/>
            </div>
        </div>
        
        <div class="form-group">
            <label class="col-sm-2 control-label">...</label>
        </div>


        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn btn-default">Submit</button>
            </div>
        </div>
    </form>		
</body>
</html>