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
                    Aqui o usuário do SIGE acessa o cadastro de TODOS os Documentos ligados 
                    a uma Unidade Operacional, sejam estes Contratos, Aditivos e Normas.
                </p>
                <p>
                    O usuário seleciona a Unidade Operacional em uma lista (drop-down)
                    e acessa a lista de Documentos daquela Unidade.
                </p>
                <p>
                    Os documentos deverão ser "subidos" para o sistema (upload) 
                    no formato PDF.
                </p>
                <p>
                    Essa tela permitirá a manutenção do cadastro além da sua consulta.
                </p>
            </div>               
        </center>        
    </body>
</html>
