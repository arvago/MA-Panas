/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import static Datos.Conexion.getConnection;
import domain.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rocky
 */
public class UsuarioDAO {
    private static final String SQL_SELECT = "SELECT * FROM pruebajdbc.usuario";
    private static final String SQL_INSERT = "INSERT INTO pruebajdbc.usuario (username,password) VALUES (?,?)";
    private static final String SQL_UPDATE = "UPDATE pruebajdbc.usuario SET username = ?, password = ? WHERE id_usuario = ?";
    private static final String SQL_REMOVE = "DELETE FROM pruebajdbc.usuario WHERE id_usuario = ?";
    
    public List<Usuario> select(){
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Usuario usuario = null;
        
        List<Usuario> usuarios = new ArrayList<>();
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                int idUsuario = rs.getInt("id_usuario");
                String username = rs.getString("username");
                String password = rs.getString("password");                
                usuario = new Usuario(idUsuario, username, password);
                usuarios.add(usuario);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            try {
                //CERRAR TODOS LOS OBJETOS
                Conexion.close(rs);
                Conexion.close(stmt);
                Conexion.close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return usuarios;
    } 
    
    public int insert(Usuario usuario) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int records = 0; 
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            
            stmt.setString(1, usuario.getUsername());
            stmt.setString(2, usuario.getPassword());           

            records = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                Conexion.close(stmt);
                Conexion.close(conn);
            } catch (Exception ex) {
                ex.printStackTrace(System.out);
            }
            return records;
        }
    }
    
    public int update(Usuario usuario) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int records = 0; 
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);

            stmt.setString(1, usuario.getUsername());
            stmt.setString(2, usuario.getPassword());
            stmt.setInt(3, usuario.getIdUsuario());

            //Execute statement
            records = stmt.executeUpdate(); 
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                System.out.println("Usuario actualizado!");
                Conexion.close(stmt);
                Conexion.close(conn);
            } catch (Exception ex) {
                ex.printStackTrace(System.out);
            }
            return records;
        }
    }
    
    public int delete(int usuario) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int records = 0; 
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_REMOVE);

            stmt.setInt(1, usuario);

            //Execute statement
            records = stmt.executeUpdate(); 
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                System.out.println("Usuario Eliminado!!!");
                Conexion.close(stmt);
                Conexion.close(conn);
            } catch (Exception ex) {
                ex.printStackTrace(System.out);
            }
            return records;
        }
    }
}
