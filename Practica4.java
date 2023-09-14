/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica4;
import java.util.Scanner;

public class Practica4 {

    
    public static void main(String[] args) 
    {
       Scanner conversion = new Scanner (System.in);
       
        System.out.println("Ingresa el valor en pesos");
        int pesos= conversion.nextInt();
      
      double precioDolar= pesos/17;
      double precioEuro= pesos/18;
         
      
       
        System.out.println("El equivalente en dolares es: " + precioDolar );
        System.out.println("El equivalente en euros es:  "+ precioEuro);
        
        conversion.close();
        
    }
    
}
