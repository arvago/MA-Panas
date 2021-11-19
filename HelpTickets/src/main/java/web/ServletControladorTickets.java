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
String role;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String accion = request.getParameter("accion");
        if (accion != null) {
            switch (accion) {
                case "admin":
                    this.showOperatives(request, response);
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
        List<Ticket> tickets = new TicketsDaoJDBC().listar(2);
        System.out.println("tickets = " + tickets);
        HttpSession sesion = request.getSession();
        sesion.setAttribute("tickets", tickets);
        sesion.setAttribute("titulo", "Operativos");
         role =(String)sesion.getAttribute("role");
        request.getRequestDispatcher("Tickets.jsp").forward(request, response);
        response.sendRedirect("Tickets.jsp");
    }
    
    private void showOperatives(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        List<Ticket> tickets = new TicketsDaoJDBC().listar(1);
        System.out.println("tickets = " + tickets);
        HttpSession sesion = request.getSession();
        sesion.setAttribute("tickets", tickets);
        sesion.setAttribute("titulo", "Administrativos");
        role =(String)sesion.getAttribute("role");
        request.getRequestDispatcher("Tickets.jsp").forward(request, response);
        response.sendRedirect("Tickets.jsp");
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion = request.getParameter("accion");
        if (accion != null) {
            switch (accion) {      
                case "insertar":
                    this.insertarTicket(request, response);
                    break;
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
    
    private void insertarTicket(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //recuperamos los valores del formulario agregaUsuario
        HttpSession sesion = request.getSession();
        String topic = request.getParameter("topic");
        System.out.println(request.getParameter("area"));
        int area = Integer.parseInt(request.getParameter("area"));
        String description = request.getParameter("description");
        int idUsuario = (int)sesion.getAttribute("idUserLogged");
        
        //Creamos el objeto de usuario (modelo)
        Ticket ticket = new Ticket(topic, description, area, 0, idUsuario, 0, 3);
        
        int registrosModificados = new TicketsDaoJDBC().insertar(ticket);
        
        //Redirigimos hacia accion por default
        this.accionDefault(request, response);
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
        request.getRequestDispatcher("index2.jsp").forward(request, response);
        response.sendRedirect("index2.jsp");
    }
}
