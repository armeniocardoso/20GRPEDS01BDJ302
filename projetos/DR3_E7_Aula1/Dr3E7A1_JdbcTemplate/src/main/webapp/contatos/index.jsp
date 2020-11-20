<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%-- ====================================================================== --%>
<%-- Se a lista de contatos não estiver presente, vai buscar                  --%>
<c:if test="${empty contatos && empty mensagem}">
    <jsp:forward page="listar" />
</c:if>
<%-- ====================================================================== --%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sakila</title>
        <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.20/css/jquery.dataTables.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">        
        <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
        <script src="https://cdn.datatables.net/1.10.20/js/jquery.dataTables.min.js"></script>
        <script>
            $(document).ready(function () {

                $('#contatos').DataTable({
                    "paging": true,
                    "ordering": true,
                    "info": true,
                    "language": {
                        "url": "https://cdn.datatables.net/plug-ins/1.10.20/i18n/Portuguese-Brasil.json"
                    }
                });
            });
        </script>        
    </head>
    <body>
        <h1>Sakila - Contatos</h1>
        <form method="post" action="salvar">
            <table style="border: 1px solid #CCC; width: 600px">
                <tr>
                    <td>ID</td>
                    <td>
                        <input type="text" name="id" size="3" readonly="true" 
                               value="${contato.id}" />
                    </td>
                </tr>
                <tr>
                    <td>Nome</td>
                    <td>
                        <input type="text" name="nome" size="80" maxlength="100" 
                               value="${contato.nome}" />
                    </td>
                </tr>
                <tr>
                    <td>Email</td>
                    <td>
                        <input type="text" name="email" size="50" maxlength="50"
                               value="${contato.email}" />
                    </td>
                </tr>
                <tr>
                    <td>Telefone</td>
                    <td>
                        <input type="text" name="fone" size="50" maxlength="50"
                               value="${contato.fone}" />
                    </td>
                </tr>
                <tr>
                    <td colspan="2" align="center">
                        <input type="submit" value="Salvar" />
                    </td>
                </tr>
            </table>
        </form>
        <c:forEach var="erro" items="${erros}">
            <h4 style="color: red">${erro.defaultMessage}</h4>
        </c:forEach>                    
        <br />
        <c:choose>
            <c:when test="${not empty contatos}">
                <div  style="width: 600px">
                    <table id="contatos"  style="border: 1px solid #CCC">
                        <thead>
                            <tr>
                                <th>ID</th>
                                <th>Nome</th>
                                <th>Email</th>
                                <th>Telefone</th>
                                <th>&nbsp;</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="contato" items="${contatos}">
                                <tr>
                                    <td>
                                        ${contato.id}
                                    </td>
                                    <td>
                                        ${contato.nome}
                                    </td>
                                    <td>
                                        ${contato.email}
                                    </td>
                                    <td>
                                        ${contato.fone}
                                    </td>
                                    <td>
                                        <a href="obter?id=${contato.id}">
                                            <span class="material-icons">edit</span>
                                        </a>
                                    </td>
                                </tr>
                            </c:forEach>                    
                        <tbody>
                    </table>
                </div>
            </c:when>
            <c:when test="${not empty mensagem}">
                <h3 style="color: blue">
                    ${mensagem}
                </h3>
            </c:when>
        </c:choose>
    </body>
</html>
