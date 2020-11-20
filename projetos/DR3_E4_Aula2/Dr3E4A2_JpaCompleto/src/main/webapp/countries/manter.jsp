<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sakila</title>
    </head>
    <body>
        <h1>Sakila - Countries</h1>
        <form method="post" action="cadastrar">            
            <table>
                <tr>
                    <td>País</td>
                    <td><input type="text" name="pais" /></td>
                </tr>
                <tr>
                    <td>Cidades</td>
                    <td><input type="text" name="cidades" /></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" value="Cadastrar" />
                    </td>
                </tr>
            </table>
        </form>
    </body>
</html>
