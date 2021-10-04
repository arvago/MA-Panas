package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/CarritoServlet")
public class CarritoServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // Creamos sesion 
        response.setContentType("text/html;charset=utf-8");

        HttpSession sesion = request.getSession();
        // Procesar artículos existentes
        class art {

            String nombre;
            int cantidad;

            public String getNombre() {
                return this.nombre;
            }

            public void setNombre(String nombre) {
                this.nombre = nombre;
            }

            public int getCantidad() {
                return this.cantidad;
            }

            public void setCantidad(int cantidad) {
                this.cantidad = cantidad;
            }
        }
        List<String> articulos = (List<String>) sesion.getAttribute("articulos");
        int cont = 0;
        // Verficar si la articulos existe
        if (articulos == null) {
            //Inicializamos la lista
            articulos = new ArrayList<>();
            sesion.setAttribute("articulos", articulos);
        }
        // Procesamos el artículo
        String articuloNuevo = request.getParameter("articulo");

        // Revisar y agregar el artículo nuevo
        if (articuloNuevo != null) {
            if (articulos.isEmpty()) {
                System.out.println("Nuevo");
                articulos.add(articuloNuevo);
                System.out.println("Tamaño: " + articulos.size());
            } else {

                articulos.add(articuloNuevo);

            }

        }
        List<String> nombreSinDuplicados = articulos
                .stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(articulos);
        try ( PrintWriter out = response.getWriter()) {
            out.print("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css\">");
            out.print("<link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">");
            out.print("<script src=\"https://code.jquery.com/jquery-3.6.0.min.js\"\n" + " integrity=\"sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=\" crossorigin=\"anonymous\"></script>");
            out.print("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js\"></script>");
            out.print("<link rel=\"stylesheet\" href=\"recursos/estilos.css\"/>");
            out.print("<h1> Lista de artículos</h1>");
            out.print("<br>");
            // Iterar articulos
            out.print("<table class=\"striped \">");
            for (String articulo : nombreSinDuplicados) {
                cont = 0;
                for (String c : articulos) {
                    if (articulo.equals(c)) {
                        cont++;
                    }
                }

                out.print("<tr>");
                out.print("<td>");
                out.print(cont);
                out.print("</td>");
                out.print("<td>");
                out.print(articulo);
                out.print("</td>");
                out.print("</tr>");

            }
            out.print("</table>");
            out.print("<br>");
            out.print("<a href='/CarritoCompras'>Regresar al inicio</a>");
        }

    }
}
