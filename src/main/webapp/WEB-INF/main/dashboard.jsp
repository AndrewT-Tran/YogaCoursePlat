<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Login n Reg</title>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/main.css" />
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css">
<!-- For any Bootstrap that uses JS -->
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<title><c:out value="${loginUser.userName}" /> 's Dashboard</title>
</head>

<body class="bg-light">

	<div class="container-fluid">
		<div class="row justify-content-center align-items-center g-2 my-1">
			<div class="col	">
				<h1>
					Hello, <span class="text-primary"> <c:out
							value="${loginUser.userName}" />
					</span> !
				</h1>
			</div>
			<div class="col">
				<a class="btn btn-danger" href="/">Logout</a>
			</div>
		</div>


		<div class="table-responsive">
			<table
				class="table table-striped table-hover border-primary justify-content-center">
				<thead>
					<tr>
						<th scope="col">Class Name</th>
						<th scope="col">Instructor</th>
						<th scope="col">Weekday</th>
						<th scope="col">Price</th>
						<th scope="col">Time</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${allYoga}" var="yoga">
						<tr>
							<td><a href="yoga/${yoga.id}">${yoga.model}</a></td>
							<td>${yoga.instructor.userName}</td>
							<td>${yoga.weekday}</td>
							<td>${yoga.price}</td>
							<td>${yoga.time}</td>
							<td><c:if
									test="${yoga.seller.userName == loginUser.userName}">
									<a href="/yoga/edit/${yoga.id}" class="btn btn-warning mr-2"><i
										class="bi bi-database-fill-dash"></i> Edit</a>
									<form action="/yoga/${yoga.id}" method="POST" class="d-inline">
										<input type="hidden" value="delete" name="_method" /> <input
											type="submit" value="Delete" class="btn btn-danger" />
									</form>
								</c:if></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<a class="btn btn-success" href="yogas/create"> <i
				class="bi bi-database-fill-add"></i> Create
			</a>
		</div>
	</div>
</body>

</html>