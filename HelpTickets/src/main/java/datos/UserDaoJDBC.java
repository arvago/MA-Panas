package datos;

import dominio.User;
import java.sql.*;
import java.util.*;

public class UserDaoJDBC {
    private static final String SQL_SELECT = "SELECT * FROM user WHERE (username = ? AND password = ?) ";
    private static final String SQL_INSERT = "INSERT INTO user(name, lastName, username, password, role) "
            + " VALUES(?, ?, ?, ?, ?)";
    
    public List<User> validar(User user) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        User usuario = null;
        List<User> usuarios = new ArrayList<>();
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            stmt.setString(1, user.getUsername());
            stmt.setString(2, user.getPassword());
            rs = stmt.executeQuery();
            while (rs.next()) {
                int idUser = rs.getInt("idUser");
                String nombre = rs.getString("name");
                String apellido = rs.getString("lastname");
                String username = rs.getString("username");
                String role = rs.getString("role");

                usuario = new User(idUser, nombre, apellido, username, null, role);
                usuarios.add(usuario);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return usuarios;
    }
    
    public int insertar(User user) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, user.getName());
            stmt.setString(2, user.getLastName());
            stmt.setString(3, user.getUsername());
            stmt.setString(4, user.getPassword());
            stmt.setString(5, user.getRole());

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
