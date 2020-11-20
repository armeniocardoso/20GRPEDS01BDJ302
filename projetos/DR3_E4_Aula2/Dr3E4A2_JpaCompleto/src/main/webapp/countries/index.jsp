<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%-- ====================================================================== --%>
<%-- Se a lista de atores não estiver presente, vai buscar                  --%>
<c:if test="${empty countries && empty message}">
    <jsp:forward page="listar" />
</c:if>
<%-- ====================================================================== --%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sakila</title>
        <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.20/css/jquery.dataTables.css">
        <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
        <script src="https://cdn.datatables.net/1.10.20/js/jquery.dataTables.min.js"></script>
        <script>
            $(document).ready(function () {

                $('#countries').DataTable({
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
        <h1>Sakila - Countries</h1>
        <hr />
        <a href="manter.jsp">Inserir</a>
        <hr />
        <c:choose>
            <c:when test="${not empty countries}">
                <div  style="width: 500px">
                    <table id="countries">
                        <thead>
                            <tr>
                                <th>ID</th>
                                <th>Country</th>
                                <th>Last Update</th>
                                <th>Cities</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="country" items="${countries}">

                                <tr>
                                    <td>
                                        ${country.countryId}
                                    </td>
                                    <td>
                                        ${country.country}
                                    </td>
                                    <td>
                                        ${country.lastUpdate}
                                    </td>
                                    <td>
                                        <table>
                                            <tr>
                                                <th>ID</th>
                                                <th>City</th>
                                                <th>Last Update</th>
                                            </tr>
                                            <c:forEach var="city" items="${country.cityList}">
                                                <tr>
                                                    <td>${city.cityId}</td>
                                                    <td>${city.city}</td>
                                                    <td>${city.lastUpdate}</td>
                                                </tr>
                                            </c:forEach>
                                        </table>
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
