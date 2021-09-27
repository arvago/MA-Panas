function validateOperation(form){  
    var operacion = form.operacion;
    var radioSeleccionado = false;
    
    for (var i = 0; i<operacion.length;i++) {
        if(operacion[i].checked){
            radioSeleccionado=true;
        }        
    }
    if(!radioSeleccionado){
        alert('Error, selecciona una operddwdwdwdacion');
        hasError = true;
    }
    
    // si hay algún error no efectuamos la acción submit del form
    if(hasError) event.preventDefault();
}


