<%-- 
    Document   : menu
    Created on : 22/07/2016, 09:40:35 AM
    Author     : Juan Pablo Guzmán G
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    HttpSession objSession = request.getSession(false);
    String identificacion = (String)objSession.getAttribute("identificacion");
    if(identificacion.equals("")){
    
        response.sendRedirect("index.jsp");
    }
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menu Administrador</title>
        <style type="text/css">
            * {
                padding:0px;
                margin:0px;
            }
            #header{
                margin: auto;
                width: 1000px;
                font-family: Arial,Helvetica,sans-serif;
            }
            ul, ol{
                list-style:none;  
            }
            .nav li a{
                background-color:#3960a6;
                color:#fff;
                text-decoration: none;
                padding: 10px 15px;
                display:block;
            }
            .nav li a:hover{
                background-color: #434343;
            }
            
            .nav > li{
                float:left;
            }
            .nav li ul{
                display: none;
                position:absolute;
                min-height:140px; 
            }
            .nav li:hover > ul{
                display: block;
            }
            
        </style>
    </head>
    <body>
        <h1>Acceso Correcto - Identificación Empleado <% out.println(identificacion); %></h1><br>
        <div id="header">
            <h2 align="center">Menu Administrador</h2><br>
            <ul class="nav">
                <li><a href="">Áreas</a>
                    <ul>
                        <li><a href="">Registrar Áreas</a>
                        <li><a href="">Consultar Áreas</a>
                        <li><a href="">Modificar Áreas</a>    
                    </ul>
                </li>
                <li><a href="">Departamentos</a>
                    <ul>
                        <li><a href="">Registrar Departamento</a>
                        <li><a href="">Consultar Departamento</a>
                        <li><a href="">Modificar Departamento</a>    
                    </ul>
                </li>
                <li><a href="">Cargos</a>
                    <ul>
                        <li><a href="">Registrar Cargos</a>
                        <li><a href="">Consultar Cargos</a>
                        <li><a href="">Modificar Cargos</a>
                    </ul>   
                </li>
                <li><a href="">Reportes</a>
                    <ul>
                         <li><a href="">Generar Reporte Pantalla</a>
                        <li><a href="">Generar Reporte PDF</a>
                    </ul>  
                </li>
            </ul> 
        </div>
        
    </body>
</html>
