<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <%--- private String itemName;
	private int catId;
	private String categoryName;
	private int quantity;
	private double cost; ---%>
	
	<f:form method="post" action="/item-submit/${id}" modelAttribute="item">
	    <h2>Add Item</h2>
		<table border="1">
			<tr>
				<td>Item Name</td>
				<td><f:input path="itemName"/></td>
			</tr>
			<tr>
				<td>Category</td>
				<td><f:select path="catId">
					<f:option value="Veg">Veg</f:option>
					<f:option value="NonVeg">NonVeg</f:option>
				</f:select></td>
			</tr>
			<tr>
				<td>Quantity</td>
				<td><f:input type="number" path="quantity"/></td>
			</tr>
			<tr>
				<td>Price</td>
				<td><f:input type="number" path="cost"/></td>
			</tr>
			<tr>
				<td><input type="submit" value="Add"></td>
			</tr>
		</table>
	</f:form>
</body>
</html>