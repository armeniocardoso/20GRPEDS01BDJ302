<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Simple Form</title>
    </head>
    <body>
        <h1>Simple Form</h1>
        <hr />
        <form method="post" action="SimpleFormServlet">
            <table border="1">
                <tr>
                    <td>Nome</td>
                    <td><input type="text" name="nome" size="80" maxlength="150" /></td>
                </tr>
                <tr>
                    <td>Senha</td>
                    <td><input type="password" name="senha" size="10" maxlength="8" /></td>
                </tr>
                <tr>
                    <td>Cor</td>
                    <td>
                        <input type="radio" name="cor" value="vermelho" /> Vermelho
                        <input type="radio" name="cor" value="verde" /> Verde
                        <input type="radio" name="cor" value="azul" /> Azul
                    </td>                
                </tr>            
                <tr>
                    <td>Planetas</td>
                    <td>
                        <select name="planetas" size="5" multiple>
                            <option>Mercúrio</option>
                            <option>Vênus</option>
                            <option>Terra</option>
                            <option>Marte</option>
                            <option>Júpiter</option>
                            <option>Saturno</option>
                            <option>Urano</option>
                            <option>Netuno</option>
                        </select>
                    </td>                
                </tr>
                <tr>
                    <td colspan="2" align="center">
                        <input type="submit" value="Cadastrar" />
                    </td>
                </tr>
            </table>
        </form>
    </body>
</html>
