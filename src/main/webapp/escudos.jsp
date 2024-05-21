<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index Escudo</title>
</head>
<body>

		<table>
		<c:forEach items="${escudos}" var="escudo">
			<tr>
				<th>ID</th>
				<th>Nombre</th>
				<th>Defensa</th>
			</tr>
			<tr>
				<td>${escudo.id}</td>
				<td>${escudo.nombre}</td>
				<td>${escudo.capacidad_defensa}</td>
			</tr>
		</c:forEach>
		</table>

</body>
</html>