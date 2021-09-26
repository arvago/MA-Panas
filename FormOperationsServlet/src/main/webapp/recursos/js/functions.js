function validateOperation(form){
    var operacion = document.querySelector('input[name="operacion"]:checked');
    
    if(!operacion) {
      alert('Error, selecciona una operacion');
        hasError = true;
    }
    
    // si hay algún error no efectuamos la acción submit del form
    if(hasError) event.preventDefault();
}