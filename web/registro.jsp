<%-- 
    Document   : registro
    Created on : 22/07/2016, 09:04:44 AM
    Author     : Juan Pablo Guzmán G
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrarse</title>
    </head>
    <body>
        <h1>Formulario de Registro IKEA</h1>
        <form action="nuevoempleado" method="post">
            <label>Identificacion</label>
            <input type="text" name=identificacion" /><br>
            <label>Nombre</label>
            <input type="text" name="nombre" /><br>
            <label>Apellido</label>
            <input type="text" name="apellido" /><br>
            <label>Area</label>
            <input type="text" name="area" /><br>
            <label>Departamento</label>
            <input type="text" name="departamento" /><br>
            <label>Cargo</label>
            <input type="text" name="cargo" /><br>
            <label>Salario</label>
            <input type="text" name="salario" /><br>
            <label>Estado</label>
            <input type="text" name="estado" /><br>
            <label>Rol</label>
            <input type="text" name="rol" /><br>
            <label>Contraseña</label>
            <input type="text" name="contrasena" /><br>
            <input type="submit" value="Registrarme"  />
        </form>
    </body>
</html>
