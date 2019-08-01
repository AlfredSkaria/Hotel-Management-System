<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book Hotels</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="https://code.jquery.com/jquery-3.3.1.js"></script>
</head>
<body>
<jsp:include page="navbar.jsp"></jsp:include>

<div style="margin-left: 7%; margin-top: 5%;" >
		<h2>  </h2>
		
		<form  method="post">
				<div class="col-sm-12 col-md-12">
					<div><h2>Book Hotels</h2>
					</div><br>
							<div class="form-group">
						      <label for="Origin">Hotel Name</label>
						      <input type="text" class="form-control" placeholder="Enter hotelname:" name="hotelname" width="200px" >
						     </div>
						     <button type="submit" class="btn btn-primary">Book</button>
				</div>	
			</form>	
</div>
</body>
</html>