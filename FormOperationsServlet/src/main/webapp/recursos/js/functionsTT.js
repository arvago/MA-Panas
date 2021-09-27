window.onload = function(){
    document.getElementById("btnCalculate").onclick = calculateFG;
};

function calculateFG() {
    var a = document.getElementById('txtA').value;
    var b = document.getElementById('txtB').value;
    var c = document.getElementById('txtC').value;
    var txtRes = document.getElementById('txtRes');
    
    if((a === b) && (b === c)){
        txtRes.innerHTML = "TRIÁNGULO: Equilatero";
    }else if((a === b) || (a === c) || (b === c)){
            txtRes.innerHTML = "TRIÁNGULO: Isosceles";
    }else{
        txtRes.innerHTML = "TRIÁNGULO: Escaleno";
    }  
};



