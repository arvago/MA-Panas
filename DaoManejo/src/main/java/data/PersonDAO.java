
package data;

import static data.Conexion.getConnection;
import domain.Person;
import java.util.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PersonDAO {
    Person p = new Person();
    Scanner sc = new Scanner(System.in);
    
    private static final String SQL_SELECT = "SELECT id_person, name, lastName, email, phone FROM pruebajdbc.person";
    private  final String SQL_DELETE = "DELETE FROM pruebajdbc.person WHERE id_person = ?";
    
    //Method that returns a object list of Person type "Person.java"
    
    public List<Person> select(){
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Person person = null;
        
        List<Person> people = new ArrayList<>();
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                //Get attributes of each user db
                int idPersona = rs.getInt("id_person");
                String name = rs.getString("name");
                String lastname = rs.getString("lastName");
                String email = rs.getString("email");
                String phone = rs.getString("phone");
                
                person = new Person(idPersona, name, lastname, email, phone);
                people.add(person);
            }
            
        } catch (SQLException ex) {
           ex.printStackTrace(System.out);
        }
        //Close all objects
        finally{
            try {
                Conexion.close(rs);
                Conexion.close(stmt);
                Conexion.close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return people;
    }
    
    
    public void delete(int id) {
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, id);
            stmt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } //Close all objects
        finally {
            try {
                System.out.println("A person was removed");
                Conexion.close(stmt);
                Conexion.close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
    }
    

}
