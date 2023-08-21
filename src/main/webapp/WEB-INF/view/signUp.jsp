<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
<style>
table {
	border-collapse: collapse;
	width: 100%;
}

th, td {
	padding: 8px;
	text-align: left;
	border-bottom: 1px solid #ddd;
}
</style>
</head>
<body>
	<h1>User Registration Form</h1>
	<f:form action="/cust-submit" method="post" modelAttribute="customerData">
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
				<td>First Name</td>
				<td><f:input type="text" path="firstName" ></f:input></td>
			</tr>
			<tr>
				<td>Last Name</td>
				<td><f:input type="text" path="lastName" ></f:input></td>
			</tr>
			<tr>
				<td>Age</td>
				<td><f:input type="number" path="age" ></f:input></td>
			</tr>
			<tr>
				<td>Gender</td>
				<td><f:label path= "gender">  <f:radiobutton path="gender" value="male"/> Male</f:label>
					<f:label path ="gender"><f:radiobutton
						path="gender" value="female"/>Female</f:label> 
					<f:label path = "gender"><f:radiobutton path="gender" value="other"/>Other</f:label></td>
			</tr>
			<tr>
				<td>Mobile Number</td>
				<td><f:input type="text" path="mobileNumber" ></f:input></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><f:input type="email" path="email" ></f:input></td>
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