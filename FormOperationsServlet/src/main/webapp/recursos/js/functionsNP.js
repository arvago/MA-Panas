window.onload = function(){
    document.getElementById("btnCalculate").onclick = calculateNP;
};

function calculateNP() {
    var cantidad = document.getElementById('txtCantidad').value;
    var txtRes = document.getElementById('txtRes');
    var bandera = true, m, s = 2;
    
    for(var i=1; i<=cantidad; i++){
        bandera = false;
        while(!bandera){
            m = 2;
            bandera = true;
            while(bandera && m < i){
                if(s % m === 0){
                    bandera = false;
                }else{
                    m = m + 1;
                }
            }
            if(bandera){
                txtRes.innerHTML = txtRes.innerText + s + ",";
            }
            s++;
        }
    }
    
}


