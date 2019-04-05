<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<title>CREATE POLICY</title>
</head>
<body>
        <nav class="navbar navbar-dark bg-dark">
                <span class="navbar-brand mb-0 h1">Policy Management System</span>
        </nav>

        <br>
        <br>
        
    
        <br>
        <br>
        <div class="container">
                <div class="row"></div>
                        <div class="col"></div>
                                                                 
                                        <form action="addPolicy.html"  method="POST"  >
                                        
                                        <div class="form-group ">
                                            <label for="uname">Policy ID:</label><br>
                                            <input type="text" class="col-sm-10"   name="policyId" required>
                                            </div>
                                            
                                            <div class="form-group ">
                                            <label for="uname">Policy Name:</label><br>
                                            <input type="text" class="col-sm-10"   name="policyName" required>
                                              </div>
                                              
                                              
                                            <div class="form-group">
                                                    <label for="uname">Policy Type:</label><br>
                                                    <input type="text" class="col-sm-10"   name="policyType" required>
                                            </div>


                                            <div class="form-group">
                                                    <label for="uname">Duration In Months:</label><br>
                                                    <input type="text" class="col-sm-10"  name="duration" required>
                                            </div>
                                            <div class="form-group">
                                                    <label for="uname">Company:</label><br>
                                                    <input type="text" class="col-sm-10"  name="company" required>
                                            </div>
                                            <div class="form-group">
                                                    <label for="uname">Initial Deposit:</label><br>
                                                    <input type="text" class="col-sm-10"  name="initialDeposit" required>
                                            </div>
                                           
                                            <div class="form-group">
                                                    <label for="uname">Term Amount:</label><br>
                                                    <input type="text" class="col-sm-10"   name="termAmount" required>
                                            </div>
                                            <div class="form-group">
                                                    <label for="uname">Interest:</label><br>
                                                    <input type="text" class="col-sm-10"  name="interest" required>
                                            </div>
                                                                                                                        
                                            
                                            <button type="submit" class="btn btn-primary">Submit</button>
                                    </form>
                        
                                </div>
                   
    </div>
  </div>
</body>
</html>