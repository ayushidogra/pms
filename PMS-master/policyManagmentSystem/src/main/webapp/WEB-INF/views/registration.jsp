<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<title>Register</title>
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
                                        <div class="row">
                                            <div class="col">

                                            </div>
                                            <div class="col">
                                                    <h4>Register</h4>
                                            </div>
                                            <div class="col">

                                            </div>
                                        </div>
                               
                                        <form action="registration.html"  method="POST"  >
                                        
                                        <div class="form-group ">
                                            <label for="uname">User ID:</label><br>
                                            <input type="text" class="col-sm-10"   name="userId" required>
                                            </div>
                                            
                                            <div class="form-group ">
                                            <label for="uname">First Name:</label><br>
                                            <input type="text" class="col-sm-10"   name="firstName" required>
                                              </div>
                                              
                                              
                                            <div class="form-group">
                                                    <label for="uname">Last Name:</label><br>
                                                    <input type="text" class="col-sm-10"   name="lastName" required>
                                            </div>
                                            <div class="form-group">
                                                    <label for="uname">DOB (dd/MM/yyyy) :</label><br>
                                                    <input type="text" class="col-sm-10"   name="DOB" required>
                                            </div>

                                            <select name="gender">
                                                    <option value="Male">Male</option>
                                                    <option value="Female">Female</option>
                                                    
                                            </select>

                                            <div class="form-group">
                                                    <label for="uname">Contact No:</label><br>
                                                    <input type="number" class="col-sm-10"  name="contactNo" required>
                                            </div>
                                            <div class="form-group">
                                                    <label for="uname">Address:</label><br>
                                                    <input type="text" class="col-sm-10"  name="address" required>
                                            </div>
                                            <div class="form-group">
                                                    <label for="uname">Email Id:</label><br>
                                                    <input type="text" class="col-sm-10"  name="email" required>
                                            </div>
                                            <div class="form-group">
                                                    <label for="uname">Qualification:</label><br>
                                                    <input type="text" class="col-sm-10"   name="qualification" required>
                                            </div>
                                            <div class="form-group">
                                                    <label for="uname">Salary Per Month:</label><br>
                                                    <input type="number" class="col-sm-10"   name="salary" required>
                                            </div>
                                            <div class="form-group">
                                                    <label for="uname">PAN No:</label><br>
                                                    <input type="text" class="col-sm-10"  name="PAN" required>
                                            </div>
                                            <div class="form-group">
                                                    <label for="uname">Employer Type:</label><br>
                                                    <input type="text" class="col-sm-10"   name="employerType" required>
                                            </div>
                                            <div class="form-group">
                                                    <label for="uname">Employer:</label><br>
                                                    <input type="text" class="col-sm-10"   name="employer" required>
                                            </div>
                                            <div class="form-group">
                                                    <label for="uname">Hint Question:</label><br>
                                                    <input type="text" class="col-sm-10"  name="hintQuestion" required>
                                            </div>
                                            <div class="form-group">
                                                    <label for="uname">Hint Answer:</label><br>
                                                    <input type="text" class="col-sm-10"  name="hintAnswer" required>
                                            </div>
                                            <div class="form-group">
                                                    <label for="uname">Password:</label><br>
                                                    <input type="password" class="col-sm-10"   name="password" required>
                                            </div>
                                        

                                        
                                            
                                            <button type="submit" class="btn btn-primary">Submit</button>
                                    </form>
                        
                                </div>
                   
    </div>
  </div>
</body>
</html>