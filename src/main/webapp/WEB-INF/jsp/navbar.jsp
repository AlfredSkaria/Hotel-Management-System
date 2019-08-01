<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href ="/styles/navbar.css" rel="stylesheet">
<!-- <link href ="/styles/home.css" rel="stylesheet"> -->
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script type="text/javascript" src ="/scripts/navbar.js"></script>
</head>
<body>
<div >	
		<nav >
		  <div class="toggle"><i class="fas fa-bars menu"></i></div>
		  <ul >
		 	<li><a href="home" >Home</a></li>
		    <li><a href="searchHotel" >Search Hotel</a></li>
		    <!-- <li><a href="addNewHotel">Add New Hotel</a></li> -->
		    <li><a href="cancelReservation">Cancel Reservation</a></li> 
		    <li><a href="editReservation">Edit Reservation</a></li> 
		    <li><a href="payment">Payment</a></li> 
		    <%-- <li><a href="profile.jsp">
		    <% if(session.getAttribute("username")!=null) {%>
				Hi <%=session.getAttribute("username")%> !!
			<%} %>
		    </a></li> --%>
		    <li><a href="logout">Logout</a></li>
		  </ul>
		  
		</nav> 
		
		<!-- <a onclick="document.forms['logoutForm'].submit()">Logout</a>
            </h3></u>

    <form id="logoutForm" method="POST" action="/login">
    </form> 
     <li><a href="addNewHotel">new hotel</a></li> 
      <li><a href="searchHotel">searchHotel</a></li> --> 
    
</div>
</body>
</html>