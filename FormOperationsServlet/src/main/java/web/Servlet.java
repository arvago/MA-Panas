package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/Servlet")

public class Servlet extends HttpServlet{
    //Llamada a través del navegador
    @Override
    /*protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("Hola mundo desde servlet xd");
    }*/
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        //Leer parametros del formulario
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");
        System.out.println(usuario + password);
        
        //Enviar parametroos a otra pagina html
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("Usuario " + usuario);
        out.println("password " + password);
        out.println("</body>");
        out.println("</html>");        
    }
}
