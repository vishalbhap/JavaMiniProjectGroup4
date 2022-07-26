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
      </ul>
    </div>
  </div>
</nav>
<h2 class="text-center text-danger">Restaurant Menu</h2>
<hr/>
<br>
	<table class="table table-striped">
		<tr>
			
			<th>Food Name</th>
			<th>Food Category</th>
			<th>Price</th>
			<th>Offer</th>
			<th>Action</th>
		</tr>
		<c:forEach items="${requestScope.foodList}" var="food">
		<tr>
			<td><c:out value="${food.foodName}"/></td>
			<td><c:out value="${food.foodCategory}"/></td>
			<td><c:out value="${food.price}"/></td>
			<td><c:out value="${food.offer}"/></td>
			<td>
				<a href="http://localhost:9090/FoodAppV2/AddCart?foodId=${food.foodId}"><button class="btn btn-warning">Add To Cart</button></a>
				&nbsp;	
			</td>
		</tr>
		</c:forEach>
	</table>
	<br>
</body>
</html>