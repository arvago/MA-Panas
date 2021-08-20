package test;

import domain.Empleado;
import domain.Cliente;
public class test {
    public static void main(String[] args) {
       Empleado empleado = new Empleado("Juan", 30000);
       System.out.println("Empleado: " + empleado);       
       Empleado empleado1 = new Empleado("Jose", 36000);
       System.out.println("Empleado 2: " + empleado1);
     
       Cliente cliente = new Cliente("Luis", "2021-08-20", true);
       System.out.println("Cliente: " + cliente);       
       Cliente cliente1 = new Cliente("Pedro", "2020-08-20", false);
       System.out.println("Cliente 2: " + cliente1);
   }
}
