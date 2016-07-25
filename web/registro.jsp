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
        <link rel="stylesheet" href="css/style.css">
    </head>
      <body>
      
        <form class="login" action="nuevoempleado" method="post">
              <h1>Formulario de Registro IKEA</h1>
            <label align="center">Identificacion</label>
            <input type="text" class="login-input" name=identificacion" />
            <label>Nombre</label>
            <input type="text" class="login-input" name="nombre" />
            <label>Apellido</label>
            <input type="text" class="login-input" name="apellido" />
            <label>Área</label><br>
            <select name="" id="">
                <option value="0" >Seleccione Una Opción </option>
                <option value="1">Contable</option>
                <option value="2">Tecnología</option>
                <option value="3">Ventas</option>
                <option value="4">Insumos</option>
            </select><br>
            <br><label>Departamento</label><br>
            <select name="" id="">
                <option value="0" >Seleccione Una Opción </option>
                <option value="1">Contabilidad</option>
                <option value="2">Sistemas</option>
                <option value="3">Comercial</option>
                <option value="4">Compras</option>
            </select><br>
            <br><label>Cargo</label>
            <select name="" id="">
                <option value="0" >Seleccione Una Opción </option>
                <option value="1">Director Comercial</option>
                <option value="2">Director Sistemas</option>
                <option value="3">Auxiliar Comercial</option>
                <option value="4">Director Compras</option>
                <option value="5">Auxiliar Sistemas</option>
                <option value="6">Asesor Comercial</option>
                <option value="7">Auxiliar Compras</option>
            </select><br>
            <label>Salario</label>
            <input type="text" class="login-input" name="salario" />
            <label>Estado</label>
            <select name="" id="">
                <option value="0" >Seleccione Una Opción </option>
                <option value="1">Activo</option>
                <option value="2">Inactivo</option>
            </select><br>
            <label>Rol</label><br>
            <select name="" id="">
                <option value="0" >Seleccione Una Opción </option>
                <option value="1">Administrador</option>
                <option value="2">Empleado</option>
            </select><br>
            <label>Contraseña</label>
            <input type="text" class="login-input"  name="contrasena" />
            <input type="submit" value="Registrarme" class="login-submit" />
        </form>
    </body>
</html>
