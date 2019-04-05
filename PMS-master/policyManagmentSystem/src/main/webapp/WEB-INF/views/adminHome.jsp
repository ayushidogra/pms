<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
        <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<%-- <html lang="en">
<head>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css">
        <link rel="stylesheet" href="styles/styles.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"> 
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
         <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js"></script>
         <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js"></script>
         
         <script type="text/javascript">
function handleSelect(elm)
{
window.location = elm.value;
}
function change()
{
document.getElementById('prodId').value="Unblock";
}
</script>
</head>
<body background="https://firebasestorage.googleapis.com/v0/b/policy-65ae1.appspot.com/o/backgroung.jpg?alt=media&token=9ae8da86-0d80-481a-b7c5-21c63af3b215">
        <nav class="navbar navbar-expand-md navbar-light bg-light">
                <img src="https://firebasestorage.googleapis.com/v0/b/policy-65ae1.appspot.com/o/logo.png?alt=media&token=3f99482f-6af5-477e-9e56-2e55de640f3c" height="10%" width="12%"></img>
                                 
                    <form class="mx-2 my-auto d-inline w-20">
                        <div class="input-group">
                            <input type="text" class="form-control form-rounded border border-right-0" placeholder="Search...">
                            <span class="input-group-append">
                            <button class="btn btn-outline-secondary border border-left-0" type="button">
                                <i class="fa fa-search"></i>                              
                            </button>
                          </span>
                        </div>
                    </form>

               <ul class="navbar-nav ml-auto">
                   <li class="nav-item">
                       <a class="nav-link" href="#"><span class="fa fa-bell"></span></a>
                   </li>
                   <li class="nav-item">
                       <span class="navbar-text">
                           Welcome, ${user.firstName}
                       </span>
                   </li>
                   </ul>
                    <ul class="navbar-nav ml-auto">
                        <li class="nav-item">
                            <form class="mx-2 my-auto w-full">
                                <a href="logout.html" class="btn btn-secondary  form-rounded" >Logout
           
            </a>
                            </form>
                        </li>
                    </ul>
                        
            </nav>

<div class="container-fluid">
<br>
    <div class="row">
            <div class="col-md-3 bg-light">
                <nav class="navbar navbar-expand-md navbar-dark bg-secondary">
                    <span class="navbar-text navbar-">PROFILE</span>
                    <ul class="navbar-nav ml-auto">
                        <li class="nav-item">

                        </li>
                    </ul>
                </nav>

<br><center>
    <picture>
        <img src="https://firebasestorage.googleapis.com/v0/b/grizzly-5a659.appspot.com/o/profile.png?alt=media&token=2c04d156-e6da-41c5-b726-e7301f660ac1 " alt="Profile picture" width="50px"></img>
    </picture><br>
    <input id="prodId" name="userId" type="hidden" value=${user.userId}>
    <b>${user.firstName}</b>
<br><br>
ID: <br> ${user.userId}
<br><br>
Designation:<br>
${user.qualification}
<br><br>
<address>
        Office:<br>
        ${user.address}
</address>
</center>
  </div>

                <div class="col-md-9 bg-light">
            
                    <div class="btn-group col-md-12">
                        <div class="container">
                            
                            <!-- Nav tabs -->
                            <ul class="nav nav-tabs" role="tablist">
                              <li class="nav-item">
                                <a class="nav-link active" data-toggle="tab" href="#home">POLICY</a>
                              </li>
                              
                            
                            </ul>
                          
                            <!-- Tab panes -->
                            <div class="tab-content">
                              <div id="home" class="container tab-pane active"><br>
        
                        <div class="col-md-12 bg-light">
                                <form class="mx-2 my-auto d-inline w-20" action="ShowProductByCategoryServlet" method="POST">
                                        <div class="input-group">
                                                <select name="selectby" onchange="location = this.value;">
                                                        <option value="">Search By</option>
                                                         <option value="lowtohigh.html?order=LowToHigh">By Name</option>
                                                         <option value="lowtohigh.html?order=HighToLow">By Id</option>
                                                        </select>  &emsp;&emsp;&emsp;&emsp;&emsp;
                                                
                                            <input type="text" name="search" class="form-rounded" placeholder="Search">   


                                                 
                                                     


        <input id="prodId" name="userId" type="hidden" value=${user.userId}>   
             <a href="Admin-AddProduct12.html" class="btn btn-dark form-rounded" >Search Policy</a>
</form>
		<form class= "mx-2 my-auto w-full" action="RedirectToAddProductServlet" method="POST">
												<input id="prodId" name="userId" type="hidden" value=${user.userId}>   
                                                     <a href="Admin-AddProduct12.html" class="btn btn-dark form-rounded" >Create Policy</a>
<form>
                        </div>
    
                                     <br>     <br>                
                                     <table border="1" class="table table-bordered">
                                            <tr>
                                                <td>
                                                    <center><span style="color: gray">List</span>
                                                </td>
                                                <td>
                                                        <center> <span style="color: gray">Brand</span>
                                                    </td>
                                                    <td>
                                                            <center><span style="color: gray">Category</span>
                                                        </td>
                                                        <td>
                                                                <center><span style="color: gray">Price</span>
                                                            </td>
                                                            <td>
                                                                    
                                                                </td>
                                            </tr>
						<c:forEach  var="product"  items="${products}">
                        <tr>
                          <td>
                            <div class="checkbox checkbox-info checkbox-circle">
                              <input id="checkbox11" type="checkbox" checked="">
                              <label for="checkbox11">
                                ${product.productId}
                              </label>
                            </div>    
                          </td>
                          <td>
                            ${product.brand}
                          </td>
                          <td>
                            ${product.category}
                          </td>
                          <td>
                            <span style="color: gray">${product.price}
                            </span>
                          </td>
                          <td>
                            <center>
                              <a href="viewproduct.html?id=${product.productId}" class="btn btn-secondary form-rounded"  width="50px"> &emsp;View&emsp; 
                              </a>&emsp;&emsp;

                              <a href="" class="btn btn-secondary form-rounded"  width="50px">&emsp;Edit&emsp;</a>&emsp;&emsp;
                              <!-- <c:choose>
                              <c:when test="${product.productStatus=='1'}">
								  <a href="block.html?id=${product.productId}" class="btn btn-secondary form-rounded" width="50px" >
                              &emsp;block&emsp; </c:when>
                              <c:otherwise>
                              <a href="unblock.html?id=${product.productId}" class="btn btn-secondary form-rounded" width="50px" >
                              &emsp;Unblock&emsp;
                              </c:otherwise>
                              </c:choose>
                              </a>&emsp;&emsp; -->
                              <a  href="remove.html?id=${product.productId }" class="btn btn-secondary form-rounded">&nbsp;Remove&nbsp; 
                              </a>
                            </center>
                          </td>
                        </tr>
                       </c:forEach>                                

                                        </table>

                        </div>
               
                              </div>
                              <div id="menu1" class="container tab-pane fade"><br>
                                <p>
                                    VENDOR SIDE
                                    </p>
                              </div>
                            </div>
                          </div>
                    </div>
                    <br>
    </div>   
    

           
</body>
</html> --%>



<html>
<head>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<title>Register</title>
</head>
<body>
<%
    response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");//HTTP 1.1
    response.setHeader("Pragma","no-cache"); //HTTP 1.0
    response.setDateHeader ("Expires", 0); //prevents caching at the proxy server
%>
        <nav class="navbar navbar-dark bg-dark">
                <span class="navbar-brand mb-0 h1">Policy Management System</span>
                <ul class="nav navbar-nav">
                        <li class="active"><a href="adminHome.html">Home</a></li>
                </ul>
                <a href="logout.html" class="btn btn-secondary  form-rounded" >Logout
        </nav>
        <br>
        <br>
        <div class="row">
            <div class="col">

            </div>
            <div class="col" style= margin-left:1000px>
                   <a href="addPolicy.html" class="btn btn-info" role="button">Create Policy</a>
                   
            </div>
        </div>
        <br>

            <h4>Polices</h4>
            <c:forEach  var="policy"  items= "${policies}">
            <hr>
            <div class="row">
                    
                <div class="col">
                	<td>
                    ${policy.policyName}
                    </td>
                </div>
                <div class="col">
                    ${policy.policyId}
                </div>
                
                <div class="col">
                        <div class="col" >
                                <button type="button" class="btn btn-info " data-toggle="button" aria-pressed="false" autocomplete="off">
                                     <a href="viewPolicy.html?id=${policy.policyId}">View 
                                       <input id="policyId" type="hidden">
                                </button>
                        </div>
                </div>
                <div class="col">
                        <div class="col" >
                                <button type="button" class="btn btn-info " data-toggle="button" aria-pressed="false" autocomplete="off">
                                        <a href="editPolicy.html?id=${policy.policyId}">Edit
                                        <input id="policyId" type="hidden">
                                </button>
                        </div>
                </div>
                
            </div>
            <hr >
            </c:forEach>

        
    

</body>
</html>