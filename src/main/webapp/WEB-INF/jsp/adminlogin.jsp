<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<link href="/styles/login.css" rel="stylesheet" >
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<title>HMS/Admin-Login</title>
</head>
<body id="LoginForm">
<div class="container">
<!-- <h1 class="form-heading">login Form</h1> -->
<div class="login-form">
<div class="main-div">
    <div class="panel">
   <h2>Admin Login</h2>
   <p>Please enter your email and password</p>
   </div>
    <form id="Login" method="post" >
		<h3>${adminerror}</h3>
        <div class="form-group">
            <input type="text" class="form-control" name="username" placeholder="User Name" required>
        </div>

        <div class="form-group">
            <input type="password" class="form-control" name="password" placeholder="Password" required>
        </div>
        
        <button type="submit" class="btn btn-primary">Login</button>
		<div class="forgot">
        <a href="login"><center>Customer Login</center></a>
		</div>
    </form>
    </div>

</div></div></div>

</body>
</html>