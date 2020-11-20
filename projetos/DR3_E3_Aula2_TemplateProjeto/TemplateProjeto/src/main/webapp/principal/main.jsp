<%@page contentType="text/html" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
   <head>
      <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
      <title>SIGE - Sistema Integrado de Gestão GEPark</title>
      <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/estilos.css" media="screen" />
      <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/jquery-ui-1.8.16.custom.css" media="screen" />
   </head>
   <body>
      <center>
         <br />
         <h3>Últimas Mensagens</h3>
         <div class="mensagemAlerta" style="width:550px">
            <p><strong>Atenção:</strong></p>
            <p>Existem Ordens de Serviço pendentes para serem aprovadas.</p>
         </div>
         <br>
         <div class="mensagemInformacao" style="width:550px">
            <p><strong>Informação:</strong></p>
            <p>Novos Usuários solicitaram acesso ao sistema.</p>
         </div>
      </center>
   </body>
</html>
