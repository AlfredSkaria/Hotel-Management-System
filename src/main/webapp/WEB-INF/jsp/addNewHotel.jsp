<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HMS/Add Hotel</title>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<link href="/styles/addhotel.css" rel="stylesheet" >
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
</head>
<body >
<%-- <jsp:include page="navbar.jsp"></jsp:include> --%>
<h1>Welcome to Admin Portal</h1>

		<div class="btn from-middle" onclick="location.href='/addHotel'">
				Add new Hotel
		</div>
		<div class="btn from-middle" onclick="location.href='/editHotel'">
				Edit Hotel
		</div>
		<div class="btn from-middle" onclick="location.href='/adminlogin'">
				Back
		</div>
</body>
</html>