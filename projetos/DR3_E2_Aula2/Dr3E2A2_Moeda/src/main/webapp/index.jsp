<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Conversor de Moedas</title>
    </head>
    <body>
        <h1>Conversor de Moedas</h1>
        <hr />
        <form method="post" action="ConversorServlet">
            <select name="tipo">
                <option>Dolar</option>
                <option>Euro</option>
                <option>Real</option>
            </select>
            <input type="text" name="valor" value="${param.valor}" />
            <input type="submit" value="Converter" />
        </form>
        <%-- ============================================================== --%>
        <c:if test="${not empty erro}">    
            <h3 style="color: red">${erro}</h3>
        </c:if>
        <%-- ============================================================== --%>
        <c:if test="${not empty moeda}">
            <fmt:setLocale value="en_US" />
            <h3 style="color: green">Dolar - <fmt:formatNumber type="currency" value="${moeda.dolar}" /></h3>
            <fmt:setLocale value="pt_PT" />
            <h3 style="color: green">Euro - <fmt:formatNumber type="currency" value="${moeda.euro}" /></h3>
            <fmt:setLocale value="pt_BR" />
            <h3 style="color: green">Real - <fmt:formatNumber type="currency" value="${moeda.real}" /></h3>
        </c:if>
    </body>
</html>
