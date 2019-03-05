<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Save Worker</title>

<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css">

<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/add-dog-style.css">
</head>
<body>

	<div id="wrapper">
		<div id="header">
			<h2>Worker Application</h2>
		</div>
	</div>

	<div id="container">
		<h3>Save Worker</h3>
		<form:form action="saveWorker" modelAttribute="worker" method="POST">

		<!-- need to asociate this data with worker id -->
		<form:hidden path="id"/>
			<table>

				<tbody>

					<tr>
						<td><label>First Name</label></td>
						<td><form:input path="firstName" /></td>
					</tr>
					<tr>
						<td><label>Last Name</label></td>
						<td><form:input path="lastName" /></td>
					</tr>
					<tr>
						<td><label>Telephone</label></td>
						<td><form:input path="telephone" /></td>
					</tr>
					<tr>
						<td><label>Address</label></td>
						<td><form:input path="address" /></td>
					</tr>
					<tr>
						<td><label>City</label></td>
						<td><form:input path="city" /></td>
					</tr>
					<tr>
						<td><label>Active</label></td>
						<td><form:input path="active" /></td>
					</tr>
					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Save" class="save" /></td>
					</tr>
				</tbody>
			</table>
		</form:form>

		<div style=""></div>

		<p>
			<a href="${pageContext.request.contextPath}/worker/list">Back to
				List</a>
		</p>
	</div>


</body>
</html>