<%@page import="com.cybage.pojo.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Restaurant</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" >
  <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">Food App</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNavDropdown">
      <ul class="navbar-nav">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="HomeController">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link"  href="ShowCart">Show Cart</a>
        </li>
       
          <li class="nav-item">
          <a class="nav-link"  href="ShowFavorites">Favorites List</a>
        </li>
           <li class="nav-item">
          <a class="nav-link text-dark" href=changePassword.jsp>change Password</a>
        </li>
          <li class="nav-item">
          <a class="nav-link text-dark" href=" userProfile3.jsp">Update profile</a>
        </li>
        <li class="nav-item">
          <a class="nav-link text-dark" href="Logout">Logout</a>
        </li>
          <li class="nav-item">
           <form class="nav-link text-dark" method="post" action="UserSearchFoodController">
  Search Food : <input type="text" name="searchItem"> &nbsp;
                <input type="submit" value="Search">
</form>   
        </li>
        
     
      </ul>
    </div>
  </div>
</nav>
<% 	User user = (User)session.getAttribute("user");  %>
<h5 class="text-center"><%= "Welcome "+ user.getUserName()%></h5>
<hr/>
<h4 class="text-center">Restaurants</h4>
<br>
	<table class="table table-dark">
		<tr>
			<th>ID</th>
			<th>Restaurant Name</th>
			<th>Pincode</th>
			<th>Address</th>
			<th>Add To Favorite &nbsp;  &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; Action</th>
			
		</tr>
		<c:forEach items="${requestScope.restaurantList}" var="restaurant">
		<tr>
			<td><c:out value="${restaurant.restaurantId}"/></td>
			<td><c:out value="${restaurant.restaurantName}"/></td>
			<td><c:out value="${restaurant.pincode}"/></td>
			<td><c:out value="${restaurant.address}"/></td>
			<td><a href="AddFavorites?&restId=${restaurant.restaurantId}"><button class="btn btn-warning">Add To Favorite</button></a>
			 &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
				<a href="AllRestaurants?&restId=${restaurant.restaurantId}"><button class="btn btn-warning">View Menu</button></a>
			</td>
			
		</tr>
		</c:forEach>
	</table>
	<br>
</body>
</html>