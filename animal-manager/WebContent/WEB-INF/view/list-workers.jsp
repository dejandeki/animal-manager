<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List workers</title>

<link type="text/css"
		rel="stylesheet"
		href="${pageContext.request.contextPath}/resources/css/style.css"/>
</head>
<body>

	<div id="wrapper">
		<div id="header">
			<h2>Worker Application</h2>
		</div>
	</div>

	<div id="container">
		<div id="content">

			<input type="button" value="Add Worker"
			onclick="window.location.href='showFormForAdd'; return false;"
			class="add-button"/>

			<table>
				<tr>
					<th>ID</th>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Telephone</th>
					<th>Address</th>
					<th>City</th>
					<th>Active</th>
					<th>Action</th>
				</tr>

				<!-- loop over and print workers -->
				<c:forEach var="tempWorker" items="${workers}">

<!-- update link with worker iD -->
			<c:url var="updateLink" value="/worker/showFormForUpdate">
			<c:param name="id" value="${tempWorker.id}"/>
			</c:url>
			
					<tr>
						<td>${tempWorker.id}</td>
						<td>${tempWorker.firstName}</td>
						<td>${tempWorker.lastName}</td>
						<td>${tempWorker.telephone}</td>
						<td>${tempWorker.address}</td>
						<td>${tempWorker.city}</td>
						<td>${tempWorker.active}</td>
						
						<td>
						<a href="${updateLink}">Update</a>
						</td>
					</tr>
			
				</c:forEach>

			</table>

		</div>

<p>
			<a href="${pageContext.request.contextPath}/dog/list">To
				Dog List</a>
		</p>
		<p>
		<a href="${pageContext.request.contextPath}/cat/list">To
			Cat List</a>
		</p>
	</div>
</body>
</html>