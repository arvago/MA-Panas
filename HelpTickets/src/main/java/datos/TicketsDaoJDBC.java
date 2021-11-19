/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import dominio.Ticket;
import java.sql.*;
import java.util.*;

public class TicketsDaoJDBC {
    private static final String SQL_SELECT_TICKETS = "SELECT t.idTicket, t.topic, t.description, t.status, CONCAT(u.name, '', u.lastname) AS nombreUsuario " +
                                                    "FROM help_tickets.ticket t INNER JOIN help_tickets.user u ON u.idUser = t.idUserU WHERE t.idArea = ? ORDER BY t.priority ASC";
    private static final String SQL_INSERT = "INSERT INTO ticket(idArea, idUserU, status, topic, description, priority) "
            + " VALUES(?, ?, ?, ?, ?, ?)";
    
    public List<Ticket> listar(int area) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Ticket tick = null;
        List<Ticket> tickets = new ArrayList<>();
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT_TICKETS);
            stmt.setInt(1, area);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int idTicket = rs.getInt("idTicket");
                String topic = rs.getString("topic");
                String description = rs.getString("description");
                int status = rs.getInt("status");
                String nombreUsuario = rs.getString("nombreUsuario");

                tick = new Ticket(idTicket, topic, description, status, nombreUsuario);
                tickets.add(tick);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return tickets;
    }
    
    public int insertar(Ticket ticket) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setInt(1, ticket.getArea());
            stmt.setInt(2, ticket.getIdUserU());
            stmt.setInt(3, ticket.getStatus());
            stmt.setString(4, ticket.getTopic());
            stmt.setString(5, ticket.getDescription());
            stmt.setInt(6, ticket.getPriority());

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
