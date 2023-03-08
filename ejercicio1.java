/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosmodulo1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
  
        System.out.println("ingrese el primer numero entero : ");
        int num;
        num = leer.nextInt();
        System.out.println("ingrese el segundo numero entero : ");
        int num2;
        num2 = leer.nextInt();
        
        int num3;
        num3 = num + num2;
      
        System.out.println("la suma de los 2 numeros esteros es : " + num3);
    }
    
}
