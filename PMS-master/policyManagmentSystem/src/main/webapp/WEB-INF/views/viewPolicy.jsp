<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
     <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<title>View Policy</title>
</head>
<body>
       <body>
        <nav class="navbar navbar-dark bg-dark">
                <span class="navbar-brand mb-0 h1">Policy Management System</span>
                <ul class="nav navbar-nav">
                        <li class="active"><a href="adminHome.html">Home</a></li>
                        <li class="active"><a href="logout.html">Logout</a></li>
                       
                </ul>
                
        </nav>
        <br>
        <br>
       <h4>Policy Details</h4>
      Policy Name : ${policy.policyName}
      <br>
      Policy Id : ${policy.policyId}
      <br>
      Policy Type : ${policy.policyType}
     <br>
      Policy Duration : ${policy.duration}
      <br>
      Company : ${policy.company}
	 <br>
      Policy Initial Deposit : ${policy.initialDeposit}
      <br>
      User Type : ${policy.userType}
      <br>
      Policy Term Amount : ${policy.termAmount}
      <br>
      Interest Rate : ${policy.interest}
	
</body>



</html>