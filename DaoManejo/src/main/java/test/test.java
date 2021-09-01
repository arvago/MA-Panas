package test;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class test {

    public static void main(String[] args) {
        //Connection String
        var url = "jdbc:mysql://localhost:3306/pruebajdbc?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";

        try {
            // Web Interface
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection connection = DriverManager.getConnection(url, "root", "hola123");
            
            Statement instruction = connection.createStatement();
            
            var sql = "SELECT id_person, name, lastName, email, phone FROM pruebajdbc.person";
            
            ResultSet  result = instruction.executeQuery(sql);//execute the query of the instruction
            
            //to step through the elements of the query
            while(result.next()){
                System.out.println("ID person" + result.getString("id_person"));
                System.out.println("Name: " + result.getString("name"));
                System.out.println("Last Name: " + result.getString("lastName"));
                System.out.println("Email: " + result.getString("email"));
                System.out.println("Phone: " + result.getString("phone"));
                System.out.println("\n");
            }
            //Log out
            result.close();
            instruction.close();
            connection.close();

        } catch (ClassNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }

    }
}
