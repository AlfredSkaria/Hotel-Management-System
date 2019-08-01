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
<title>HMS/Register</title>
</head>
<body id="LoginForm">
<div class="container">
<!-- <h1 class="form-heading">login Form</h1> -->
<div class="login-form">
<div class="main-div">
    <div class="panel">
   <h2>Register</h2>
   <p>Please fill your details</p>
   </div>
    <form id="Login" method="post">
		
		<div class="form-group">
            <input type="text" class="form-control" name="name" placeholder="Name" required/>
        </div>
        <div class="form-group">
            <input type="text" class="form-control" name="username" placeholder="User Name" required/>
        </div>
        <div class="form-group">
            <input type="tel" class="form-control" name="phoneno" placeholder="Phone No" required/>
        </div>
        <div class="form-group">
            <input type="email" class="form-control" name="email" placeholder="Email Address" required/>
        </div>

        <div class="form-group">
            <input type="password" class="form-control" name="password" placeholder="Password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" 
            title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters" required>
         </div>
        <div class="form-group">
            <input type="text" class="form-control" name="country" placeholder="Country" required/>
        </div>
        
        <button type="submit" class="btn btn-primary">Sign up</button>
		<div class="forgot">
        <a href="login"><center>Already Registered? Login Now</center></a>
		</div>
		<div class="forgot">
        <a href="adminlogin"><center>Admin Login</center></a>
		</div>
    </form>
    </div>

</div></div></div>
</body>
</html>