<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Liste des Clients</title>
</head>
<body>
	<h1>Liste des Clients</h1>
	<ul>
		<c:forEach items="${requestScope.clients}" var="client">
			<li><c:out
					value="${client.nom}, ${client.email}, ${client.adresse.ville}" />
			</li>
		</c:forEach>
	</ul>
	<p>
		<a href="${pageContext.request.contextPath}/indexInoui">Accueil</a>
	</p>
</body>
</html>