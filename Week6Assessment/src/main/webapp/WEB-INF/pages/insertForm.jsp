<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<div class="col-md-offset-2 col-md-7">
			<h2 class="text-center">Product Info</h2>
			<div class="panel panel-info">
				<div class="panel-heading">
					<div class="panel-title">Add Product</div>
				</div>
				<div class="panel-body">
					<form:form action="saveProduct" cssClass="form-horizontal"
						method="post" modelAttribute="product">

						<!-- need to associate this data with customer id -->
						<form:hidden path="id" />

						<div class="form-group">
							<label for="ProductName" class="col-md-3 control-label">Product Name</label>
							<div class="col-md-9">
								<form:input path="name" cssClass="form-control" />
							</div>
						</div>
						<div class="form-group">
							<label for="Price" class="col-md-3 control-label">Price</label>
							<div class="col-md-9">
								<form:input path="price" cssClass="form-control" />
							</div>
						</div>

						<div class="form-group">
							<label for="Quantity" class="col-md-3 control-label">Quantity</label>
							<div class="col-md-9">
								<form:input path="quantity" cssClass="form-control" />
							</div>
						</div>

						<div class="form-group">
							<!-- Button -->
							<div class="col-md-offset-3 col-md-9">
								<form:button cssClass="btn btn-primary">Submit</form:button>
							</div>
						</div>
					</form:form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>