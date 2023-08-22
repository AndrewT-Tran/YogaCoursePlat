<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

	<head>
		<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
		<!-- YOUR own local CSS -->
		<link rel="stylesheet" href="/css/main.css" />
		<link rel="stylesheet"
			href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css">
		<meta charset="ISO-8859-1">
		<title>Create a Course</title>
	</head>

	<body class="bg-secondary p-2 text-dark bg-opacity-25">
		<div class="container-md">

			<h1>Create a Course</h1>
			<form:form action="/yogas/process/create" method="post" modelAttribute="yoga">
				<form:input type="hidden" name="_method" path="instructor"
					value="${user_id}" />
				<div class="form-group">
					<label>Name</label>
					<form:input path="yogaName" class="form-control" />
					<form:errors path="yogaName" class="text-danger" />
				</div>
				<div class="form-group my-2">
					<label class="text-strong text-primary">Day of Week</label>
					<form:input path="week" class="form-control" />
					<form:errors path="week" class="text-danger" />
				</div>
				<div class="form-group my-2">
					<label class="text-strong text-primary">Drop-in Price</label>
					<form:input type="number" path="price" class="form-control" />
					<form:errors path="price" class="text-danger" />
				</div>
				<div class="form-group my-2">
					<labe class="text-strong text-primary" l>Time</labe>
					<form:input type="number" path="time" class="form-control" />
					<form:errors path="time" class="text-danger" />
				</div>
				<div class="form-group my-2">
					<label>Description</label>
					<form:input path="description" class="form-control" />
					<form:errors path="description" class="text-danger" />
				</div>
				<input type="submit" value="Create" class=" mx-3 my-2 btn btn-primary" />
				<a class="mx-4 btn btn-danger" href="/">Cancel</a>
			</form:form>

		</div>
	</body>

</html>