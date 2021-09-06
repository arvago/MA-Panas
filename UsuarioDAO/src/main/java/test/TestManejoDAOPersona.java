/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import Datos.PersonaDAO;
import domain.Persona;
import java.util.List;

public class TestManejoDAOPersona {
   public static void main(String[] args){
       PersonaDAO personaDao = new PersonaDAO();
       List<Persona> personas = personaDao.seleccionar();
       
       personas.forEach(persona -> {
           System.out.println(persona);
       });
   }
}
