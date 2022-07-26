<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Restaurant</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" >
  <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</head>
<body>
	<h3 class="text-center m-3 text-danger">Add Restaurant</h3>
	<hr><br>
	<form action="http://localhost:9090/FoodAppV2/AddRestaurantOwner" method="post">
		<div class="container border border-secondary p-2 rounded bg-light" style="height: 490px;width: 1000px"><br>
			<div class="form-group row">
	    <label for="inputEmail3" class="col-sm-2 col-form-label">Restaurant Name</label>
	    <div class="col-sm-8">
	      <input type="text" class="form-control" name="name">
	    </div>
	  </div>
	  <div class="form-group row">
	    <label for="inputPassword3" class="col-sm-2 col-form-label">Restaurant User Name</label>
	    <div class="col-sm-8">
	      <input type="text" class="form-control" name="userName" >
	    </div>
	  </div>
	   <div class="form-group row">
	    <label for="inputPassword3" class="col-sm-2 col-form-label">Address</label>
	    <div class="col-sm-8">
	      <input type="text" class="form-control" name="address" >
	    </div>
	  </div>
	  <div class="form-group row">
	    <label for="inputEmail3" class="col-sm-2 col-form-label">PinCode</label>
	    <div class="col-sm-8">
	      <input type="text" class="form-control" name="pincode">
	    </div>
	  </div>
	  <div class="form-group row">
	    <label for="inputEmail3" class="col-sm-2 col-form-label">Email</label>
	    <div class="col-sm-8">
	      <input type="email" class="form-control" name="email" >
	    </div>
	  </div>
	  <div class="form-group row">
	    <label for="inputPassword3" class="col-sm-2 col-form-label">Password</label>
	    <div class="col-sm-8">
	      <input type="password" class="form-control" name="password">
	    </div>
	  </div>
  
<br>
  <div class="form-group row">
    <div class="col-sm-8">
      <button type="submit" class="btn btn-primary">Add Details</button>
    </div>
  </div>
	</div>
	
	</form>
</body>
</html>