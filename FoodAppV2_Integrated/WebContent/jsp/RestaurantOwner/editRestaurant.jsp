<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Restaurant</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" >
  <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</head>
<body>
<br>
<h3 class="text-center text-danger">Edit Restaurant</h3>
<hr><br>
	<form action="http://localhost:9090/FoodAppV2/UpdateRestaurant" method="post">
	<div class="container bg-light rounded" style="width: 800px">
		<input type="hidden" name="restId" value="${param.id}">
		<div class="form-group">
	    <label for="formGroupExampleInput">Restaurant User Name</label>
	    <input type="text" class="form-control" name="userName">
	  </div>
	  <div class="form-group">
	    <label for="formGroupExampleInput2">PinCode</label>
	    <input type="text" class="form-control" name="pincode">
	  </div>
	   <div class="form-group">
	    <label for="formGroupExampleInput2">Address</label>
	    <input type="text" class="form-control" name="address">
	  </div>
	  <br>
	  <div class="form-group row">
	    <div class="col-sm-8">
	      <button type="submit" class="btn btn-primary">Update Restaurant</button>
	    </div>
	  </div>
		</div>
	</form>
</body>
</html>