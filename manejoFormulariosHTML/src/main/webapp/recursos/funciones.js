
function validarForma(form){

    var usuario =  form.usuario;
    if(usuario.value == "" || usuario.value == "Escribir usuario"){
        alert("You must provide a username");
        usuario.focus();
        usuario.select();
        return false;        
    }
    var password = form.password;
    if(password.value == ""|| password.value.length <5){
        alert("You must provide a password of at least 5 characters");
        password.focus();
        password.select();
        return false;
    }
    var tecnologias = form.tecnologia;
    var checkSeleccionado =  false;
    
    for (var i = 0; i<tecnologias.length;i++) {
        if(tecnologias[i].checked){
            checkSeleccionado=true;
        }        
    }
    if(!checkSeleccionado){
        alert("You must select at least one technology");
        return false;
    }
    
    var generos =  form.genero;
    var radioSeleccionado = false;
    
    for (var i = 0; i<generos.length;i++) {
        if(generos[i].checked){
            radioSeleccionado=true;
        }        
    }
    if(!radioSeleccionado){
        alert("You must select at least one gender");
        return false;
    }
    var ocupacion = form.ocupacion;
    if(ocupacion.value==""){
        alert("You must select an occupation")
        return false;
    }
    
    var musica = form.musica;
    if(musica.value==""){
        alert("You must select an musica")
        return false;
    }

    // Formulario ok
    alert("Valid form, sending data to the server");
    return true;
}
