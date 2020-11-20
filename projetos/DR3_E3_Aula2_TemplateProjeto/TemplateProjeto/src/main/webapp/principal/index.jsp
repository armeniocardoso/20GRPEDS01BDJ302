<%@page contentType="text/html" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="appPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <title>Sistema Integrado de Gestão</title>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/estilos.css" media="screen" />
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/jquery-ui-1.8.16.custom.css" media="screen" />
        <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.6.2.min.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-ui-1.8.16.custom.min.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.layout.min.js"></script>
        <script type="text/javascript">

            var myLayout;

            $(document).ready(function () {
                myLayout = $('body').layout({
                    north: {
                        spacing_open: 0,
                        togglerLength_open: 0,
                        togglerLength_closed: -1,
                        resizable: false,
                        slidable: false,
                        fxName: "none",
                        size: 65
                    },
                    west: {
                        spacing_open: 1,
                        togglerLength_open: 0,
                        togglerLength_closed: -1,
                        resizable: false,
                        slidable: false,
                        fxName: "none",
                        size: 230
                    },
                    south: {
                        spacing_open: 1,
                        togglerLength_open: 0,
                        togglerLength_closed: -1,
                        resizable: false,
                        slidable: false,
                        fxName: "none",
                        size: 10
                    }
                });

                $("#accordion").accordion({ fillSpace:	true });
            });
            $(function(){
                $(".btn").button();
            });
        </script>
    </head>
    <body>

        <div class="ui-layout-north"  style="margin-top: 5px">
            <div class="ui-widget">
                <div class="ui-state-default ui-corner-all" style="padding: 0 .7em; height: 70px">
                    <table border="0" width="100%">
                        <tr>
                            <td width="215px">
                                <img src="${pageContext.request.contextPath}/imagens/frames/logoEmpresa.png" height="60px" />
                            </td>
                            <td>
                            </td>                           
                            <td style="width: 60px;">
                                <a href="#" class="btn" style="width: 60px; height: 50px">
                                    <img src="${pageContext.request.contextPath}/imagens/icones/32x32/apps/kgpg.png" style="width: 20px;vertical-align: middle;border: none" alt="Trocar Senha" />
                                    <p style="margin: 0; font-size: 8pt">Senha</p>
                                </a>
                            </td>
                            <td style="width: 60px;">
                                <a href="#" class="btn" style="width: 60px; height: 50px">
                                    <img src="${pageContext.request.contextPath}/imagens/icones/32x32/actions/exit.png" style="width: 20px;border: none" alt="Sair" />
                                    <p style="margin: 0; font-size: 8pt">Sair</p>
                                </a>
                                <a href="#">

                                </a>
                            </td>
                        </tr>
                    </table>
                </div>
            </div>
        </div>

        <div class="ui-layout-west">
            <div id="accordion" class="basic">
                <h3><a href="principal">Principal</a></h3>
                <div style="padding: 0">
                    <div class="menu">
                        <a href="${pageContext.request.contextPath}/contatos/index.jsp" class="btn" target="mainFrame">
                            <img src="${pageContext.request.contextPath}/imagens/icones/32x32/apps/linphone.png" />
                            Lista de Telefones
                        </a>
                        <a href="${pageContext.request.contextPath}/funcionarios/index.jsp" class="btn" target="mainFrame">
                            <img src="${pageContext.request.contextPath}/imagens/icones/32x32/actions/edit_group.png" />
                            Funcionários
                        </a>
                    </div>                    
                </div>
                <h3><a href="principal">Unidades Operacionais</a></h3>
                <div style="padding: 0">
                    <div class="menu">
                        <a href="${pageContext.request.contextPath}/principal/prototipo/unidades.jsp" class="btn" target="mainFrame">
                            <img src="${pageContext.request.contextPath}/imagens/icones/32x32/apps/fortress.png" />
                            Unidades
                        </a>
                        <a href="${pageContext.request.contextPath}/principal/prototipo/contatos.jsp" class="btn" target="mainFrame">
                            <img src="${pageContext.request.contextPath}/imagens/icones/32x32/actions/agt_family.png" />
                            Contatos
                        </a>   
                        <a href="${pageContext.request.contextPath}/principal/prototipo/empresas.jsp" class="btn" target="mainFrame">
                            <img src="${pageContext.request.contextPath}/imagens/icones/32x32/actions/money.png" />
                            Empresas
                        </a>
                        <a href="${pageContext.request.contextPath}/principal/prototipo/estatisticas.jsp" class="btn" target="mainFrame">
                            <img src="${pageContext.request.contextPath}/imagens/icones/32x32/mimetypes/kchart_chrt.png" />
                            Estatísticas
                        </a>                        
                        <a href="${pageContext.request.contextPath}/principal/prototipo/tabelas_precos.jsp" class="btn" target="mainFrame">
                            <img src="${pageContext.request.contextPath}/imagens/icones/32x32/apps/kspread.png" />
                            Tabelas de Preços
                        </a>
                        <a href="${pageContext.request.contextPath}/principal/prototipo/documentos.jsp" class="btn" target="mainFrame">
                            <img src="${pageContext.request.contextPath}/imagens/icones/32x32/mimetypes/mime_postscript.png" />
                            Documentos
                        </a>
                    </div>
                </div>                
                <h3><a href="principal">Infraestrutura</a></h3>
                <div style="padding: 0">
                    <div class="menu">
                        <a href="${pageContext.request.contextPath}/principal/prototipo/infra_estatisticas.jsp" class="btn" target="mainFrame">
                            <img src="${pageContext.request.contextPath}/imagens/icones/32x32/mimetypes/kchart_chrt.png" />
                            Estatísticas
                        </a>
                        <a href="${pageContext.request.contextPath}/principal/prototipo/equipamentos.jsp" class="btn" target="mainFrame">
                            <img src="${pageContext.request.contextPath}/imagens/icones/32x32/apps/systemtray.png" />
                            Equipamentos
                        </a>
                    </div>
                </div>
                <h3><a href="principal">Segurança</a></h3>
                <div style="padding: 0">
                    <div class="menu">                        
                        <a href="${pageContext.request.contextPath}/principal/prototipo/seguranca.jsp" class="btn" target="mainFrame">
                            <img src="${pageContext.request.contextPath}/imagens/icones/32x32/actions/identity.png" />
                            Usuários
                        </a>
                        <a href="${pageContext.request.contextPath}/principal/prototipo/seguranca.jsp" class="btn" target="mainFrame">
                            <img src="${pageContext.request.contextPath}/imagens/icones/32x32/actions/agt_forum.png" />
                            Grupos
                        </a>      
                        <a href="${pageContext.request.contextPath}/principal/prototipo/seguranca.jsp" class="btn" target="mainFrame">
                            <img src="${pageContext.request.contextPath}/imagens/icones/32x32/actions/personal.png" />
                            Recursos
                        </a>                        
                        <a href="${pageContext.request.contextPath}/principal/prototipo/seguranca.jsp" class="btn" target="mainFrame">
                            <img src="${pageContext.request.contextPath}/imagens/icones/32x32/apps/wifi.png" />
                            Auditoria
                        </a>
                    </div>
                </div>
                <h3><a href="principal">Tabelas Básicas</a></h3>
                <div style="padding: 0">
                    <div class="menu">                        
                        <a href="${pageContext.request.contextPath}/principal/prototipo/cadastros.jsp" class="btn" target="mainFrame">
                            <img src="${pageContext.request.contextPath}/imagens/icones/32x32/apps/kfm.png" />
                            Cadastros
                        </a>
                    </div>
                </div>                
            </div>
        </div>
        <iframe
            id="mainFrame"
            name="mainFrame"
            class="ui-layout-center ui-state-active ui-corner-all"
            width="100%"
            height="100%"
            frameborder="0"
            scrolling="auto"
            src="${pageContext.request.contextPath}/principal/main.jsp">
        </iframe>
        <div class="ui-layout-south">
            <div class="ui-widget">
                <div class="ui-state-default ui-corner-all" style="padding: 0 .7em;">
                    <p>&nbsp;</p>
                </div>
            </div>
        </div>
    </body>
