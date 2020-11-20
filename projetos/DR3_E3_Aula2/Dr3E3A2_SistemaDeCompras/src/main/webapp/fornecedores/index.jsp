<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sistema de Compras</title>
    </head>
    <body>
        <h1>Sistema de Compras - Fornecedores</h1>
        <hr />
        <a href="../index.jsp">Início</a> | 
        <a href="../contatos/index.jsp">Contatos</a> | 
        <a href="../produtos/index.jsp">Produtos</a> |
        <a href="../cotacoes/index.jsp">Cotações</a>
        <hr />
        <form method="post" action="cadastrar">
            <table>
                <tr>
                    <td>Nome de Fantasia</td>
                    <td><input type="text" name="nomeFantasia" value="${fornecedor.nomeFantasia}" /></td>
                </tr>
                <tr>
                    <td>Razão Social</td>
                    <td><input type="text" name="razaoSocial" value="${fornecedor.razaoSocial}" /></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" value="Cadastrar" />
                    </td>
                </tr>
            </table>
        </form>
        <c:if test="${not empty sucesso}">
            <h3 style="color: green">${sucesso}</h3>
        </c:if>
        <c:forEach var="erro" items="${erros}">
            <h3 style="color: red">${erro.defaultMessage}</h3>
        </c:forEach>
    </body>
</html>
