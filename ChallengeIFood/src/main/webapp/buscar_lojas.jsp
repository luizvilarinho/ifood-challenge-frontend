<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Challenge IFOOD</title>
    <link rel="stylesheet" type="text/css" href="./css/bootstrap.min.css" />
    <link rel="stylesheet" type="text/css" href="./css/styles.css" />
</head>
<body>
    <main>
        <section id="menu-area">
            <article class="logo-container">
                <img width="120" src="./img/logo-ifood.png" />
            </article>
            <article class="menu">
                <ul>
                    <li><a href="index.html#endereco">Endereço</a></li>
                    <li><a href="index.html#atividade">Atividade</a></li>
                    <li><a href="buscar_lojas.jsp">Buscar Lojas</a></li>
                </ul>
            </article>
        </section>
        <section id="container-area">
            <article class="mb-5">
                <h3 id="title" class="text-secondary">Buscar</h3>
            </article>
            <article>
                <div id="search-container" class="row">
                    <div class="mb-3 col-sm-6">
                        <label for="buscar" class="form-label">Buscar</label>
                        <input type="search" class="form-control" id="buscar" aria-describedby="buscar" placeholder="pesquisa por nome">
                        <div id="buscar" class="form-text">Campo obrigatório</div>
                    </div>
                    <article class="col-sm-6">
                        <button type="button" id="btn-buscar" type="button" class="btn btn-primary mt-5">buscar</button>
                    </article>
                </div>     
            </article>
            

            <article class="mt-5">
                <div class="row mb-3">
                    <h4 class="">Resultado</h4>
                </div>
                <div class="row ">
                    <dl>
                        <dt class="text-secondary">Endereço Completo</dt>
                        <dd>Rua Soldado Romeu Cocco, 91. Jd. Frizzo, Guarulhos - SP</dd>
                    </dl>
                    <dl>
                        <dt class="text-secondary">Ramo Atividade</dt>
                        <dd>Comida caseira </dd>
                    </dl>
                    <dl>
                        <dt class="text-secondary">Raio de entrega</dt>
                        <dd>12 km </dd>
                    </dl>
                    <dl>
                        <dt class="text-secondary">Possui Pratos veganos</dt>
                        <dd>Não</dd>
                    </dl>
                </div>
            </article>
            <article class="col-sm-6">
                <button type="button" id="btn-atualizar" type="button" class="btn btn-primary mt-5">Atualizar</button>
            </article>
        </section>

    </main>


    <script src="./js/scripts.js"></script>
</body>
</html>