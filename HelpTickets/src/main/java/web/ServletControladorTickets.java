package web;

import java.io.IOException;
import dominio.Ticket;
import datos.TicketsDaoJDBC;
import datos.UserDaoJDBC;
import dominio.User;
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
public class ServletControladorTickets extends HttpServlet{

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

        List<Ticket> tickets = new TicketsDaoJDBC().listar();
        System.out.println("tickets = " + tickets);
        HttpSession sesion = request.getSession();
        sesion.setAttribute("tickets", tickets);
        request.getRequestDispatcher("tickets.jsp").forward(request, response);
        response.sendRedirect("tickets.jsp");
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
        HttpSession sesion = request.getSession();
        int idUser = Integer.parseInt(request.getParameter("id"));
        String nombre = request.getParameter("name");
        String apellido = request.getParameter("lastName");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        if(password.length() == 0){
            password = null;
        }
        //Creamos el objeto de User (modelo)
        User user = new User(idUser, nombre, apellido, username, password);

        //Modificar el  objeto en la base de datos
        int registrosModificados = new UserDaoJDBC().actualizar(user);
        sesion.setAttribute("idUserLogged", idUser);
        sesion.setAttribute("name", nombre);
        sesion.setAttribute("lastName", apellido);
        sesion.setAttribute("username", username);
        this.accionDefault(request, response);
    }
}
