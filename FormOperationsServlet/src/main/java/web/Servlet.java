package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;
@WebServlet("/Servlet")

public class Servlet extends HttpServlet{
    //Llamada a través del navegador
    @Override    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{      
        //Enviar parametroos a otra pagina html
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        //Leer parametros del formulario
        String operacion = request.getParameter("operacion");
        switch(operacion){
            case "Formula General":
                out.print("<html>");
                out.print("<head>");
                out.print("<title>" + toUpperCase(operacion) + "</title>");
                out.print("<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>");
                out.print("<link rel='stylesheet' href='recursos/css/style.css'>");
                out.print("<link rel='stylesheet' href='recursos/css/normalize.css'>");
                out.print("<link rel='stylesheet' href='https://fonts.googleapis.com/css2?family=Lato:wght@300;400;700;900&display=swap'>"); 
                out.print("<script type='text/javascript' src='recursos/js/functionsFG.js'></script>");
                out.print("</head>");
                out.print("<body>");
                out.print("<header class='site-header'>");    
                out.print("<div class='contenedor'>");         
                out.print("<h1>" + toUpperCase(operacion) +"</h1>");
                out.print("</div>");
                out.print("</header>");     
                out.print("<div class='contenedor-form'>");  
                out.print("<h2>AX²+BX+C</h2>");
                out.print("<div class='flex'>");
                out.print("<div class='gar-cob-vig-elements'>");
                out.print("<label for='' class=''>A</label>");
                out.print("<input type='number' id='txtA'>");
                out.print("</div>");
                out.print("<div class='gar-cob-vig-elements'>");
                out.print("<label for='' class=''>B</label>");
                out.print("<input type='number' id='txtB'>");
                out.print("</div>");
                out.print("<div class='gar-cob-vig-elements'>");
                out.print("<label for='' class=''>C</label>");
                out.print("<input type='number' id='txtC'>");
                out.print("</div>");
                out.print("</div>");
                out.print("<label id='txtX1'>X₁: </label>");
                out.print("<label id='txtX2'>X₂: </label>");
                out.print("<button class='boton' id='btnCalculate'>CALCULAR</button>");
                out.print("</div>");
                out.print("</body>");
                out.print("</html>");
            break;
            case "Numeros Primos":
            break;
            case "Tipo de Triangulo":
            break;
        }
    }
}
