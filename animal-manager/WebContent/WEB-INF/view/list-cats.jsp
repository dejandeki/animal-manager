<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List cats</title>

<link type="text/css"
		rel="stylesheet"
		href="${pageContext.request.contextPath}/resources/css/style.css"/>
</head>
<body>

	<div id="wrapper">
		<div id="header">
			<h2>Cat Manager Application</h2>
		</div>
	</div>

	<div id="container">
		<div id="content">

			<input type="button" value="Add Cat"
			onclick="window.location.href='showFormForAdd'; return false;"
			class="add-button"/>

			<form:form action="search" method="GET">
			Search cat: <input type="text" name="theSearch"/>
			
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

				<!-- loop over and print cats -->
				<c:forEach var="tempCat" items="${cats}">

<!-- update link with cat iD -->
			<c:url var="updateLink" value="/cat/showFormForUpdate">
			<c:param name="id" value="${tempCat.id}"/>
			</c:url>
			
			<!-- delete link with cat iD -->
			<c:url var="deleteLink" value="/cat/delete">
			<c:param name="id" value="${tempCat.id}"/>
			</c:url>
					<tr>
						<td>${tempCat.id}</td>
						<td>${tempCat.name}</td>
						<td>${tempCat.breed}</td>
						<td>${tempCat.sex}</td>
						<td>${tempCat.workerId}</td>
						
						<td>
						<a href="${updateLink}">Update</a>
						|
						<a href="${deleteLink}"
						onclick="if(!(confirm('Are you sure you want to delete this cat?'))) return false">Delete</a>
						</td>
					</tr>

				</c:forEach>

			</table>

		</div>

<p>
			<a href="${pageContext.request.contextPath}/worker/list">To
			Worker List</a>
		</p>
		<p>
		<a href="${pageContext.request.contextPath}/dog/list">To
			Dog List</a>
		</p>
	</div>
</body>
</html>