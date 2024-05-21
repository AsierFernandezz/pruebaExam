<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index Caballeros</title>
</head>
<body>

		<table>
		<c:forEach items="${caballeros}" var="caballero">
			<tr>
				<th>ID</th>
				<th>Nombre</th>
				<th>Fuerza</th>
				<th>Experiencia</th>
				<th>Foto</th>
				<th>arma</th>
				<th>escudo</th>
			</tr>
			<tr>
				<td>${caballero.id}</td>
				<td>${caballero.nombre}</td>
				<td>${caballero.fuerza}</td>
				<td>${caballero.experiencia}</td>
				<td>${caballero.foto}</td>
				<td>${caballero.arma}</td>
				<td>${caballero.escudo}</td>
			</tr>
		</c:forEach>
		</table>

</body>
</html>