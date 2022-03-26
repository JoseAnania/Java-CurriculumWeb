<%-- 
    Document   : altaAspirante
    Created on : 04-feb-2019, 14:38:42
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
        <h1>Carga de Aspirantes</h1>
        
        <form method="post" action="ServletAltaAspirante">
            
            <label form="nombreA">Nombre: </label>
            <input type="text" name="nombreA"/>
            <br>
            <br>
            Puesto: <select name="cboPuesto" id="cboPuesto" required="requiered">
                <option value="" disabled selected> Seleccione el Puesto: </option>
                    <c:forEach items="${lista}" var="P">
                        <option value=${P.idP}>${P.nombreP}</option>
                    </c:forEach>               
            </select>
            <br>
            <br>
            <label form="antiguedad">Antiguedad: </label>
            <input type="text" name="antiguedad"/>
            <br>
            <br>
            <label form="salario">Salario: </label>
            <input type="text" name="salario"/>
            <br>
            <br>
            Nacionalidad: <select name="cboNacionalidad" id="cboNacionalidad" required="requiered">
                <option value="" disabled selected> Seleccione la Nacionalidad: </option>
                    <c:forEach items="${lista2}" var="N">
                        <option value=${N.idN}>${N.pais}</option>
                    </c:forEach>               
            </select>
            <br>
            <br>
            
            <input type="submit" value="Aceptar"/>
        </form>
        <br>
        <br>
        <a href="index.html">Volver</a>
    </body>
</html>
