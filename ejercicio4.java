/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosmodulo1;

import java.util.Scanner;

/**
 *Dada una cantidad de grados centígrados se debe mostrar 
 * su equivalente en grados Fahrenheit. 
 * La fórmula correspondiente es: F = 32 + (9 * C / 5).
 * @author Usuario
 */
public class ejercicio4 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese los grados centigrados a evaluar");
        double cent = leer.nextDouble();
        double fah;
        fah = (cent * 9/5) + 32;
        System.out.println("los grados Fahrenheit son : " + fah + "°F");
    }
}
