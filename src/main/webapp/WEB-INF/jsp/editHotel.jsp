<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HMS/Edit Hotel Details</title>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<link href="/styles/login.css" rel="stylesheet" >
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
</head>
<body>
<body id="LoginForm">
<div class="container">
<!-- <h1 class="form-heading">login Form</h1> -->
<div class="login-form">
<div class="main-div">
    <div class="panel">
   <h2>Edit Hotel Details</h2>
   <p>Please enter hotel details</p>
   </div>
    <form id="Login" method="post" >
    
		<h3>${error}</h3>
        <div class="form-group">
            <input type="text" class="form-control" name="hotelname" placeholder="Hotel name">
        </div>
        <div class="form-group">
            <input type="text" class="form-control" name="rooms" placeholder="No.of Rooms">
        </div>
        <div class="form-group">
            <input type="text" class="form-control" name="rating" placeholder="Rating(3star, 4star,5star)">
        </div>       
        <div class="form-group">
            <input type="text" class="form-control" name="price" placeholder="Amount">
        </div>     
        <button type="submit" class="btn btn-primary">Update</button>
		<div class="forgot">
        <a href="addNewHotel"><center>Back</center></a>
    </form>
    </div>

</div></div></div>


</body>
</html>