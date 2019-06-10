<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Save cat</title>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css">

<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/add-dog-style.css">

</head>
<body>


<div id="wrapper">
		<div id="header">
			<h2>Cat Manager Application</h2>
		</div>
	</div>

	<div id="container">
		<h3>Save Cat</h3>
		<form:form action="saveCat" modelAttribute="cat" method="POST">

		<!-- need to associate this data with cat id -->
		<form:hidden path="id"/>
			<table>

				<tbody>

					<tr>
						<td><label>Name</label></td>
						<td><form:input path="name" /></td>
					</tr>
					<tr>
						<td><label>Breed</label></td>
						<td><form:input path="breed" /></td>
					</tr>
					<tr>
						<td><label>Sex</label></td>
						<td><form:input path="sex" /></td>
					</tr>
					<tr>
						<td><label>Worker ID</label></td>
						<td><form:input path="workerId" /></td>
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
			<a href="${pageContext.request.contextPath}/cat/list">Back to
				List</a>
		</p>
	</div>
</body>
</html>