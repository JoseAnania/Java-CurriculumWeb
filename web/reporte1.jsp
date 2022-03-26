<%-- 
    Document   : reporte1
    Created on : 04-feb-2019, 15:07:17
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
        <h1>Reporte 1</h1>
        
        <table border="1">
            
            <tr><th>Pais</th><th>Cantidad</th></tr>
            
            <c:forEach items="${lista}" var="N">
                <tr><td>${N.pais}</td><td>${N.cantidad}</td></tr>
            </c:forEach>
        </table>
        <br>
        <br>
        <a href="index.html">Volver</a>
    </body>
</html>
