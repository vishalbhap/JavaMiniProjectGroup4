<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" >
  <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
  <style type="text/css">
  	@media (min-width: 768px) {
	  .gradient-form {
	    height: 100vh !important;
	  }
	}

	@media (min-width: 769px) {
	  .gradient-custom-2 {
	    border-top-right-radius: .3rem;
	    border-bottom-right-radius: .3rem;
	  }
	}

	.container-fluid {
	  padding-top: 60px;
	}
	
	body {
	  background-color: aliceblue;
	}
	
	h2 {
	  font-size: 40px;
	  text-align: center;
	}
  </style>
<title>Login</title>
</head>
<body>
	<div class="container-fluid h-100">
    <h2>User Register Form</h2>
    <br/>
    <div class="row justify-content-center align-items-center h-100">
      <div class="col col-sm-6 col-md-6 col-lg-4 col-xl-3">
        <form action="Register" method="post">
          <div class="form-group">
            <label>User Name:</label>
              <input type="text" class="form-control" placeholder="Enter name" name="uname" required>
          </div>
          
          <div class="form-group">
            <label>Email:</label>
            <input type="email" class="form-control" placeholder="Enter Email" name="email" required>
          </div>
          
          <div class="form-group">
            <label>Password:</label>
            <input type="password" class="form-control" placeholder="Enter Password" name="password" required>
          </div>
          
          <div class="form-group">
            <label>Phone:</label>
            <input type="text" class="form-control" placeholder="Enter Phone" name="phone" required>
          </div>
          
          <div class="form-group">
            <label>Address:</label>
            <input type="text" class="form-control" placeholder="Enter Address" name="address" required>
          </div>
          
          <div class="form-group">
            <label>Pincode:</label>
            <input type="text" class="form-control" placeholder="Enter Pincode" name="pincode" required>
          </div>
                  
          <br/>
          <div class="form-group">
            <button  type="submit" class="btn btn-info btn-lg btn-block">Register</button>
          </div>
          </form>
              
          <br/><br/>
          <div class="form-group">
            <span class="">Already have an account ?
              <a href="Login.jsp" class="link-danger">Login Here</a>
            </span>
          </div>
                  
       
      </div>
    </div>
  </div>
</body>
</html>
