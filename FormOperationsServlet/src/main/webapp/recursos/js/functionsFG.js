window.onload = function(){
    document.getElementById("btnCalculate").onclick = calculateFG;
};

function calculateFG() {
    var a = document.getElementById('txtA').value;
    var b = document.getElementById('txtB').value;
    var c = document.getElementById('txtC').value;
    var txtX1 = document.getElementById('txtX1');
    var txtX2 = document.getElementById('txtX2');
    var x1 = ((-b)+(Math.sqrt(Math.pow(b,2)-(4*a*c))))/(2*a);
    var x2 = ((-b)-(Math.sqrt(Math.pow(b,2)-(4*a*c))))/(2*a);
    txtX1.innerHTML = "X₁: " + x1;
    txtX2.innerHTML = "X₂: " + x2;
}

