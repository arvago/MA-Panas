package web;

import java.io.IOException;
import dominio.Ticket;
import datos.TicketsDaoJDBC;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author luis_
 */
@WebServlet("/tickets")
public class ServerletControladorTickets extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String accion = request.getParameter("accion");
        if (accion != null) {
            switch (accion) {
                case "editar":
//                    this.editarCompra(request, response);
                    break;
                case "eliminar":
//                    this.eliminarCompra(request, response);
                    break;
                case "obtenerPorCliente":
//                    this.listarPorCliente(request, response);
                    break;
                default:
                    this.accionDefault(request, response);
            }
        } else {
            this.accionDefault(request, response);
        }
    }

    private void accionDefault(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        List<Ticket> compras = new TicketsDaoJDBC().listar();
//        System.out.println("compras = " + compras);
//        HttpSession sesion = request.getSession();
//        sesion.setAttribute("compras", compras);
        request.getRequestDispatcher("Tickets.jsp").forward(request, response);
        response.sendRedirect("Tickets.jsp");
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion = request.getParameter("accion");
        if (accion != null) {
            switch (accion) {                
                case "editarUser":
                    this.editarUser(request, response);
                    break;
                default:
                    this.accionDefault(request, response);
            }
        } else {
            this.accionDefault(request, response);
        }
    }
    
    private void editarUser(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

}
