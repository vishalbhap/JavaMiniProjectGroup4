<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Available Items</h1><br>
<table style="border: 1px solid;">
		<thead>
		<tr>
			<td style="border: 1px solid;">Food Name</td>
			<td style="border: 1px solid;">Food Category</td>
			<td style="border: 1px solid;">Food Price</td>
			<td style="border: 1px solid;">Food Discount</td>
		</tr>
		</thead>
		<tbody>
			<c:forEach items="${requestScope.searchFood}" var="food">
				<tr>
					<td style="border: 1px solid;"><c:out value="${food.foodName }"></c:out> </td>
					<td style="border: 1px solid;"><c:out value="${food.foodCategory}"></c:out> </td>
					<td style="border: 1px solid;"><c:out value="${food.price}"></c:out> </td>
					<td style="border: 1px solid;"><c:out value="${food.offer}"></c:out> </td>
					
			</c:forEach>
		</tbody>
	</table>
	<hr>
</body>
</html>