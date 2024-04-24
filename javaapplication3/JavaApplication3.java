/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author 34627
 */

import java.util.Scanner;

public class JavaApplication3 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 
        String dia, resultado;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un dia de la semana: ");        
        dia = teclado.nextLine();        
        // resultado ="";
              
        switch (dia) {
            // dias laborables 
            case "lunes":
            case "martes":
            case "miércoles":
            case "jueves":
            case "viernes":
                resultado = "día laborable";
                break;
            case "sábado":
            case "domingo":
                resultado = "fin de semana";
                break;
            default:
                resultado = "día no válido";
        }
        System.out.println(resultado);
    }
    
    
}
