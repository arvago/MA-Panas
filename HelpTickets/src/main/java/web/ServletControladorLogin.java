package web;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/login")
public class ServletControladorLogin extends HttpServlet{
    
     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     
        String accion = request.getParameter("accion");
        if (accion != null) {
            switch (accion) {
                case "editar":
                   // this.editarCompra(request, response);
                    break;
                case "eliminar":
                   // this.eliminarCompra(request, response);
                    break;
                case "obtenerPorCliente":
                   // this.listarPorCliente(request, response);
                    break;
                default:
                    this.abrirLogin(request, response);
            }
        } else {
            this.abrirLogin(request, response);
        }
    }
    
    private void abrirLogin(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("login.jsp").forward(request, response);
        response.sendRedirect("login.jsp");
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion = request.getParameter("accion");
        if (accion != null) {
            switch (accion) {
                case "validar":
                    //this.insertarCompra(request, response);
                    break;
                case "insertar":
                    System.out.println("Si llega");
                    //this.modificarCompra(request, response);
                    break;
                default:
                    this.abrirLogin(request, response);
            }
        } else {
            this.abrirLogin(request, response);
        }
    }
}
