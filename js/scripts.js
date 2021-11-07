function showHideForm(action){
    if(action === 'proximo'){
        document.querySelector('#formEndereco').hidden = true;
        document.querySelector('#btn-proximo').hidden = true;

        document.querySelector('#formAtividade').hidden= false;
        document.querySelector('#btn-voltar').hidden = false;
        document.querySelector('#btn-submit').hidden = false;

        document.querySelector('#title').textContent = 'Atividade'

    }else{
        document.querySelector('#formEndereco').hidden = false;
        document.querySelector('#btn-proximo').hidden = false;

        document.querySelector('#formAtividade').hidden= true;
        document.querySelector('#btn-voltar').hidden = true;

        document.querySelector('#btn-submit').hidden = true;

        document.querySelector('#title').textContent = 'Endereço'

    }
}