
package metodos;

import java.lang.Math;
/**
 *
 * @author luis_
 */
public class metodosSobrecargados {
    
    public static double area(int a, int b){
       
        System.out.println("Cuadrado");
         return a*b;
    }
    public static double area(double a, double b){
        System.out.println("Triángulo");
        return (a*b)/2;
    }
    public static double area(double b){
        b = Math.PI*Math.pow(b,2);
        System.out.println("Círculo");
        return b;
    }
}
