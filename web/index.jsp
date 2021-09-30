<%@page import="conteudo.pag.Conteudo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <title>Clubes de Futebol</title>
        <style>
            table,th,td{
                border: 1px solid #aaa;
            }
            th,td{
                text-align: center;
                padding: 8px;
            }
        </style>
    </head>
    
    <body>
        <main>
            <center>
                <header>
                    <h1>Clubes de Futebol</h1>
                </header>
                <section>
                    <%
                        Conteudo cont = new Conteudo();

                        out.print(cont.conteudo());
                    %>
                </section>
                <footer>
                    <p>&copy;<em>by Lucas Torres</em></p>
                </footer>
            </center>
        </main>
    </body>
</html>
