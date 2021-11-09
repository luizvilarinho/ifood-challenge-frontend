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
                    <li><a href="#" onclick="showHideForm('voltar')">Endereço</a></li>
                    <li><a href="#" onclick="showHideForm('proximo')">Atividade</a></li>
                </ul>
            </article>
        </section>
        <section id="container-area">
            <article class="mb-5">
                <h3 id="title" class="text-secondary">Endereço</h3>
            </article>
            <article>
                <form action="LojaController?action=cadastroLoja" method="post">
                    <div id="formEndereco" class="row">
                        <div class="mb-3 col-sm-3">
                            <label for="exampleInputEmail1" class="form-label">CEP</label>
                            <input type="text" class="form-control" name="cep" aria-describedby="cep" name="cep">
                            <div id="cep" class="form-text">Campo obrigatório</div>
                        </div>
                        <div class="mb-3 col-sm-7">
                            <label for="exampleInputEmail1" class="form-label">Logradouro</label>
                            <input type="text" class="form-control" name="logradouro" aria-describedby="logradouro">
                            <div id="logradouro" class="form-text">Campo obrigatório</div>
                        </div>
                        <div class="mb-3 col-sm-2">
                            <label for="exampleInputEmail1" class="form-label">Número</label>
                            <input type="text" class="form-control" name="numero" aria-describedby="numero" name="numero">
                            <div id="numero" class="form-text">Campo obrigatório</div>
                        </div>
                        <div class="mb-3 col-sm-3">
                            <label for="exampleInputEmail1" class="form-label">Bairro</label>
                            <input type="text" class="form-control" name="bairro" aria-describedby="bairro">
                            <div id="bairro" class="form-text">Campo obrigatório</div>
                        </div>
                        <div class="mb-3 col-sm-7">
                            <label for="exampleInputEmail1" class="form-label">Cidade</label>
                            <input type="text" class="form-control" name="cidade" aria-describedby="cidade">
                            <div id="cidade" class="form-text">Campo obrigatório</div>
                        </div>
                        <div class="mb-3 col-sm-2">
                            <label for="exampleInputEmail1" class="form-label">Estado</label>
                            <select name="estado" class="form-select" aria-label="estado" aria-describedby="estado">
                                <option selected>selecione</option>
                                <option value="AC">Acre</option>
                                <option value="AL">Alagoas</option>
                                <option value="AP">Amapá</option>
                                <option value="AM">Amazonas</option>
                                <option value="BA">Bahia</option>
                                <option value="CE">Ceará</option>
                                <option value="DF">Distrito Federal</option>
                                <option value="ES">Espírito Santo</option>
                                <option value="GO">Goiás</option>
                                <option value="MA">Maranhão</option>
                                <option value="MT">Mato Grosso</option>
                                <option value="MS">Mato Grosso do Sul</option>
                                <option value="MG">Minas Gerais</option>
                                <option value="PA">Pará</option>
                                <option value="PB">Paraíba</option>
                                <option value="PR">Paraná</option>
                                <option value="PE">Pernambuco</option>
                                <option value="PI">Piauí</option>
                                <option value="RJ">Rio de Janeiro</option>
                                <option value="RN">Rio Grande do Norte</option>
                                <option value="RS">Rio Grande do Sul</option>
                                <option value="RO">Rondônia</option>
                                <option value="RR">Roraima</option>
                                <option value="SC">Santa Catarina</option>
                                <option value="SP">São Paulo</option>
                                <option value="SE">Sergipe</option>
                                <option value="TO">Tocantins</option>
                            </select>
                            <div id="estado" class="form-text">Campo obrigatório</div>
                        </div>
                        
                    </div>

                    <div id="formAtividade" hidden class="row">
                        <div class="mb-3 col-sm-3">
                            <label for="ramo-atividade" class="form-label">Ramo de atividade</label>
                            <input type="text" class="form-control" id="ramo-atividade" aria-describedby="atividade" name="ramo">
                            <div id="atividade" class="form-text">Ramo de atividade</div>
                        </div>
                        <div class="mb-3 col-sm-3">
                            <label for="ramo-atividade" class="form-label">Nome</label>
                            <input type="text" class="form-control" id="ramo-atividade" aria-describedby="atividade" name="nome">
                            <div id="atividade" class="form-text">Nome</div>
                        </div>
                        <div class="mb-3 col-sm-3">
                            <label for="raio-entrega" class="form-label">Raio de entrega</label>
                            <input type="number" class="form-control" placeholder="km" id="raio-entrega" aria-describedby="raioEntrega" name="raioentrega">
                            <div id="raioEntrega" class="form-text">Campo obrigatório</div>
                        </div>
                        <div class="mb-3 col-sm-3">
                            <label for="sim" class="form-label">Possui pratos veganos?</label><br>
                            <input type="radio" class="form-check-input" name="pratovegano" id="sim" value="sim" aria-describedby="pratosVeganos" >
                            <label for="sim" class="form-label me-5">Sim</label>
                            <input type="radio" name="prato-vegano"  class="form-check-input" id="nao" value="nao" aria-describedby="pratosVeganos">
                            <label for="nao" class="form-label">Nao</label>
                            <div id="pratosVeganos" class="form-text">Campo obrigatório</div>
                        </div>
                    </div>
                    
                     <div class="row">
                <article class="text-end">
                    <button id="btn-proximo" type="button" onclick="showHideForm('proximo')" class="btn btn-link mt-5">Próximo</button>
                </article>
                <article class="text-start col-sm-6">
                    <button type="button" id="btn-voltar"  hidden onclick="showHideForm('voltar')" class="btn btn-link mt-5">voltar</button>
                </article>
                <article class="text-end col-sm-6">
                    <button hidden type="submit" id="btn-submit" type="button" class="btn btn-primary mt-5">Enviar</button>
                </article>

            </div>
                    
                </form>
            </article>
           
        </section>

    </main>


    <script src="./js/scripts.js"></script>
</body>
</html>