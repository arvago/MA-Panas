package web;

import datos.CompraDaoJDBC;
import dominio.Compra;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/ServletControladorCompras")
public class ServletControladorCompras extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     
        String accion = request.getParameter("accion");
        if (accion != null) {
            switch (accion) {
                case "editar":
                    this.editarCompra(request, response);
                    break;
                case "eliminar":
                    this.eliminarCompra(request, response);
                    break;
                case "obtenerPorCliente":
                    this.listarPorCliente(request, response);
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
        List<Compra> compras = new CompraDaoJDBC().listar();
        System.out.println("compras = " + compras);
        HttpSession sesion = request.getSession();
        sesion.setAttribute("compras", compras);
        request.getRequestDispatcher("compras.jsp").forward(request, response);
        response.sendRedirect("compras.jsp");
    }

    private void editarCompra(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //recuperamos el idCompra
        int idCompra = Integer.parseInt(request.getParameter("idCompra"));
        Compra compra = new CompraDaoJDBC().encontrar(new Compra(idCompra));
        request.setAttribute("compra", compra);
        String jspEditar = "/WEB-INF/paginas/compra/editarCompra.jsp";
        // se crea ruta para navegar y que despecha el servlet
        request.getRequestDispatcher(jspEditar).forward(request, response);
    }
    
    
    private void listarPorCliente(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //recuperamos el idCompra
        String idClienteString = request.getParameter("idCliente");
        int idCliente = Integer.parseInt(idClienteString);
        List<Compra> compras = new CompraDaoJDBC().encontrarPorId(new Compra(idCliente));
        request.setAttribute("compras", compras);
        //String jspEditar = "/WEB-INF/paginas/compra/editarCompra.jsp";
        // se crea ruta para navegar y que despecha el servlet
        request.getRequestDispatcher("compras.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion = request.getParameter("accion");
        if (accion != null) {
            switch (accion) {
                case "insertar":
                    this.insertarCompra(request, response);
                    break;
                case "modificar":
                    this.modificarCompra(request, response);
                    break;
                default:
                    this.accionDefault(request, response);
            }
        } else {
            this.accionDefault(request, response);
        }
    }

    private void insertarCompra(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //recuperamos los valores del formulario agregarCompra
        String idClienteString = request.getParameter("cliente");
        int idCliente = Integer.parseInt(idClienteString);
        String producto = request.getParameter("producto");
        double saldo = 0;
        String precio = request.getParameter("total");
        if (precio != null && !"".equals(precio)) {
            saldo = Double.parseDouble(precio);
        }

        //Creamos el objeto de compra (modelo)
        Compra compra = new Compra(idCliente, producto, saldo);

        //Insertamos el nuevo objeto en la base de datos
        int registrosModificados = new CompraDaoJDBC().insertar(compra);
        System.out.println("registrosModificados = " + registrosModificados);

        //Redirigimos hacia accion por default
        this.accionDefault(request, response);
    }

    private void modificarCompra(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //recuperamos los valores del formulario editarCompra
        int idCompra = Integer.parseInt(request.getParameter("idCompra"));
        String producto = request.getParameter("producto");
        String idClienteString = request.getParameter("cliente");
        int idCliente = Integer.parseInt(idClienteString);

        double saldo = 0;
        String precio = request.getParameter("precio");
        if (precio != null && !"".equals(precio)) {
            saldo = Double.parseDouble(precio);
        }

        //Creamos el objeto de cliente (modelo)
        Compra compra = new Compra(idCompra, idCliente, producto, saldo);

        //Modificar el  objeto en la base de datos
        int registrosModificados = new CompraDaoJDBC().actualizar(compra);
        System.out.println("registrosModificados = " + registrosModificados);

        //Redirigimos hacia accion por default
        this.accionDefault(request, response);
    }
    
    
    
        private void eliminarCompra(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //recuperamos los valores del formulario editarCompra
        int idCompra = Integer.parseInt(request.getParameter("idCompra"));
     

        //Creamos el objeto de cliente (modelo)
        Compra compra = new Compra(idCompra);

        //Eliminamos el  objeto en la base de datos
        int registrosModificados = new CompraDaoJDBC().eliminar(compra);
        System.out.println("registrosModificados = " + registrosModificados);

        //Redirigimos hacia accion por default
        this.accionDefault(request, response);
    }

}
