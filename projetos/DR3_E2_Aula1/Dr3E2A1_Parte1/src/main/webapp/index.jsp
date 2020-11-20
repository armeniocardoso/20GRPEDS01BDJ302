<%@page import="java.text.DateFormat"%>
<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JavaServer Pages - Parte 1</title>
    </head>
    <body>
        <h1>JavaServer Pages - Parte 1</h1>
        <hr />
        <%
            DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
            String dataFormatada = df.format(new Date());
            int dia = new Date().getDate();
            out.println("Dia = " + dia);
            if (dia % 2 == 0) {
        %>
        <h3>Hoje é um dia par</h3>
        <%
        } else {
        %>
        <h3>Hoje é um dia ímpar</h3>
        <%
            }
        %>
        <h3>Data de Hoje: <%= dataFormatada%></h3>
        <%-- Comentário de JSP --%>
        <!-- Comentário de HTML --- Data de Hoje: <%= dataFormatada%> -->
    </body>
</html>
