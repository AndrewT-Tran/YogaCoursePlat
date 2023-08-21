<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>

<head>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<script src="/webjars/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<script src="/webjars/jquery/3.5.1/jquery.min.js"></script>
<meta charset="ISO-8859-1">
<title>Edit</title>
</head>

<body>
	<div class="container">
		<h1 class="my-2">${yoga.yogaName} with <span class="text-warning"> ${yoga.instructor.userName}</span></h1>
		<table class="text-secondary table-striped table">
			<tr>
				<td class="h5">Day</td>
				<td>${yoga.week}</td>
			</tr>
			<tr>
				<td class="h5">Cost:</td>
				<td>${yoga.price}</td>
			</tr>
			<tr>
				<td class="h5">Time:</td>
				<td>${yoga.time}</td>
			</tr>
		</table>

				<p class="text-emphasis">${yoga.description}</p>


	</div>
	<div class="container-sm">
		<div class="row">
			<div class="col">
				<a href="/yogas/edit/${yoga.id}" class="btn btn-warning my-2">Edit</a>
			</div>
			<div class="col">
				<form action="/yogas/${yoga.id}" method="POST">
					<input type="hidden" value="delete" name="_method" /> <input
						type="submit" value="Delete" class="btn btn-danger" />
				</form>
			</div>
		</div>
		<a class="btn btn-success" href="/">Back to List</a>
	</div>
	<br>

</body>
</html>
