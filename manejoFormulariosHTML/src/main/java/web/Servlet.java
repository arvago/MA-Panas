package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");
        String tecnologias[] = request.getParameterValues("tecnologia");
        String genero = request.getParameter("genero");
        String ocupacion = request.getParameter("ocupacion");
        String musica[] = request.getParameterValues("musica");
        String comentarios = request.getParameter("comentarios");
        
        

        if(comentarios.isEmpty()){
            comentarios = "Not available 😪";
        }
        
        if(genero.equals("Mixed")){
            genero = "Half & Half";
        }
        
        
      //  String bootstrapLink = "https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css/";
        
        out.print("<!DOCTYPE html>");
        out.print("<html lang=\"en\">");
        out.print("<head>");
        out.print("<title>Info User JEE</title>");
        out.print("<meta charset=\"UTF-8\">");
        out.print("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css\">");
        out.print("<link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">");
        out.print("<script src=\"https://code.jquery.com/jquery-3.6.0.min.js\"\n"+" integrity=\"sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=\" crossorigin=\"anonymous\"></script>");
        out.print("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js\"></script>");
        out.print("</head>");
        out.print("<body>");
        out.print("<div style=\"display: grid; place-content: initial\">");
        out.print("<div class=\"card-panel cyan lighten-5 \" style=\"width: 40rem; display: flexbox; align-content: flex-start;\">");
        out.print("<h5>User Info</h5>");
        out.print("<table class=\"striped \">");
        out.print("<thead>");
        out.print("<tr>");
        out.print("<th >Username:</th>");
        out.print("<td>"+usuario+"</td>");
        out.print("</tr>");
        out.print("</thead>");
        out.print("<tbody>");
        out.print("<tr>");
        out.print("<th>Password:</th>");
        out.print("<td>"+password+"</td>");
        out.print("</tr>");
        out.print("<tr>");
        out.print("<th>Technologies Types:</th>");
        out.print("<td>"+Arrays.toString(tecnologias).replace("[","").replace("]","")+"</td>");
        out.print("</tr>");
        out.print("<tr>");
        out.print("<th>Gender:</th>");
        out.print("<td>"+genero+"</td>");
        out.print("</tr>");
        out.print("<tr>");
        out.print("<th>Job:</th>");
        out.print("<td>"+ocupacion+"</td>");
        out.print("</tr>");
        out.print("<tr>");
        out.print("<th>Favorite Music:</th>");
        out.print("<td>"+Arrays.toString(musica).replace("[","").replace("]","")+"</td>");
        out.print("</tr>");
        out.print("<tr>");
        out.print("<th>Comments:</th>");
        out.print("<td>"+comentarios+"</td>");
        out.print("</tr>");
        out.print("</tbody>");
        out.print("</table>");
        out.print("</div>");
        out.print("</div>");
        out.print("</body>");
        out.print("</html>");
        
        
        
      /*
        out.print("<html>");
        out.print("<head>");
        out.print("<title>Respuesta Servlet</title>");
        out.print("<link ");
        out.print("href=\""+bootstrapLink+"\"");
        out.print("rel=\"stylesheet\"");
        out.print("integrity=\"sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU\"");
        out.print("crossorigin=\"anonymous\"");
        out.print("/>");
        
        
        out.print("</head>");
        out.print("<body>");
        out.print("<h1>Parámetros procesados del Servlet</h1>");
        
        out.print("<table class=\"table\">");
        out.print("<tr>");
        out.print("<th>"+"Username:"+"</th>");
        out.print("</tr>");
        out.print("<tr>");
        out.print("<th>"+usuario+"</th>");
        out.print("</tr>");
        
        out.print("<th>"+"Password:"+"</th>");
        out.print("</tr>");
        out.print("<tr>");
        out.print("<th>"+password+"</th>");
        out.print("</tr>");
        
        out.print("<th>"+"Tech:"+"</th>");
        out.print("</tr>");
        out.print("<tr>");
        out.print("<th>"+Arrays.toString(tecnologias).replace("[","").replace("]","")+"</th>");
        out.print("</tr>");
        
        out.print("<th>"+"Gender:"+"</th>");
        out.print("</tr>");
        out.print("<tr>");
        out.print("<th>"+genero+"</th>");
        out.print("</tr>");
        
         out.print("<th>"+"job:"+"</th>");
        out.print("</tr>");
        out.print("<tr>");
        out.print("<th>"+ocupacion+"</th>");
        out.print("</tr>");
        
        out.print("<th>"+"Music:"+"</th>");
        out.print("</tr>");
        out.print("<tr>");
        out.print("<th>"+Arrays.toString(musica).replace("[","").replace("]","")+"</th>");
        out.print("</tr>");
        
        
        out.print("<th>"+"Comments:"+"</th>");
        out.print("</tr>");
        out.print("<tr>");
        out.print("<th>"+comentarios+" :(" +"</th>");
        out.print("</tr>");
        
        out.print("</table>");
        
        
        out.print("</body>");
        out.print("</html>");*/
    }
    
}