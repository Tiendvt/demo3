<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/commons/taglib.jsp"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/security/tags"prefix="sec"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product Manager</title>
</head>
<body>
	<div align="center">
		<div>
			<sec:authorize access="isAuthenticated()">
                Welcome <b>${pageContext.request.userPrincipal.name}</b>
                &nbsp; <i><sec:authentication
						property="principal.authorities" /></i>
			</sec:authorize>
		</div>
		<form action="${pageContext.request.contextPath}/logout" method="post">
			<input type="submit" value="Logout" />
		</form>
		<h1>Product Manager</h1>
		<sec:authorize access="hasAnyAuthority('CREATOR', 'ADMIN')">
			<a href="${pageContext.request.contextPath}/new">Create New
				Product</a>
		</sec:authorize>
		<br />
		<br />
		<table border="1" cellpadding="10">
			<thead>
				<tr>
					<th>Product ID</th>
					<th>Name</th>
					<th>Brand</th>
					<th>Made In</th>
					<th>Price</th>
					<th><sec:authorize access="hasAnyAuthority('ADMIN', 'EDITOR')">Actions</sec:authorize></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="product" items="${listProducts}">
					<tr>
						<td>${product.id}</td>
						<td>${product.name}</td>
						<td>${product.brand}</td>
						<td>${product.madein}</td>
						<td>${product.price}</td>
						<td><sec:authorize
								access="hasAnyAuthority('ADMIN', 'EDITOR')">
								<a href="${pageContext.request.contextPath}/edit/${product.id}">Edit</a>
                                &nbsp;&nbsp;&nbsp;&nbsp;
                                <sec:authorize
									access="hasAuthority('ADMIN')">
									<a
										href="${pageContext.request.contextPath}/delete/${product.id}">Delete</a>
								</sec:authorize>
							</sec:authorize></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>