<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%-- ====================================================================== --%>
<%-- Se a lista de atores não estiver presente, vai buscar                  --%>
<c:if test="${empty atores && empty mensagem}">
    <jsp:forward page="listar" />
</c:if>
<%-- ====================================================================== --%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sakila - Atores</title>
        <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.20/css/jquery.dataTables.css">
        <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
        <script src="https://cdn.datatables.net/1.10.20/js/jquery.dataTables.min.js"></script>
        <script>
            $(document).ready(function () {

                $('#atores').DataTable({
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
        <h1>Sakila - Atores</h1>
        <hr />
        <c:choose>
            <c:when test="${not empty atores}">
                <div  style="width: 500px">
                    <table id="atores">
                        <thead>
                            <tr>
                                <th>ID</th>
                                <th>Nome</th>
                                <th>Última Atualização</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="ator" items="${atores}">

                                <tr>
                                    <td>
                                        ${ator.actorId}
                                    </td>
                                    <td>
                                        ${ator.firstName}&nbsp;${ator.lastName}
                                    </td>
                                    <td>
                                        ${ator.lastUpdate}
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
