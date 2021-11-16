package web;

import dominio.User;
import datos.UserDaoJDBC;
import java.io.IOException;
import java.io.PrintWriter;
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
                    this.validarUsuario(request, response);
                    break;
                case "insertar":
                    this.insertarUsuario(request, response);
                    break;
                default:
                    this.abrirLogin(request, response);
            }
        } else {
            this.abrirLogin(request, response);
        }
    }
    
    private void insertarUsuario(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        //recuperamos los valores del formulario agregaUsuario
        String nombre = request.getParameter("name");
        String apellido = request.getParameter("lastName");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String role = "Usuario";
        
        //Creamos el objeto de usuario (modelo)
        User user = new User(nombre, apellido, username, password, role);
        
        
        int registrosModificados = new UserDaoJDBC().insertar(user);
        if(registrosModificados > 0){
            System.out.println("Usuario Registrado");
        } else {
            System.out.println("Usuario No se registró");
        }
        
        //Redirigimos hacia accion por default
        this.abrirLogin(request, response);
    }
    
    private void validarUsuario(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        HttpSession sesion = request.getSession();
        //recuperamos los valores del formulario validarLogin
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        User user = new User(username, password);
        
        List<User> usuarios = new UserDaoJDBC().validar(user);
        if(usuarios.size() > 0){
            System.out.println("Usuario Encontrado");
            int id = usuarios.get(0).getIdUser();
            String name = usuarios.get(0).getName();
            String lastName = usuarios.get(0).getLastName();
            String role = usuarios.get(0).getRole();
            sesion.setAttribute("idUserLogged", id);
            sesion.setAttribute("name", name);
            sesion.setAttribute("lastName", lastName);
            sesion.setAttribute("username", username);
            sesion.setAttribute("role", role);
            request.getRequestDispatcher("index2.jsp").forward(request, response);
            response.sendRedirect("index2.jsp");
        }else{
            System.out.println("Usuario No Encontrado");
            request.getRequestDispatcher("index.jsp").forward(request, response);
            response.sendRedirect("index.jsp");
        }
        
    }
}
