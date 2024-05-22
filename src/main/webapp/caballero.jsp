<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Index Caballeros</title>
    <!-- Bootstrap CSS -->
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container mt-5">
        <table class="table">
            <thead class="thead-dark">
                <tr>
                    <th>ID</th>
                    <th>Nombre</th>
                    <th>Fuerza</th>
                    <th>Experiencia</th>
                    <th>Foto</th>
                    <th>Arma</th>
                    <th>Escudo</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${caballeros}" var="caballero">
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
            </tbody>
        </table>

        <h2 class="mt-5">Agregar Nuevo Caballero</h2>
        <form action="StoreCaballero" method="post">
            <div class="form-group">
                <label for="nombre">Nombre:</label>
                <input type="text" class="form-control" id="nombre" name="nombre" required>
            </div>
            <div class="form-group">
                <label for="fuerza">Fuerza:</label>
                <input type="number" class="form-control" id="fuerza" name="fuerza" required>
            </div>
            <div class="form-group">
                <label for="experiencia">Experiencia:</label>
                <input type="number" class="form-control" id="experiencia" name="experiencia" required>
            </div>
            <div class="form-group">
                <label for="foto">Foto:</label>
                <input type="text" class="form-control" id="foto" name="foto">
            </div>
            <div class="form-group">
                <label for="arma">Arma:</label>
                <input type="text" class="form-control" id="arma" name="arma">
            </div>
            <div class="form-group">
                <label for="escudo">Escudo:</label>
                <input type="text" class="form-control" id="escudo" name="escudo">
            </div>
            <button type="submit" class="btn btn-success">Agregar Caballero</button>
        </form>
    </div>

    <!-- Bootstrap JS -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
