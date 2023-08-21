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
	<h1>User Registration Form</h1>
	<f:form action="/rest-submit" method="post" modelAttribute="resData">
		<table border="2px">
			<tr>
				<th>Label</th>
				<th>Field</th>
			</tr>
			<tr>
				<td>Username</td>
				<td><f:input type="text" path="userName" /></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><f:input type="text" path="password" /></td>
			</tr>
			
			<tr>
				<td>Restaurant Name</td>
				<td><f:input type="text" path="restaurantName" ></f:input></td>
			</tr>
			<tr>
				<td>Manager Name</td>
				<td><f:input type="text" path="managerName" ></f:input></td>
			</tr>
			
			<tr>
				<td>Mobile Number</td>
				<td><f:input type="text" path="contactNumber" ></f:input></td>
			</tr>
			
			
			<tr>
				<td>Building Name</td>
				<td><f:input type="text" path="buildingName" ></f:input></td>
			</tr>
			<tr>
				<td>Street No</td>
				<td><f:input type="text" path="streetNo" ></f:input></td>
			</tr>
			<tr>
				<td>Area</td>
				<td><f:input type="text" path="area" ></f:input></td>
			</tr>
			<tr>
				<td>City</td>
				<td><f:input type="text" path="city" ></f:input></td>
			</tr>
			<tr>
				<td>State</td>
				<td><f:input type="text" path="state" ></f:input></td>
			</tr>
			<tr>
				<td>Country</td>
				<td><input type="text" name="country" ></td>
			</tr>
			<tr>
				<td>Pincode</td>
				<td><f:input type="text" path="pincode" ></f:input></td>
			</tr>
		</table>
		<br> <input type="submit" value="Submit">
	</f:form>
</body>
</html>