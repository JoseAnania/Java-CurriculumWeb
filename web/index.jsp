<%-- 
    Document   : index
    Created on : 04-feb-2019, 14:06:47
    Author     : José
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Curriculum Vitae</title>
    </head>
    <body>
        <h1>Menu</h1>
        <div>
            <a href="ServletAltaAspirante">1) Carga de Aspirantes</a>
            <br>
            <a href="ServletListaAspirante">2) Lista de Aspirantes</a>
            <br>
            3) Reportes
            <ul>
                <li><a href="ServletReporte1">Cantidad de aspirantes por Nacionalidad</a></li>
                <li><a href="ServletReporte2">Aspirante con menor sueldo pretendido</a></li>
                <li><a href="ServletReporte3">Promedio de Sueldos pretendidos por "Seniors</a></li>
            </ul>
        </div>
    </body>
</html>
