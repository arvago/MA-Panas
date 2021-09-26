package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/Servlet")

public class Servlet extends HttpServlet{
    //Llamada a través del navegador
    @Override    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{      
        //Enviar parametroos a otra pagina html
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        //Leer parametros del formulario
        String operacion = request.getParameter("operacion");
        out.print(operacion);
    }
}
