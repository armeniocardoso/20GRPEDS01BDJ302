<%@page contentType="text/html" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <title>Sistema Integrado de Gestão</title>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/estilos.css" media="screen" />
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/jquery-ui-1.8.16.custom.css" media="screen" />
    </head>
    <body>
        <center>
            <br />
            <h3>Protótipo do SIGE</h3>
            <div class="mensagemInformacao" style="width:550px">
                <p><strong>Objetivo desta Tela:</strong></p>
                <p>
                    As telas do Módulo de Segurança são reservadas ao Administrador
                    do SIGE.
                </p>
                <p>
                    Aqui será possível cadastrar as Credenciais de Acesso 
                    (login e senha), Grupos e Recursos (endereços do SIGE
                    que o Usuário terá acesso).
                </p>
                <p>
                    Um outro recurso é a Auditoria que permitirá verificar 
                    Quem, Quando, Onde (IP) e O Que (que operação foi executada, 
                    como estava antes e como ficou).
                </p>
                <p>
                    Todas as operações do SIGE serão registradas e poderão ser
                    consultadas por Usuário, Data Inicial e Final, Módulo e 
                    Operação - inclusão, exclusão, alteração ou consulta.
                </p>
            </div>               
        </center>        
    </body>
</html>
