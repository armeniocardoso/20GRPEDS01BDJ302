<%@page import="java.util.ArrayList"%>
<%@page import="org.apache.commons.lang.StringUtils"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro de Contatos</title>
    </head>
    <body>
        <h1>Cadastro de Contatos</h1>
        <hr />
        <form method="post" action="CadastrarContatoServlet">

            <table border="1">
                <tr>
                    <td>Nome</td>
                    <td><input type="text" name="nome" size="80" maxlength="150" /></td>
                </tr>
                <tr>
                    <td>Email</td>
                    <td><input type="text" name="email" size="55" maxlength="50" /></td>
                </tr>
                <tr>
                    <td>Telefone</td>
                    <td><input type="text" name="fone" size="55" maxlength="50" /></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" value="Cadastrar" />
                    </td>
                </tr>
            </table>
            <%
                String sucesso = (String) request.getAttribute("sucesso");
                if (StringUtils.isBlank(sucesso)) {

                    ArrayList<String> erros = (ArrayList) request.getAttribute("erros");
                    if (erros != null) {
                        
                        for (String erro : erros) {

                            out.println("<h3 style='color: red'>" + erro + "</h3>");
                        }
                    }
                } else {

                    out.println("<h3 style='color: green'>" + sucesso + "</h3>");
                }
            %>
        </form>
    </body>
</html>
