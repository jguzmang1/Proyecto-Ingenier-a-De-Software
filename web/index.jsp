<%-- 
    Document   : Index
    Created on : 19/07/2016, 08:40:44 AM
    Author     : Juan Pablo Guzmán G
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>IKEA</title>
        <script src="js/main.js"></script>
        <link rel="stylesheet" href="css/style.css">
    </head>
    <body>
        
        <form class="login" action="iniciar" method="post" id="forminicio">
            <h1>Iniciar Sesión IKEA</h1>
            <label>Identificación</label>
            <input type="text" class="login-input" name="identificacion" id="txtidentificacion" /><br>
            <label>Contraseña</label>
            <input type="Contraseña" class="login-input" name="contrasena" id="txtcontrasena" /><br>
            <input type="button" value=" Iniciar Sesión " class="login-submit" id="btniniciar" />
            No tiene una cuenta <a href="registro.jsp">Registrarme</a>
        </form>
    </body>
</html>
