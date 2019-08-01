<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HMR/ Cancel Reservation</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="https://code.jquery.com/jquery-3.3.1.js"></script>
</head>
<body>
	<jsp:include page="navbar.jsp"></jsp:include>
	<div style="margin-left:3%;" >
			<form  method="post">
				<div class="col-sm-12 col-md-12">
					<div><h2>Cancel Reservation</h2>
					</div><br>
							<div class="form-group">
						      <label for="Origin">Email</label>
						      <input type="email" class="form-control" placeholder="Enter email:" name="email" width="200px" >
						     </div>
						     <div class="form-group">
						      <label for="Origin">Hotel Name</label>
						      <input type="text" class="form-control" placeholder="Enter hotelname:" name="hotelname" width="200px" >
						     </div>
						     <button type="submit" class="btn btn-primary">Cancel Reservation</button>
				</div>	
				
				<h2 style="color: green;">${success}</h2>
				<h2 style="color: red;">${fail}</h2>
			</form>			
		</div>
</body>
</html>