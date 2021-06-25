<%-- 
    Author: Fabrício Galende Marques de Carvalho e Maicon
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculadora: resultado da operação</title>
        <style>
            body {
                width: 50%;
                margin: auto;
                text-align: center;     
            }
            #resultado {
                color: red;
            }
        </style>
    </head>
    <body>
        <span id="description">
            A raíz <%=request.getAttribute("indice")%> de <%=request.getAttribute("radicando")%> é
        </span>
        <span id="resultado"><%=request.getAttribute("raizNesima")%></span>
    </body>
</html>
