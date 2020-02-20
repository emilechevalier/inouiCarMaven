<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Menu Back-office</title>
</head>
<body>

	<h1>Actions InouiCar</h1>

	<ul>
		<li><a href="${pageContext.request.contextPath}/ajoutClient">Ajouter
				un Client</a>
		<li><a href="${pageContext.request.contextPath}/listeClients">Lister
				les clients</a>
	</ul>

	<c:out value="${requestScope.message}"></c:out>

</body>
</html>