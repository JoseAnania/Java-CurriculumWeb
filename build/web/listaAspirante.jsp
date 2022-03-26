<%-- 
    Document   : listaAspirante
    Created on : 04-feb-2019, 14:51:45
    Author     : José
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Curriculum Vitae</title>
    </head>
    <body>
        <h1>Listado de Aspirantes</h1>
        
        <table border="1">
            
            <tr><th>Puesto</th><th>Experiencia</th><th>Aspirante</th><th>Sueldo</th><th>Antiguedad</th></tr>
            
            <c:forEach items="${lista}" var="A">
                <tr><td>${A.nombreP}</td><td>${A.experiencia}</td><td>${A.nombreA}</td><td>${A.salario}</td><td>${A.antiguedad}</td></tr>
            </c:forEach>
        </table>
        <br>
        <br>
        <a href="index.html">Volver</a>
    </body>
</html>

