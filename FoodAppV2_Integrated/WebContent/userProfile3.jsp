<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
h1 {
	background-color: #ADD8E6;
	font-size: 30px;
}

th {
	background-color: Cyan;
	font-size: 30px;
}

tr {
	background-color: #D3D3D3;
	font-size: 30px;
}

td{
font-size: 30px;
}

table {
	width: 800px;
}
</style>
</head>
<body>
	<!-- <center> -->
		<h1>User Info Updation</h1>
		<hr>
		<br />
		<form action="UserUpdateController" method="post">
			<table style="with: 100%" class="table table-hover">
				<tr>
					<td>Email:</td>
					<td><input type="text" name="email" required></td>
				</tr>
				<tr>
					<td>phone:</td>
					<td><input type="number" name="phone" required></td>
				</tr>
				<tr>
					<td>Address:</td>
					<td><input type="text" name="address" required></td>
				</tr>
				<tr>
					<td>Pincode:</td>
					<td><input type="number" name="pincode" required></td>
				</tr>
			</table>
			
			<br />
			
			<input type="submit" value="Update Profile">&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; 
		    <input type="reset" value="Cancle">
		</form>
		
		
	<!-- </center> -->
</body>
</html>