<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

    <head>
        <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
        <script src="/webjars/bootstrap/4.5.2/js/bootstrap.min.js"></script>
        <script src="/webjars/jquery/3.5.1/jquery.min.js"></script>
        <meta charset="ISO-8859-1">
        <title>Create</title>
    </head>

    <body>
        <h1>Add Car</h1>
        <form:form action="/cars/process/create" method="post" modelAttribute="car">
            <form:input type="hidden" name="_method" path="seller" value="${user_id}" />
           <div class="form-group">
				<label>Price</label>
				<form:input type="number" path="price" class="form-control" />
				<form:errors path="price" class="text-danger" />
			</div>
			<div class="form-group">
				<label>Model</label>
				<form:input path="model" class="form-control" />
				<form:errors path="model" class="text-danger" />
			</div>
			<div class="form-group">
				<label>Make</label>
				<form:input path="make" class="form-control" />
				<form:errors path="make" class="text-danger" />
			</div>
			<div class="form-group">
				<label>Year</label>
				<form:input type="number" path="year" class="form-control" />
				<form:errors path="year" class="text-danger" />
			</div>
			<div class="form-group">
				<label>Description</label>
				<form:input path="description" class="form-control" />
				<form:errors path="description" class="text-danger" />
			</div>
			<input type="submit" value="Create" class=" my-2 btn btn-primary" />
		</form:form>
		<a class="btn btn-danger" href="/">Cancel</a>

    </body>

</html>