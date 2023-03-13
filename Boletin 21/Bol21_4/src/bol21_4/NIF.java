/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package bol21_4;

import java.util.Scanner;

/**
 *
 * @author JayBGB
 */
public class NIF {

    public void calcularLetra(){
    
        Scanner input = new Scanner(System.in);
        
        System.out.print("Introduce tu número de DNI: ");
        int dni = input.nextInt();
        
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        
        int resto = dni % 23;
        
        System.out.println("Tu letra de NIF es: " + letras[resto]);
    }
}
