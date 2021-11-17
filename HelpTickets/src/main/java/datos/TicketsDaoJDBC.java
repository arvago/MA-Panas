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
    private static final String SQL_SELECT = "SELECT * FROM help_tickets.ticket;";
    
     public List<Ticket> listar() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Ticket tick = null;
        List<Ticket> tickets = new ArrayList<>();
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
//            stmt.setString(1, ticket.getUsername());
//            stmt.setString(2, ticket.getPassword());
            rs = stmt.executeQuery();
            while (rs.next()) {
                int idTicket = rs.getInt("idTicket");
                String idArea = rs.getString("idArea");
                int idUserU = rs.getInt("idUserU");
                int idUserA = rs.getInt("idUserA");
                int status = rs.getInt("status");
                String topic = rs.getString("topic");
                String description = rs.getString("desccription");
                int priority = rs.getInt("priority");

                tick = new Ticket(  idTicket,  topic,  description,  idArea,  status,  idUserU, idUserA,  priority);
                System.out.println(tick);
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
}
