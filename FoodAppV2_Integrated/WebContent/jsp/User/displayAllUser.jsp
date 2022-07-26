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
          <a class="nav-link active" aria-current="page" href="admin.jsp">Home</a>
        </li>
        <li class="nav-item">
         <a class="nav-link active" href="http://localhost:9090/FoodAppV2/jsp/RestaurantOwner/addRestaurantOwner.jsp">Add Restaurant Owner</a>
        </li>
        <li class="nav-item">
          <a class="nav-link text-dark" href="Logout">Logout</a>
        </li>
      </ul>
    </div>
  </div>
</nav>
<% 	User user = (User)session.getAttribute("user");  %>
<h5 class="text-center"></h5>
<%-- <h5 class="text-center"><%= "Welcome "+ user.getUserName()%></h5> --%>
<hr/>
<br>
	<table class="table table-dark table-striped">
		<tr>
			<th>ID</th>
			<th>User Name</th>
			<th>Email</th>
			<th style="display:none;">Password</th>
			<th>MobileNo</th>
			<th>Pin-code</th>
			<th>Address</th>
			<th>Action</th>
		</tr>
		<c:forEach items="${requestScope.userList}" var="user">
		<tr>
			<td><c:out value="${user.userId}"/></td>
			<td><c:out value="${user.userName}"/></td>
			<td><c:out value="${user.email}"/></td>
			<td style="display:none;"><c:out value="${user.password}"/></td>
			<td><c:out value="${user.phoneNumber}"/></td>
			<td><c:out value="${user.pincode}"/></td>
			<td><c:out value="${user.address}"/></td>
			<td>
				<%-- <a href="AdminController/EditUser?id=${user.userId}"><button class="btn btn-warning">EDIT</button></a>
				&nbsp; --%>
				<a href="AdminController/DeleteUser?id=${user.userId}"><button class="btn btn-danger">DELETE</button></a>
			</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>