<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">

<head>

	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Login Page</title>
	<link rel="stylesheet" href="css/style.css">
	<link href="https://fonts.googleapis.com/css?family=Ubuntu" rel="stylesheet">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<style>
* {
	box-sizing: border-box;
}

body {
	padding: 0;
	margin: 0;
	/* background: #C9C9C9; */
	background: white
	color: #fff;
	font-family: 'Ubuntu', sans-serif;
}
a{
	text-decoration: none;
}
#wrapper {
	width: 430px;
	background: url(https://firebasestorage.googleapis.com/v0/b/policy-65ae1.appspot.com/o/abc.jpg?alt=media&token=30ac355e-a7d9-4075-828d-2a1a5045f29b);
	margin: 25px auto;
	padding: 64px;
	background-size: cover;
	position: relative;
	z-index: 1;
	box-shadow: 0px 15px 20px 0px rgba(128, 128, 128, 0.76);
}

#wrapper:before {
	content: "";
	position: absolute;
	top: 0;
	left: 0;
	right: 0;
	bottom: 0;
	background: rgba(0, 0, 0, .64);
	z-index: -1;
}

#table {
	margin-bottom: 6em;
}

#table a {
	text-transform: uppercase;
	margin-right: 40px;
	padding: 11px 4px;
	color: #bbb;
	cursor: pointer
}

#table a.active {
	border-bottom: 1.5px solid #1061EE;
	color: #fff;
}

label {
	display: block
}

form {
	margin-bottom: 3.3em;
}

.form-group {
	position: relative;
	margin-bottom: 16px;
}

.form-group label {
	display: block;
	margin-bottom: 6px;
	font-size: 14px;
	margin-left: 14px;
	color: #bbb;
}

input {
	width: 100%;
	background: rgba(0, 0, 0, 0.42);
	outline: none;
	padding: 10px 14px;
	color: #fff;
	border: none;
	border-radius: 36px;
	font-family: 'Ubuntu', sans-serif;
	font-size: 16px;
	transition: background 0.5s ease-in-out;
}
span#showpwd {
    position: absolute;
    top: 32px;
    right: 16px;
    cursor: pointer;
}
input:focus {
	background: rgba(0, 0, 0, 0.6);
}

input[type="submit"] {
	background: #1061EE;
	margin-top: 14px;
	cursor: pointer;
}

#checkbox {
	color: #fff;
	cursor: pointer;
	font-size: 16px
}

#checkbox input+.text:before {
	content: "\f096";
	display: inline-block;
	font: normal normal normal 14px/1 FontAwesome;
	font-size: inherit;
	text-rendering: auto;
	-webkit-font-smoothing: antialiased;
	-moz-osx-font-smoothing: grayscale;
	margin-right: 6px;
	width: 1em;
}

#checkbox input:checked+.text:before {
	content: "\f14a";
	color: #1061ee;
	animation: scalecheck 0.1s
}

#checkbox input {
	display: none;
}

@-webkit-keyframes scalecheck {
	0% {
		transform: scale(0);
	}
	90% {
		transform: scale(1.4);
	}
	100% {
		transform: scale(1);
	}
}

.hr {
	height: 1.4px;
	background: rgba(128, 128, 128, 0.51);
	border-radius: 17px;
	margin-bottom: 33px;
}

#froget-pass {
	text-align: center;
	color: #bbb;
	margin: 0;
	display: block;
}

@media screen and (max-width :490px) {
	body {
		display: table;
		width: 100%;
	}
	#wrapper {
		width: auto;
		height: 100vh;
		margin: 0;
		display: table-cell;
		vertical-align: middle;
	}
}

@media screen and (max-width :490px) {
	#wrapper {
		padding: 28px;
	}
}

</style>
</head>

<body bgcolor="white">

	<div id="wrapper">
		<div id="table">
			<a class="active">Admin</a>
			<a href="userlog.html">User</a>
		</div>
		<div id="signin">
			<form action="login.html" method="POST">
				<div class="form-group">
					<label for="username">Username</label>
					<input type="text" id="username" name="userId" required autofocus>
				</div>
				<div class="form-group">
					<label for="pass">Password</label>
					<input type="password" id="pass" name="password" required>
					<span id="showpwd" class="fa fa-eye-slash"></span>
				</div>
				<div class="form-group">
					<label id="checkbox">
						<input type="checkbox" checked><span class="text">Keep me signed in </span>
					</label>
				</div>
				<div class="form-group">
				<input type="submit" value="Submit">
					
				</div>
				</form>
				<form action="registration12.html">
				<div class="form-group">
				<input type="submit" value="New User?">
				
					
				</div>
				</form>
			
		<div class="hr"></div>
		<a href="#" id="froget-pass">Forget Password?</a>
		
    </div>
		
	</div>
	<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
	<script >
  $(document).ready(function () {
	$("#showpwd").on("click", function () {
		$(this).toggleClass("fa-eye fa-eye-slash");
		$($(this).siblings()[1]).attr("type", function (index, attr) {
			return attr == "password" ? "text" : "password"
		});
	});
})

  </script>
</body>

</html>
