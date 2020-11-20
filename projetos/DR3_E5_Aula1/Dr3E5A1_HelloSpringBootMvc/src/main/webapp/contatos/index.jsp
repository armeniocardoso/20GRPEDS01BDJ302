<%@page contentType="text/html" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <title>Sistema Integrado de Gestão</title>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/estilos.css" media="screen" />
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/jquery-ui-1.8.16.custom.css" media="screen" />
    <center>
        <br />
        <form method="post" action="CadastrarContato">
            <div style="width: 600px">
                <div class="cabecForm">
                    Lista de Telefones
                </div>
                <div class="corpoForm">

                    <table class="tabelaHorizontal">
                        <tr>
                            <th>Nome</th>
                            <td><input type="text" name="nome" size="80" maxlength="150"</td>
                        </tr>
                        <tr>
                            <th>Email</th>
                            <td><input type="text" name="email" size="30" maxlength="50"</td>
                        </tr>
                        <tr>
                            <th>Telefone</th>
                            <td><input type="text" name="fone" size="30" maxlength="50"</td>
                        </tr>
                    </table>                    
                </div>
                <div class="barraBotoes">
                    <input type="submit" value="Salvar" />
                    <input type="Reset" value="Limpar" />
                </div>
                <div class="mensagemSucesso">
                    <p>Contato Cadastrado com Sucesso</p>
                </div>
                <div class="mensagemErro">
                    <p>O campo nome é obrigatório</p>
                </div>
            </div>
        </form>        
    </center>    
</body>
</html>
