<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Order Checkout</title>
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
<h2 class="text-center text-danger">OrderCheckOut</h2>
<hr/>
<br>
	<form action="AddOrder" method="post">
		<div class="container border border-secondary p-2 rounded bg-light" style="height: 490px;width: 1000px"><br>			
	  
	  
	  
	  <div class="form-group row">
	    <label for="delAdd" class="col-sm-2 col-form-label">Enter DeliveryAddress</label>
	    <div class="col-sm-8">
	      <input type="text" class="form-control" name="delAdd">
	    </div>
	  </div>
  
<br>
  <div class="form-group row">
    <div class="col-sm-8">
      <button type="submit" class="btn btn-primary">Submit to place order</button>
    </div>
  </div>
	</div>
	
	</form>
	
</body>
</html>