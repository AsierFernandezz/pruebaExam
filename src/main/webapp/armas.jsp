<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index Armas</title>
</head>
<body>

		<table>
		<c:forEach items="${armas}" var="arma">
			<tr>
				<th>ID</th>
				<th>Nombre</th>
				<th>Daño</th>
				<th>Foto</th>
			</tr>
			<tr>
				<td>${arma.id}</td>
				<td>${arma.nombre}</td>
				<td>${arma.capacidad_danio}</td>
				<td>${arma.foto}</td>
			</tr>
		</c:forEach>
		</table>

</body>
</html>