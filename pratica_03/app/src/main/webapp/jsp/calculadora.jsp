<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head> 
        <title>Calculadora</title>
        <meta charset="utf-8">
        <style>
            form {
                width: 50%;
                margin: auto;
                text-align: center;     
            }
        </style>
    </head>
    <body>
        <form method="post" action="raizNesima.action">
            Raíz <input type="number" name="indice" step="any"/> de
            <input type="number" name="radicando" step="any"/>
            <input id="raizSubmit" value="CALCULAR" type="submit"/>
        </form>
    </body>    
</html>
