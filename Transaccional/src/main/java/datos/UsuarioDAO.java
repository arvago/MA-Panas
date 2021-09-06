package datos;

import static datos.Conexion.close;
import static datos.Conexion.getConnection;
import domain.Persona;
import domain.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {

    private Connection conexionTransaccional;

    // SQL Statements
    private static final String SQL_SELECT = "SELECT id, nombreUsuario, contraseña FROM prueba.usuario";
    private static final String SQL_INSERT = "INSERT INTO prueba.usuario(nombreUsuario, contraseña) VALUES(?,?)";
    private static final String SQL_UPDATE = "UPDATE prueba.usuario SET nombreUsuario = ?, contraseña = ? WHERE id = ?";
    private static final String SQL_DELETE = "DELETE FROM prueba.usuario WHERE id=?";

    public UsuarioDAO() {

    }

    // Maneja la sesión de la conexión transaccional
    public UsuarioDAO(Connection conexionTransaccional) {
        this.conexionTransaccional = conexionTransaccional;
    }

    public List<Usuario> seleccionar() {
        //Inicializar parametros de conexión
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Usuario usuario = null;

        List<Usuario> usuarios = new ArrayList<>();

        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();

            while (rs.next()) {
                //Obtener los atributos de cada usuario en la BD
                int id = rs.getInt("id");              
                String nombreUsuario = rs.getString("nombreUsuario");
                String contraseña = rs.getString("contraseña");

                usuario = new Usuario(id, nombreUsuario, contraseña);

                usuarios.add(usuario);
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } // Cerrar todos los objetos
        finally {
            try {
                Conexion.close(rs);
                Conexion.close(stmt);
                // Si la conexión es externa entonces se cierra de forma externa sino se cierra dentro de DAO
                if (this.conexionTransaccional == null) {
                    Conexion.close(conn);
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);

            }
        }
        return usuarios;
    }

    public int insertar(Usuario usuario) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0; // Saber cuantos registros se han actualizado
        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            //debido a los campos que se insertan se trabaja con tipo String
            stmt.setString(1, usuario.getUsername());//?
            stmt.setString(2, usuario.getPassword());//?
            

            // Ejecutar sentencia
            registros = stmt.executeUpdate(); // modifica el estado de la base de datos (insert, delete, update)
        } //        } catch (SQLException ex) {
        //            ex.printStackTrace(System.out);
        //        } 
        finally {
            try {
                close(stmt);
                if (this.conexionTransaccional == null) {
                    Conexion.close(conn);
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }

    public int actualizar(Usuario usuario) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0; // Saber cuantos registros se han actualizado
        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, usuario.getUsername());//?
            stmt.setString(2, usuario.getPassword());//?
            stmt.setInt(3, usuario.getId_usuario()); // Where id_persona = ?

            // Ejecutar sentencia
            registros = stmt.executeUpdate(); // modifica el estado de la base de datos (insert, delete, update)

        } //        catch (SQLException ex) {
        //            ex.printStackTrace(System.out);
        //        } 
        finally {
            try {
                close(stmt);
                if (this.conexionTransaccional == null) {
                    Conexion.close(conn);
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }

    public int eliminar(int id) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0; // Saber cuantos registros se han actualizado
        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, id);

            // Ejecutar sentencia
            registros = stmt.executeUpdate(); // modifica el estado de la base de datos (insert, delete, update)

        } //        catch (SQLException ex) {
        //            ex.printStackTrace(System.out);
        //        } 
        finally {
            try {
                close(stmt);
                if (this.conexionTransaccional == null) {
                    Conexion.close(conn);
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }

}
