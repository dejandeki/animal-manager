<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List dogs</title>

<link type="text/css"
		rel="stylesheet"
		href="${pageContext.request.contextPath}/resources/css/style.css"/>
</head>
<body>

	<div id="wrapper">
		<div id="header">
			<h2>Dog Manager Application</h2>
		</div>
	</div>

	<div id="container">
		<div id="content">

			<input type="button" value="Add Dog"
			onclick="window.location.href='showFormForAdd'; return false;"
			class="add-button"/>

			<form:form action="search" method="GET">
			Search dog: <input type="text" name="theSearch"/>
			
			<input type="submit" value="Search" class="add-button"/>
			</form:form>

			<table>
				<tr>
					<th>ID</th>
					<th>Name</th>
					<th>Breed</th>
					<th>Sex</th>
					<th>WorkerID</th>
					<th>Action</th>
				</tr>

				<!-- loop over and print dogs -->
				<c:forEach var="tempDog" items="${dogs}">

<!-- update link with dog iD -->
			<c:url var="updateLink" value="/dog/showFormForUpdate">
			<c:param name="id" value="${tempDog.id}"/>
			</c:url>
			
			<!-- delete link with dog iD -->
			<c:url var="deleteLink" value="/dog/delete">
			<c:param name="id" value="${tempDog.id}"/>
			</c:url>
					<tr>
						<td>${tempDog.id}</td>
						<td>${tempDog.name}</td>
						<td>${tempDog.breed}</td>
						<td>${tempDog.sex}</td>
						<td>${tempDog.workerId}</td>
						
						<td>
						<a href="${updateLink}">Update</a>
						|
						<a href="${deleteLink}"
						onclick="if(!(confirm('Are you sure you want to delete this dog?'))) return false">Delete</a>
						</td>
					</tr>

				</c:forEach>

			</table>

		</div>

<p>
			<a href="${pageContext.request.contextPath}/worker/list">To
			Worker List</a>
		</p>
	</div>
</body>
</html>