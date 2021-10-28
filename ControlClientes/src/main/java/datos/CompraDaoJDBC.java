package datos;

import dominio.Cliente;
import dominio.Compra;
import java.sql.*;
import java.util.*;

public class CompraDaoJDBC {

    private static final String SQL_SELECT = "SELECT id_compras, id_cliente, precio, producto "
            + " FROM compras";

    private static final String SQL_SELECT_BY_ID = "SELECT id_compras, id_cliente, precio, producto "
            + " FROM compras WHERE id_compras = ?";

    private static final String SQL_INSERT = "INSERT INTO compras(id_cliente, precio, producto) "
            + " VALUES(?, ?, ?)";

    private static final String SQL_UPDATE = "UPDATE compras "
            + " SET id_cliente=?, precio=?, producto=? WHERE id_compras=?";

    private static final String SQL_DELETE = "DELETE FROM compras WHERE id_compras = ?";

    public List<Compra> listar() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Compra compra = null;
        List<Compra> compras = new ArrayList<>();
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int idCompra = rs.getInt("id_compras");
                int idCliente = rs.getInt("id_cliente");
                double precio = rs.getDouble("precio");
                String producto = rs.getString("producto");

                compra = new Compra(idCompra, idCliente, producto, precio);
                compras.add(compra);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return compras;
    }

    public Compra encontrar(Compra compra) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT_BY_ID);
            stmt.setInt(1, compra.getIdCompra());
            rs = stmt.executeQuery();
            rs.absolute(1);//nos posicionamos en el primer registro devuelto

            int idCliente = rs.getInt("id_cliente");
            double precio = rs.getDouble("precio");
            String producto = rs.getString("producto");

            compra.setIdCliente(idCliente);
            compra.setSaldo(precio);
            compra.setproducto(producto);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return compra;
    }

    public int insertar(Compra compra) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setInt(1, compra.getIdCliente());
            stmt.setDouble(2, compra.getSaldo());
            stmt.setString(3, compra.getProducto());

            rows = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    }

    public int actualizar(Compra compra) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setInt(1, compra.getIdCliente());
            stmt.setDouble(2, compra.getSaldo());
            stmt.setString(3, compra.getProducto());
            stmt.setInt(4, compra.getIdCompra());

            rows = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    }

    public int eliminar(Compra compra) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, compra.getIdCompra());

            rows = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    }

}
