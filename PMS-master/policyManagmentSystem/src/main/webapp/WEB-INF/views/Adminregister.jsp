<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">
  <head>
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <!------ Include the above in your HEAD tag ---------->
    <title>Registration</title>

    <link rel="stylesheet" href="C:\Users\768762\Desktop\registration.css" />
    <style>
    body {
    background: #C5E1A5;
  }
  form {
    width: 60%;
    margin: 60px auto;
    background: #efefef;
    padding: 60px 120px 80px 120px;
    text-align: center;
    -webkit-box-shadow: 2px 2px 3px rgba(0,0,0,0.1);
    box-shadow: 2px 2px 3px rgba(0,0,0,0.1);
  }
  label {
    display: block;
    position: relative;
    margin: 40px 0px;
  }
  .nav-item-active{
    float:right;
  }
  .navbar-header{
    width:100%;
  }
  .label-txt {
    position: absolute;
    top: -1.6em;
    padding: 6px;
    font-family: sans-serif;
    font-size: .9em;
    letter-spacing: 1px;
    color: rgb(120,120,120);
    transition: ease .3s;
  }
  .input {
    width: 95%;
    padding: 4px;
    background: transparent;
    border: none;
    outline: none;
  }
  
  .line-box {
    position: relative;
    width: 100%;
    height: 2px;
    background: #BCBCBC;
  }
  
  .line {
    position: absolute;
    width: 0%;
    height: 2px;
    top: 0px;
    left: 50%;
    transform: translateX(-50%);
    background: rgb(255, 132, 132);
    transition: ease .6s;
  }
  
  .input:focus + .line-box .line {
    width: 100%;
  }
  
  .label-active {
    top: -3em;
  }
  
  button {
    display: inline-block;
    padding: 12px 24px;
    background: rgb(220,220,220);
    font-weight: bold;
    color: rgb(120,120,120);
    border: none;
    outline: none;
    border-radius: 3px;
    cursor: pointer;
    transition: ease .3s;
  }
  
  button:hover {
    background: #8BC34A;
    color: #ffffff;
  }
    </style>
    <script>
    $(document).ready(function(){

        $('.input').focus(function(){
          $(this).parent().find(".label-txt").addClass('label-active');
        });
      
        $(".input").focusout(function(){
          if ($(this).val() == '') {
            $(this).parent().find(".label-txt").removeClass('label-active');
          };
        });
      
      });
    </script>
    
  </head>

  <body>
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
                <a class="navbar-brand" href="#" style="margin-right: 60rem">Policy Tracker</a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                  <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarNav">
                  <ul class="navbar-nav">
                    
                    <li class="nav-item active" >
                      <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
                    </li>
                    
                    <li class="nav-item active">
                      <a class="nav-link" href="#">Login<span class="sr-only">(current)</span></a>
                    </li>
                    
                  </ul>
                </div>
              </nav>
<form action="registration.html"  method="POST">
        <label>
          <p class="label-txt">USER ID</p>
          <br>
          <input type="text" class="input" name="userId" required>
          <div class="line-box">
            <div class="line"></div>
          </div>
        </label>
        <label>
          <p class="label-txt">FIRST NAME</p><br>
          <input type="text" class="input" name="firstName" required>
          <div class="line-box">
            <div class="line"></div>
          </div>
        </label>
        <label>
          <p class="label-txt">Last Name:</p><br>
          <input type="text" class="input" name="lastName" required>
          <div class="line-box">
            <div class="line"></div>
          </div>
        </label>
        <label>
                <p class="label-txt">DOB (dd/MM/yyyy) :</p><br>
                <input type="text" class="input" name="DOB" required>
                <div class="line-box">
                  <div class="line"></div>
                </div>
        </label>
        <label>
                <p class="label-txt">Gender</p><br>
                 <select name="gender" class="input">
                                                    <option value="Male">Male</option>
                                                    <option value="Female">Female</option>
                                                    
                                            </select>
                <div class="line-box">
                  <div class="line"></div>
                </div>
        </label>
       
        <label>
                <p class="label-txt">Contact No:</p><br>
                <input type="text" class="input" name="contactNo" required>
                <div class="line-box">
                  <div class="line"></div>
                </div>
              </label>
              <label>
                    <p class="label-txt">Address:</p><br>
                    <input type="text" class="input" name="address" required>
                    <div class="line-box">
                      <div class="line"></div>
                    </div>
                  </label>
                  <label>
                        <p class="label-txt">Email Id:</p><br>
                        <input type="email" class="input" name="email" required>
                        <div class="line-box">
                          <div class="line"></div>
                        </div>
                      </label>
                      <label>
                            <p class="label-txt">Qualification:</p><br>
                            <input type="text" class="input" name="qualification" required>
                            <div class="line-box">
                              <div class="line"></div>
                            </div>
                          </label>
                          <label>
                                <p class="label-txt">Salary Per Month:</p><br>
                                <input type="text" class="input" name="salary" required>
                                <div class="line-box">
                                  <div class="line"></div>
                                </div>
                              </label>
                              <label>
                                    <p class="label-txt">PAN No:</p><br>
                                    <input type="text" class="input" name="PAN" required>
                                    <div class="line-box">
                                      <div class="line"></div>
                                    </div>
                                  </label>

                                  <label>
                                        <p class="label-txt">Employer Type:</p><br>
                                        <input type="text" class="input" name="employerType" required>
                                        <div class="line-box">
                                          <div class="line"></div>
                                        </div>
                                      </label>
                                      <label>
                                            <p class="label-txt">Employer:</p><br>
                                            <input type="text" class="input" name="employer" required>
                                            <div class="line-box">
                                              <div class="line"></div>
                                            </div>
                                          </label>
                                          <label>
                                                <p class="label-txt">Hint Question:</p><br>
                                                <input type="text" class="input" name="hintQuestion" required>
                                                <div class="line-box">
                                                  <div class="line"></div>
                                                </div>
                                              </label>
                                              <label>
                                                    <p class="label-txt">Hint Answer:</p><br>
                                                    <input type="text" class="input" name="hintAnswer" required>
                                                    <div class="line-box">
                                                      <div class="line"></div>
                                                    </div>
                                                  </label>
                                                  <label>
                                                        <p class="label-txt">Password:</p><br>
                                                        <input type="password" class="input" name="password" required>
                                                        <div class="line-box">
                                                          <div class="line"></div>
                                                        </div>
                                                      </label>
        
        <button type="submit">submit</button>
      </form>
      
    <script src="C:\Users\768762\Desktop\registration.js"></script>
  </body>
</html>