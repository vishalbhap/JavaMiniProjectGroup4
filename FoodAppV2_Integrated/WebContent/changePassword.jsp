<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Change Password Page</title>
<style>
body {
	text-align: center;
}

.center {
	margin-left: auto;
	margin-right: auto;
}
</style>
</head>
<body>
	<h1>Change Password</h1>
	<hr>
	<form action="ChangePasswordController" method="post">
		<table class="center">
			<tr>
				<td>Current Password</td>
				<td><input type="password" name="current"></td>
			</tr>
			<tr>
				<td>New Password</td>
				<td><input type="password" name="new"></td>
			</tr>
			<tr>
				<td>Confirm Password</td>
				<td><input type="password" name="confirm"></td>
			</tr>
		</table>
		</br> 
		<input type="submit" value="Change Password">
	</form>

</body>
</html>